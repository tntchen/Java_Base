package cn.homework1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 编写程序，测试用字符流能直接把数据，写入到文件里么
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//指定File对象new File对象
		File filePath = new File("test.txt");
		//创建字节输出流,把数据写入test.txt
		FileOutputStream out = new FileOutputStream(filePath);
		out.write("data".getBytes());
		//关闭流
		out.close();
	}
}
