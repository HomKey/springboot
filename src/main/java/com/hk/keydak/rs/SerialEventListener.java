package com.hk.keydak.rs;

import com.hk.keydak.rs.util.CRCUtil;
import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.TooManyListenersException;

/**
 * Created by LuHj on 2018/9/6.
 */
public class SerialEventListener implements SerialPortEventListener {

    CommPortIdentifier commPortIdentifier = null;//未打卡的端口
    SerialPort serialPort = null;//打开的端口
    InputStream inputStream = null;//输入流
    OutputStream outputStream;// 向串口输出的流

    private String portName;
    private int baudrate; // 波特率

    public SerialEventListener(String portName, int baudrate) {
        this.portName = portName;
        this.baudrate = baudrate;
    }

    public void start() {
        try {
            //获取串口、打开窗串口、获取串口的输入流。
            commPortIdentifier = CommPortIdentifier.getPortIdentifier(this.portName);
            serialPort = (SerialPort) commPortIdentifier.open(this.portName + "SerialPortEventListener", 1000);
            inputStream = serialPort.getInputStream();
            outputStream = serialPort.getOutputStream();
            //向串口添加事件监听对象。
            serialPort.addEventListener(this);
            //设置当端口有可用数据时触发事件，此设置必不可少。
            serialPort.notifyOnDataAvailable(true);
            try {
                serialPort.setSerialPortParams(this.baudrate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            } catch (UnsupportedCommOperationException e) {
                e.printStackTrace();
            }
        } catch (NoSuchPortException e) {
            System.out.println("端口" + this.portName + "不存在");
            e.printStackTrace();
        } catch (PortInUseException e) {
            System.out.println("端口" + this.portName + "已经被占用");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("打开端口" + this.portName + "失败");
            e.printStackTrace();
        } catch (TooManyListenersException e) {
            System.out.println("端口" + this.portName + "监听者过多");
            e.printStackTrace();
        }
    }

    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        //定义用于缓存读入数据的数组
        byte[] readBuffer = new byte[8];
        //如果是数据可用的时间发送，则进行数据的读写
        if (SerialPortEvent.DATA_AVAILABLE == serialPortEvent.getEventType()) {
            try {
                int numBytes = -1;
                while (inputStream.available() > 0) {
                    numBytes = inputStream.read(readBuffer);
                    if (numBytes == 8) {
                        if (CRCUtil.Volid_crc16(readBuffer)) {
                            if (readBuffer[0] == 0x01){
                                outputStream.write(new byte[]{0x01, 0x03, 0x2E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x0A, 0x0A, 0x02, (byte) 0xA4, 0x0A, (byte) 0xB6, 0x03, 0x38, 0x0A, 0x16, 0x02, (byte) 0xE2, 0x0E, (byte) 0xC1, 0x02, 0x42, 0x0B, (byte) 0x92, 0x02, (byte) 0xAA, 0x0F, 0x14, 0x02, 0x7B, 0x0A, (byte) 0x81, 0x02, 0x55, 0x0B, (byte) 0xF0, 0x02, 0x5C, 0x0E, (byte) 0xD5, 0x02, 0x45, 0x0C, 0x5E, 0x03, 0x3B, (byte) 0xF1, (byte) 0xEB});
                            }
                        }
                        System.out.println(Arrays.toString(readBuffer));
                        readBuffer = new byte[8];// 重新构造缓冲对象，否则有可能会影响接下来接收的数据
                    }
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private byte[] getResponse(byte[] commands) {
        return commands;
    }

//    private

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public int getBaudrate() {
        return baudrate;
    }

    public void setBaudrate(int baudrate) {
        this.baudrate = baudrate;
    }

}
