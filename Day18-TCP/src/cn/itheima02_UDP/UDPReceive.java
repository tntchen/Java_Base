package cn.itheima02_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * UDP接收端
 * 1.创建DatagramSocket对象
 * 2.创建DatagramPacket对象
 * 3.接收数据存储到DatagramPacket中
 * 4.获取DatagramPacket的内容
 * 5.释放流资源
 */
public class UDPReceive {
	public static void main(String[] args) throws IOException {
		DatagramSocket rSocket = new DatagramSocket(12306);
		//创建DatagramPacket对象
		byte[] buffer = new byte[1024];
		DatagramPacket rPacket = new DatagramPacket(buffer, 1024);
		//接收数据存储到DatagramPacket中
		rSocket.receive(rPacket);
		//获取DatagramPacket的内容
		InetAddress address = rPacket.getAddress();
		System.out.println(address);
		byte[] data = rPacket.getData();
		String str = new String(data, 0, data.length);
		System.out.println(str);
	}
}
