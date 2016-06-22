package cn.itheima01_OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求： 在原有文件内容的基础上，增加新内容及换行操作
 * 
 * 分析：
 * 	1.指定File对象  new File("a.txt")
 * 	2.创建字节输出流，把数据写入到a.txt文件中  
 * 	3.把打开的文件关闭，释放资源
 * 
 * 构造方法：
 * 	public FileOutputStream(File file, boolean append) 完成在原有内容基础上，追加新数据的字节输出流
 *  public FileOutputStream(String name, boolean append)

	可能产生的异常
	FileNotFoundException: f:\b.txt (系统找不到指定的路径。
 */

public class FileOutputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//1,创建字节输出流
		FileOutputStream out= new FileOutputStream("b.txt", true);//开启追加模式
		//2，写入数据到文件
		//out.write("hello".getBytes());
		out.write("\r\nworld".getBytes());// \r\n代表的是windows系统的换行
		//3.关闭文件
		out.close();
	}
}
