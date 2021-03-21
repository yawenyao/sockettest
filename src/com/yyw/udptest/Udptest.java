package com.yyw.udptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Udptest {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象，（DatagramSocket）
        DatagramSocket datagramSocket = new DatagramSocket();
        //创建数据，并把数据打包
        //自己封装键盘录入数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            if("886".equals(line)){
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bys,bys.length, InetAddress.getByName("Win10-YawenYao"),12345);
            //调用DatagramSoket对象的方法发送数据
            datagramSocket.send(datagramPacket);
        }

        //关闭发送端
        datagramSocket.close();
    }
}
