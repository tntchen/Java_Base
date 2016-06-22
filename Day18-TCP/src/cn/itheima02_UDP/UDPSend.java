package cn.itheima02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 使用UDP完成数据的发送
 * 发送端
 * 1.创建DatagranSocket对象
 * 2.创建DatagramPacket对象,并封装数据
 * 3.发送数据
 * 4.释放流资源
 */
public class UDPSend {
	public static void main(String[] args) throws IOException {
		DatagramSocket sendSocket = new DatagramSocket(12306);
		//创建DatagramPacket对象,并封装数据
		byte[] buffer = "hello,liubei".getBytes();
		DatagramPacket sendPacket = new DatagramPacket(buffer, buffer.length, 
				InetAddress.getByName("192.168.74.24"), 10000);
		//发送数据
		sendSocket.send(sendPacket);
		sendSocket.close();
	}
}
