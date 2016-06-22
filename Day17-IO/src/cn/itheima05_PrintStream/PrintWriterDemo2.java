package cn.itheima05_PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 构造方法：
 * 	开启文件自动刷新写入功能
 * 	public PrintWriter(OutputStream out, boolean autoFlush)
 * 	public PrintWriter(Writer out, boolean autoFlush)
 * 
 * 分析：
 * 	1，创建流
 * 	2，写数据
 */
public class PrintWriterDemo2 {
	public static void main(String[] args) throws IOException {
		//创建流
		PrintWriter out = new PrintWriter(new FileWriter("printFile.txt"), true);
		//2，写数据
		for (int i=0; i<5; i++) {
			out.println("helloWorld");
		}
		//3,关闭流
		out.close();
	}
}
