package cn.iteheima02_File;

import java.io.File;

/*
 * File类的构造方法
 * 
 * File(String filePath)
 * File(Stirng parent,String fileName)
 * File(File parent,String fileName)
 */
public class FileDemo01 {
	public static void main(String[] args) {
		//File(String filePath)
		String filePath = "E:\\黑马资料\\讲义\\JDK下载安装文档.doc";
		File f1 = new File(filePath);
		System.out.println(f1);
		
		//File(Stirng parent,String fileName)
		String parent = "E:\\黑马资料\\讲义";
		String fileName = "JDK下载安装文档.doc";
		File f2 = new File(parent,fileName);
		System.out.println(f2);
		
		//File(File parent,String fileName)
		File dir = new File("E:\\黑马资料\\讲义");
		fileName = "JDK下载安装文档.doc";
		File f3 = new File(dir,fileName);
		System.out.println(f3);
		
	}
}
