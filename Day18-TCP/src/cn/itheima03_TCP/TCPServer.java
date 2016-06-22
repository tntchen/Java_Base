package cn.itheima03_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP服务器端
 * 
 * 1.创建服务器ServerSocket对象(指定服务器端口号)
 * 2.开启服务器,等待客户端的连接,当客户端连接后,可以获取到连接服务器的客户端Socket
 * 3.给客户端反馈信息
 * 	3.1获取客户端的输出流
 * 	3.2在服务端,通过客户端的输出流写出数据给客户端
 * 4.关闭流资源
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//创建服务器ServerSocket对象(指定服务器端口号)
		ServerSocket ss = new ServerSocket(8888);
		//开启服务器,等待客户端的连接,当客户端连接后,可以获取到连接服务器的客户端Socket
		Socket s = ss.accept();
		//给客户端反馈信息
		//获取客户端的输出流
		OutputStream out = s.getOutputStream();
		//在服务端,通过客户端的输出流写出数据给客户端
		out.write("你已经连接上了服务器".getBytes());
		out.close();
		
		s.close();
		//ss.close();
		
	}
}
