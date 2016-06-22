package cn.itheima05_TCP;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 文件上传-服务器
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
		//1.创建服务器,等待客户端连接
		ServerSocket serverSocket = new ServerSocket(8888);
		Socket clientSocket = serverSocket.accept();
		
		//显示哪个客户端Socket连接上了服务器
		InetAddress ipAddress = clientSocket.getInetAddress();
		String ip = ipAddress.getHostAddress();
		System.out.println("小样抓到你了" + "IP:" + ip);
		
		//7.获取Socket的输入流
		InputStream in = clientSocket.getInputStream();
		//8.创建目的地的字节输出流
		BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("E:\\test\\192.168.74.105(1).jpg"));
		//9.把Socket输入流中的数据,写入到目的地的字节输出流中
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			fileOut.write(buffer, 0, len);
		}
		//-------------------反馈信息----------------------------
		//10.获取Socket的输出流,写反馈信息给客户端
		OutputStream out = clientSocket.getOutputStream();
		out.write("图片上传成功".getBytes());
		
		out.close();
		fileOut.close();
		in.close();
		clientSocket.close();
	}
}
