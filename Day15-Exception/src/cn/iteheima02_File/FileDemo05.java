package cn.iteheima02_File;

import java.io.File;

/*
 * 使用File类完成删除文件或文件夹操作
 * 方法:
 * 	删除文件或空文件夹:boolean delete()
 */
public class FileDemo05 {
	public static void main(String[] args) {
		//删除E:\\workspace\\测试用的文件夹\\hello.txt
		File file = new File("E:\\workspace\\测试用的文件夹\\hello.txt");
		boolean flag = file.delete();
		System.out.println(flag);
		
		//删除空文件夹,E:\\workspace\\测试用的文件夹\\a\\b\\c
		File file2 = new File("E:\\workspace\\测试用的文件夹\\a\\b\\c");
		boolean flag2 = file2.delete();
		System.out.println(flag2);
		
	}
}
