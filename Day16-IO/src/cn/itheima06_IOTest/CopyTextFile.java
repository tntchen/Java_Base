package cn.itheima06_IOTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求： 将E:\\workspace\\Day16\\a.txt 复制到  E:\\workspace\\Day16\\c.txt
 * 
 * 数据源： E:\\workspace\\Day16\\a.txt -- 字符输入流 -- FileReader
 * 目的地： E:\\workspace\\Day16\\c.txt -- 字符输出流 -- FileWriter
 * 
 * 分析：
 * 	1，创建数据源与对应的流
 * 	2，创建目的地与对应的流
 * 	3,读数据
 * 	4,写数据
 * 	5,关闭流
 */
public class CopyTextFile {
	public static void main(String[] args) throws IOException {
		//1，创建数据源与对应的流
		FileReader in = new FileReader("E:\\workspace\\Day16\\a.txt");
		//2，创建目的地与对应的流
		FileWriter out = new FileWriter("E:\\workspace\\Day16\\c.txt");
		//3,读数据
		int len = -1;
		char[] buffer = new char[1024];
		while( (len = in.read(buffer)) != -1 ){
			//4,写数据
			out.write(buffer, 0, len);
		}
		//5,关闭流
		out.close();
		in.close();
	}
}
