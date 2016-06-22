package cn.homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 使用socket编写一个Java程序，要求：在客户端控制台使用键盘录入数据，直到控制台
 * 输入“over”结束录入，服务端循环接收客户端录入的数据，并将数据写入
 * “SocketDemo.txt”的文件中。
 * 
 * Server是服务端程序
 */
public class Server {
	public static void main(String[] args) throws IOException {
		//创建服务器,等待链接
		ServerSocket serverSocket = new ServerSocket(12306);
		Socket clientSocket = serverSocket.accept();
		
		//获取Socket的输入流,
		BufferedReader  in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		//创建目的地的字节输出流
		BufferedWriter textOut = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\test\\SocketDemo.txt",true)));
		//写入数据到文件
		String line = null;
		while ((line = in.readLine()) != null) {
			textOut.write(line);
			textOut.flush();
			System.out.println("输出了:" + line);
		}
		
		//反馈信息给客户端
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
		out.write("字符传入成功");
		
		//关闭流
		out.close();
		textOut.close();
		in.close();
		clientSocket.close();
	}
}
