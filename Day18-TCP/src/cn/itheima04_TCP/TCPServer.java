package cn.itheima04_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器端
 * 1，创建服务器端ServerSocket对象，指定服务器端端口号
 * 2，开启服务器，等待着客户端Socket对象的连接，如有客户端连接，返回客户端的Socket对象
 * 3,通过客户端的Socket对象，获取客户端的输入流，为了实现获取客户端发来的数据
 * 4,通过客户端的输入流，获取流中的数据
 * 5,通过客户端的Socket对象，获取客户端的输出流，为了实现给客户端反馈信息
 * 6,通过客户端的输出流，写数据到流中
 * 7,关闭流资源
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//1，创建服务器端ServerSocket对象，指定服务器端端口号
		ServerSocket ss = new ServerSocket(6666);
		//2，开启服务器，等待着客户端Socket对象的连接，如有客户端连接，返回客户端的Socket对象
		System.out.println("等待客户端的连接：");
		Socket s = ss.accept();
		//3,通过客户端的Socket对象，获取客户端的输入流，为了实现获取客户端发来的数据
		/*
		 * 获取客户端的IP地址
		 * 获取客户端发来的数据
		 */
		//获取客户端的IP地址
		String ip = s.getInetAddress().getHostAddress();
		//获取客户端的Socket的输入流
		InputStream in = s.getInputStream();
		//获取客户端发来的数据
		byte[] inArray = new byte[1024];
		//把客户端的数据存储到数组中，同时记录字节的个数
		//4,通过客户端的输入流，获取流中的数据
		int length = in.read(inArray);
		//显示客户端发来的数据
		System.out.println("IP地址："+ip+",内容：" + new String(inArray, 0 , length));
		
		//5,通过客户端的Socket对象，获取客户端的输出流，为了实现给客户端反馈信息
		OutputStream out = s.getOutputStream();
		//6,通过客户端的输出流，写数据到流中
		out.write("您已经连接到服务器".getBytes());
		
		//7,关闭流资源
		out.close();
		in.close();
		s.close();
		//ss.close();
	}
}
