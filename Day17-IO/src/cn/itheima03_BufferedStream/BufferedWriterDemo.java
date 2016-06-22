package cn.itheima03_BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BuffededWriter 字符缓冲输出流
 */
public class BufferedWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fileOut = new FileWriter("file.txt");
		BufferedWriter out = new BufferedWriter(fileOut);
		for (int i = 0; i < 5; i++) {
			out.write("WorldOrder");
			out.newLine();
		}
		out.close();
	}
}
