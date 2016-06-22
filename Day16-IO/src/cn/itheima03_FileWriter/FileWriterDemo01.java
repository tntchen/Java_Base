package cn.itheima03_FileWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 使用字节流向文件中写入中文，及读取文件中的中文
 */
public class FileWriterDemo01 {
	public static void main(String[] args) throws IOException {
		
		//写中文到文件
		write();
		//从文件中读中文
		read();
	}
	
	//写中文到文件
	public static void write() throws IOException{
		//创建流
		FileOutputStream out = new FileOutputStream("hello.txt");
		//写数据
		out.write("你好".getBytes());
		//关闭流
		out.close();
	}
	
	//从文件中读中文
	public static void read() throws IOException{
		//创建流
		FileInputStream in = new FileInputStream("hello.txt");
		//读数据
		
		/*
		 * 1，读取多个字节到数组
		 * 2，记录读取到的字节数量
		 * 3,判断字节数量是否为-1，-1说明读取到了文件末尾
		 */
		/*
		 * 一次多个字节的方式
		byte[] buffer = new byte[1024];//创建一个存储字节数组的临时数组
		int len = -1; //用来记录每次读取字节的数量
		while( (len = in.read(buffer)) != -1 ){
			String data = new String(buffer, 0, len);
			System.out.print(data);
			//System.out.println(Arrays.toString(buffer));
		}
		*/
		
		//一次一个字节的方式
		int ch = -1;
		while ( (ch = in.read()) != -1){
			System.out.println(ch);
		}
		//关闭流
		in.close();
	}
}