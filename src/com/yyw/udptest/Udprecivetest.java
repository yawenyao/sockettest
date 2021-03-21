package com.yyw.udptest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Udprecivetest {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket 的对象，DatagramSocket对象
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        //创建一个数据包，用于接收数据
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bys, bys.length);
            //调用DatagramSocket对象的方法接收数据
            datagramSocket.receive(datagramPacket);
            //解析数据包，并把数据显示在控制台
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
            //关闭接收端
            //datagramSocket.close();
        }
    }
}
