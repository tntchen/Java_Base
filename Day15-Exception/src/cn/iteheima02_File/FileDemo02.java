package cn.iteheima02_File;

import java.io.File;

/*
 * 获取File相关信息的方法
 * 
 * 文件名称
 * 文件大小
 * 文件位置
 */
public class FileDemo02 {
	public static void main(String[] args) {
		//创建File对象
		File file = new File("E:\\黑马资料\\讲义\\JDK下载安装文档.doc");
		System.out.println(file);
		
		//获取文件名称
		String name = file.getName();
		System.out.println("name=" + name);
		
		//获取文件大小
		long length = file.length();
		System.out.println("length="+ length);
		
		//获取文件位置
		String address = file.getAbsolutePath();
		System.out.println("AbsolutePath="+address);
	}
}
