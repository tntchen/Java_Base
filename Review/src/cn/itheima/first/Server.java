package cn.itheima.first;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) throws IOException {
		//创建服务器,等待客户端连接
		ServerSocket serverSocket = new ServerSocket(12306);
		Socket clientSocket = serverSocket.accept();
		
		//获取Socket的输入流
		InputStream in = clientSocket.getInputStream();
		//创建字节输出流向目的地输出数据
		BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("E:\\test\\copyTest.jpg"));
		//将Socket中的数据写入目的地的输出流中
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			fileOut.write(buffer, 0, len);
		}
		//获取Socket的结束传输信息,将反馈信息给客户端
		OutputStream out = clientSocket.getOutputStream();
		out.write("传输成功".getBytes());
		
		out.close();
		fileOut.close();
		in.close();
		clientSocket.close();
	}
}
