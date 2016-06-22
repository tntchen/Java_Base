package cn.itheima03_BufferedStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 采用高效的字符缓冲流复制文本文件
 */
public class CopyTextFile {
	public static void main(String[] args) throws IOException {
		//指定输入源
		BufferedReader src = new BufferedReader(new FileReader("file.txt"));
		//输出目的地
		BufferedWriter dest = new BufferedWriter(new FileWriter("copyfile.txt"));
		String line = null;
		while ((line = src.readLine()) != null) {
			dest.write(line);
			dest.newLine();
		}
		src.close();
		dest.close();
	}
}
