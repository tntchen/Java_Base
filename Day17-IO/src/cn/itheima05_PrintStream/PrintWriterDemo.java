package cn.itheima05_PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 打印流
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("printFile.txt"));
		for (int i = 0; i < 5; i++) {
			out.println("helloworld");
		}
		out.close();
	}
}
