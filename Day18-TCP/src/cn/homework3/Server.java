package cn.homework3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用socket编写一个Java程序，要求：客户端发送内容“我是客户端”到服务端，服务
 * 端接收后，在控制台上打印接收到的内容，并返回内容“我来自服务端”到客户端，客
 * 户端接收服务端的发送的内容后将接收内容打印在控制台
 * 
 * 这是服务端类
 */
public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(12306);
		Socket clientSocket = serverSocket.accept();
		
		//获取客户端的输入流,并打印
		InputStream in = clientSocket.getInputStream();
		byte[] buffer = new byte[1024];
		int len = in.read(buffer);
		System.out.println(new String(buffer, 0, len));
		//进行反馈
		OutputStream out = clientSocket.getOutputStream();
		out.write("我来自客户端".getBytes());
		
		out.close();
		clientSocket.close();
		in.close();
	}
}
