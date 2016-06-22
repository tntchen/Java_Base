package cn.itheima03_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP客户端
 * 
 * 1.创建客户端Socket对象(指定要连接的服务器地址与端口号)
 * 2.获取服务器反馈回来的信息
 * 3.关闭流资源
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("192.168.74.105", 8888);
		//获取服务器反馈回来的信息
		InputStream in = s.getInputStream();
		//获取流中的数据
		byte[] buffer = new byte[1024];
		int length = in.read(buffer);
		System.out.println(new String(buffer, 0, length));
		
		in.close();
		s.close();
	}
}
