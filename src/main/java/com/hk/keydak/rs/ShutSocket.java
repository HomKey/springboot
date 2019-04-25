package com.hk.keydak.rs;

import com.hk.keydak.rs.util.CheckSumUtil;

import java.io.IOException;
import java.net.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by LuHj on 2018/9/12.
 */
public class ShutSocket {

    private void task(int port) throws SocketException {
// ups
        DatagramSocket upsSocket = new DatagramSocket(port);
        // 第一条指令
        byte[] commandData = new byte[]{0x06, 0x04, (byte) 0x88, 0x30, 0x68, 0x29, 0x00, 0x00, (byte) 0x84, 0x35, 0x00, (byte) 0xC0};

        // 第二条指令
        byte[] commandEndData = new byte[]{(byte) 0x84, (byte) 0x88, 0x00, 0x3A, 0x02, (byte) 0xF4, 0x01, 0x46, 0x10, 0x09, (byte) 0x92};

        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean isFinish = false;
                while (true){
                    try {
                        byte[] inBuff = new byte[4096];
                        DatagramPacket inPacket = new DatagramPacket(inBuff, inBuff.length);
                        upsSocket.receive(inPacket);
                        InetAddress inetAddress = inPacket.getAddress();
                        int targetPort = inPacket.getPort();
                        byte[] originalData = Arrays.copyOf(inPacket.getData(),inPacket.getLength());
                        System.out.println("ups receive" + Arrays.toString(originalData));
                        byte[] data = Arrays.copyOf(inPacket.getData(),inPacket.getLength());

                        // 连接
                        if (data.length == 1){
                            if (data[0] == 0x16){
                                System.out.println("ups connectPacket");
                                DatagramPacket connectPacket = new DatagramPacket(new byte[]{0x16},1, inetAddress, targetPort);
                                upsSocket.send(connectPacket);
                            }else if (data[0] == 0x06 && !isFinish){
                                // 继续发送直到完毕
                                System.out.println("ups commandEndPacket");
                                System.out.println("port: " + port);
                                DatagramPacket commandEndPacket = new DatagramPacket(commandEndData,commandEndData.length, inetAddress, targetPort);
                                upsSocket.send(commandEndPacket);
                                isFinish = true;
                            }else if (isFinish){
                                isFinish = false;
                            }
                        }else if (data.length > 1){
                            System.out.println("ups commandPacket");
                            int reportId = data[4] & 0xff;
                            Integer[] response = ShutDataTable.DB.get(reportId);
                            int len = 0;
                            for (int i = 0; i < response.length; i++) {
                                len += response[i];
                            }
                            byte[] randomData = new byte[len];
                            Random random=new Random();
                            random.nextBytes(randomData);
                            byte[] responseData = new byte[len+3];
                            responseData[0] = (byte)0x84;
                            responseData[1] = (byte)0x88;
                            responseData[responseData.length-1] = CheckSumUtil.Get_xor8(randomData);
                            System.arraycopy(randomData,0,responseData,2,randomData.length);
                            DatagramPacket commandPacket = new DatagramPacket(responseData,responseData.length, inetAddress, targetPort);
                            upsSocket.send(commandPacket);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }


    public static void main(String[] args) throws UnknownHostException, SocketException {
        ShutSocket shutSocket1 = new ShutSocket();
        ShutSocket shutSocket2 = new ShutSocket();
        ShutSocket shutSocket3 = new ShutSocket();
        ShutSocket shutSocket4 = new ShutSocket();
        shutSocket1.task(8310);
        shutSocket2.task(8311);
        shutSocket3.task(8312);
        shutSocket4.task(8313);
    }
}
