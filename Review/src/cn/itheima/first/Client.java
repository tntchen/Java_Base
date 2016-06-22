package cn.itheima.first;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建客户端中的SOcket连接服务器
		Socket clientSocket = new Socket("192.168.2.110", 12306);
		//获取Socket中的输出流,把数据写到服务器中
		OutputStream out = clientSocket.getOutputStream();
		
		//创建字节输入流,读取数据
		BufferedInputStream fileIn = new BufferedInputStream(new FileInputStream("E:\\test\\test.jpg"));
		//把数据写入Socket的输出流中
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = fileIn.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		//输出完毕后停止socket的写入操作
		clientSocket.shutdownOutput();
		
		//获取server传来的输入流,读反馈信息
		InputStream in = clientSocket.getInputStream();
		byte[] info = new byte[1024];
		//显示反馈结果
		System.out.println(new String(info, 0, in.read(info)));
		
		out.close();
		fileIn.close();
		in.close();
		clientSocket.close();
	}
}
