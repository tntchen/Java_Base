package cn.itheima04_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP 客户端
 * 
 * 1,创建客户端的Socket对象
 * 2,获取Socket的输出流对象
 * 3,写数据给服务器
 * 4,获取Socket的输入流对象
 * 5，使用输入流，读反馈信息
 * 6,关闭流资源
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
		//1,创建客户端的Socket对象
		Socket s = new Socket("192.168.74.105", 6666);
		// 2,获取Socket的输出流对象
		OutputStream out = s.getOutputStream();
		//3,写数据给服务器
		out.write("Hi,服务器".getBytes());
		//4,获取Socket的输入流对象
		InputStream in = s.getInputStream();
		//5，使用输入流，读反馈信息
		byte[] inArray = new byte[1024];
		//读取数据到数组中，并记录读取的长度
		int length = in.read(inArray);
		//显示反馈信息
		System.out.println(new String(inArray, 0 ,length));
		//6,关闭流资源
		in.close();
		out.close();
		s.close();
	}
}
