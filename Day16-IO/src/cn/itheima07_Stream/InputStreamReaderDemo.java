package cn.itheima07_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * OutputStream: 字节输出流
 * 	  |- FileOutputStream 
 * 
 * 
 * InputStream: 字节输入流
 * 	  |- FileInputStream 
 * 
 * 
 * Writer : 字符输出流
 *    |- OutputStreamWriter 转换流(输出),可以指定编码表，按照指定的编码表进行数据的写入
 * 	  		|-FileWriter
 * 
 * Reader: 字符输入流
 * 	  |- InputStreamReader 转换流(输入),可以指定编码表，按照指定的编码表进行数据的读取
 * 			|-FileReader 
 * 
 * 
 * 需求： 从e.txt文件中读取文件内容，使用utf-8编码表完成
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		//1,指定字节输入流
		FileInputStream in = new FileInputStream("a.txt");
		//2,指定转换流，指定编码表，用来读取字节输入流中的数据
		InputStreamReader isr = new InputStreamReader(in, "utf-8");
		//3，读取数据
		int ch = -1;
		while( (ch = isr.read()) != -1){
			//显示数据
			System.out.print((char)ch);
		}
		//4,关闭流
		isr.close();
	}
}
