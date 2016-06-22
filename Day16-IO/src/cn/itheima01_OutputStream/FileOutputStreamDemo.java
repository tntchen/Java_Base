package cn.itheima01_OutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * OutputStream 抽象类，字节输出流
 * 	|- FileOuputStream 用来向文件中写入数据的字节输出流
 * 
 * 
 * 构造方法：
 * 	FileOuputStream(File file) 创建字节输出流，指定把数据写入到file代表的文件中，如果该file文件不存在，会自动创建文件
 * 
 * 方法：
 * 	write(byte[] bys) 一次写入多个字节到文件中
 *  write(byte by) 一次写个一个字节到文件中
 *  close() 关闭流与释放流所占用系统资源
 */

/*
 * 需求； 向指定的a.txt文件中，写入数据"abcde"
 * 
 * 分析：
 * 	1.指定File对象  new File("a.txt")
 * 	2.创建字节输出流，把数据写入到a.txt文件中  
 * 	3.把打开的文件关闭，释放资源	
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//指定File对象new File("a.txt)
		File filePath = new File("a.txt");
		//创建字节输出流,把数据写入a.txt
		FileOutputStream out = new FileOutputStream(filePath);
		//把数据写入"a.txt"中
		out.write("abcde".getBytes());
		out.write("hello".getBytes());
		out.write("hello2".getBytes());
		out.write("hello3".getBytes());
		//3.把打开的文件关闭,释放资源
		out.close();
	}
}
