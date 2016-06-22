package cn.itheima04_FileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  Reader 字符输入流，抽象类
 * 		|- FileReader 操作文件的字符输入流, 作用：用来从文件中读取字符数据
 * 
 *  Writer 字符输出流，抽象类
 *  	|- FileWriter 操作文件的字符输出流， 作用用来向文件中写入字符数据
 *  
 *	read():读取单个字符并返回
 *  read(char[]):将数据读取到数组中，并返回读取的个数。
 */
public class FileReaderDemo01 {
	public static void main(String[] args) throws IOException {
		
		//写数据
		write();
		
		//读数据
		//read();
	}

	//读数据
	private static void read() throws IOException {
		//创建流对象
		FileReader in = new FileReader("d.txt");
		//读数据
		int len = -1;
		char[] buffer = new char[1024];
		while( (len = in.read(buffer)) != -1 ){
			String data = new String(buffer, 0, len);
			System.out.print(data);
		}
		
		/*
		int ch = -1;
		while( (ch = in.read()) != -1 ){
			System.out.print((char)ch);
		}
		*/
		//关闭流
		in.close();
	}

	//写数据
	private static void write()throws IOException {
		//创建字符输出流
		FileWriter out = new FileWriter("d.txt");
		//写数据到文件
		out.write("我爱Java");
		//刷新流,作用把缓冲区的内容写入到文件
		//out.flush();
		//关闭流
		out.close();
		out.write("我爱Java");
		//out.flush();
	}
}
