package cn.itheima04_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 复制txt文件
 */
public class CopyTxt {
	public static void main(String[] args) throws IOException {
		BufferedReader src = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter dest = new BufferedWriter(new FileWriter("b.txt"));
		String line = null;
		while ((line = src.readLine()) != null) {
			dest.write(line);
			dest.newLine();
		}
		src.close();
		dest.close();
	}
}
