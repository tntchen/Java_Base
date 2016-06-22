package cn.itheima03_BufferedStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 字符缓冲输入流 BufferedReader
 */
public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("file.txt"));
		String line = null;
		while((line = in.readLine()) != null) {
			System.out.println(line);
		}
		in.close();
	}
}
