package cn.itheima03_BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 使用BufferedInputStream完成才能够文件中读取数据
 */
public class BufferedInputStreamDemo {
	public static void main(String[] args) throws IOException {
		read();
	}

	private static void read() throws IOException {
		FileInputStream inFile = new FileInputStream("abc.txt");
		BufferedInputStream bufferedIn = new BufferedInputStream(inFile);
		int ch = -1;
		while ((ch = bufferedIn.read()) != -1) {
			System.out.print((char) ch);
		}
		bufferedIn.close();
	}
}
