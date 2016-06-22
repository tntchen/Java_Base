package cn.iteheima02_File;

import java.io.File;
import java.io.IOException;

/*
 * 文件相对路径和绝对路径问题
 * 	相对路径:不带盘符的路径 \Day15\aaa.txt
 * 	绝对路径:带盘符的路径 E:\workspace\Day15\aaa.txt
 */
public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		//绝对路径
		File file1 = new File("E:\\workspace\\测试用的文件夹\\hello.txt");
		file1.createNewFile();
		
		//相对路径,在使用eclipse时,默认存放在当前project目录中
		File file2 = new File("helloworld.txt");
		file2.createNewFile();
	}
}
