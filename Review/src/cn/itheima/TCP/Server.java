package cn.itheima.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(12306);
		Socket clientSocket = serverSocket.accept();
		
		OutputStream out = clientSocket.getOutputStream();
		InputStream inputStream = clientSocket.getInputStream();
		
		//在本地创建文件传输功能
	}
}
