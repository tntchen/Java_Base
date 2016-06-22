package cn.homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 使用socket编写一个Java程序，要求：在客户端控制台使用键盘录入数据，直到控制台
 * 输入“over”结束录入，服务端循环接收客户端录入的数据，并将数据写入
 * “SocketDemo.txt”的文件中。
 * 
 * Client是客户端程序
 */
public class Client {
	public static void main(String[] args) throws IOException {
		//创建客户端Socket连接到服务器
		Socket socket = new Socket("127.0.0.1", 12306);
		//将Socket中的数据输出到服务器
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//将键盘输入传输到缓存区
		BufferedReader textIn = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("请输入字符:");
		//创建字符串存放键盘录入
		String line = null;
//		while ((line = textIn.readLine()) != null) {//
//			if ("over".equals(line)) {
//				break;
//			}
//			out.write(line);
//			out.newLine();
//			out.flush();
//			System.out.println("您输入的内容是：\""+ line +"\"正在存储中");
//		}
		while(true) {
			line = textIn .readLine();
			if ("quit".equals(line)) {
				break;
			}
			out.write(line);
			//out.write("\r\n");
			out.newLine();
			out.flush();
			
		}
		socket.shutdownOutput();
		//记录反馈信息
		BufferedReader  in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = in.readLine();
		System.out.println(str);
		
		
		//关闭流
		textIn.close();
		in.close();
		socket.close();
	}
}