package cn.homework3;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 * 使用socket编写一个Java程序，要求：客户端发送内容“我是客户端”到服务端，服务
 * 端接收后，在控制台上打印接收到的内容，并返回内容“我来自服务端”到客户端，客
 * 户端接收服务端的发送的内容后将接收内容打印在控制台
 * 
 * 这是客户端类
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket连接到服务器
		Socket socket = new Socket("192.168.2.104", 12306);
		//获取Socket的输出流
		OutputStream out = socket.getOutputStream();
		out.write("我是客户端".getBytes());
		//获取输入对象,读反馈信息
		InputStream in = socket.getInputStream();
		byte[] info = new byte[1024];
		int len = in.read(info);
		System.out.println(new String(info, 0, len));
		
		//关闭流
		socket.close();
		in.close();
		out.close();				
	}
}
