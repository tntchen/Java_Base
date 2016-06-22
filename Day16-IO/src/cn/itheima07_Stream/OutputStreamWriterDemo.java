package cn.itheima07_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 使用utf-8编码，完成指定数据的写入到e.txt文件中
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		//1,创建一个字节输出流
		FileOutputStream out = new FileOutputStream("e.txt");
		//2,创建一个转换流，指定数据写入的文件位置，指定编码表
		OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
		//3,写入数据到文件
		osw.write("你好");
		//4,关闭流
		osw.close();
	}
}
