package cn.itheima06_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * public static final PrintStream err“标准”错误输出流
 * 
 * public static final InputStream in“标准”输入流。
 * 
 * public static final PrintStream out“标准”输出流
 */
public class SystemDemo {
	public static void main(String[] args) throws IOException {
		//“标准”错误输出流
		//PrintStream ps = System.err;
		//ps.println("我是错误输出流");
		
		//“标准”输出流
		//PrintStream ps = System.out;
		//ps.println("我是标准的输出流");
		
		/*
		//标准输入流，对应的键盘输入
		InputStream in = System.in;
		//从键盘输入流，读一个字节数据到ch中
		int ch = in.read();
		System.out.println("ch="+ch);
		System.out.println("over");
		*/
		
		//通过System.in， 从键盘上获取录入的一行字符串内容
		//1，输入流对象
		//基本的字节输入流
		InputStream in = System.in;
		//需要把字节流，转换成字符流，可以通过转换流来实现
		InputStreamReader isr = new InputStreamReader(in);
		//把基本的字符流，包装成一个高效的字符流
		BufferedReader bufferedIn = new BufferedReader(isr);
		//2,通过输入流，读取一行字符串内容
		//BufferedReader 提供特有方法  读取一行字符串的方法 readLine()
		//String line = BufferedReader.readLine();
		String line = bufferedIn.readLine();
		System.out.println("line = " + line);	
	}
}
