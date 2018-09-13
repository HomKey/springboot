package com.hk.keydak.rs;

import com.hk.keydak.rs.util.CRCUtil;
import gnu.io.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;

/**
 * Created by LuHj on 2018/9/6.
 */
public class SerialEventListener implements SerialPortEventListener{

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

    public void start(){
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
                serialPort.setSerialPortParams(this.baudrate, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE );
            } catch (UnsupportedCommOperationException e) {
                e.printStackTrace();
            }
        } catch (NoSuchPortException e) {
            e.printStackTrace();
        } catch (PortInUseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TooManyListenersException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        //定义用于缓存读入数据的数组
        byte[] readBuffer = new byte[8];
        //如果是数据可用的时间发送，则进行数据的读写
        if(SerialPortEvent.DATA_AVAILABLE == serialPortEvent.getEventType()){
            try {
                int numBytes = -1;
                while(inputStream.available() > 0){
                    numBytes = inputStream.read(readBuffer);
                    if (numBytes == 8) {
                        if (CRCUtil.Volid_crc16(readBuffer)){

                        }
                        new String(readBuffer);
                        readBuffer = new byte[8];// 重新构造缓冲对象，否则有可能会影响接下来接收的数据
                    }
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private byte[] getResponse(byte[] commands){
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
