package cn.itheima01_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress表示IP地址类
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		//获取IP地址对象
		//InetAddress byName = InetAddress.getByName("www.baidu.com");
		//InetAddress address = InetAddress.getByName("GUO-PC");
		//System.out.println(address);
		//获取当前电脑IP地址
		InetAddress address = InetAddress.getLocalHost();
		
		String ip = address.getHostAddress();
		System.out.println(ip);
		
		String hostName = address.getHostName();
		System.out.println(hostName);
		
		
		
		
	}
}
