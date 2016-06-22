package cn.itheima02_FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream : 抽象类，字节输入流的祖宗类
 * 	|- FileInputStrean : 具体类，用来读取文件中的字节的流
 * 
 * 需求： 从指定的a.txt文件中，读取字节数据，把读取到的字节进行打印
 * 分析：
 * 	1.创建用来读取数据的字节输入流对象  FileInputStream
 * 	2,读取数据
 * 	3,关闭流(关闭文件)
 * 
 *	int read():读取一个字节并返回，没有字节返回-1.
 */
public class FileInputStreamDemo01 {
	public static void main(String[] args) throws IOException {
		//1.创建用来读取数据的字节输入流对象  FileInputStream
		FileInputStream in = new FileInputStream("a.txt");
		//2,读取数据
		//int data = in.read();
		//System.out.println((char)data);
		
		/*
		 * 循环条件中做了三件事情
		 * a,读取了一个字节  in.read()
		 * b,保存读取到的字节  int ch = in.read()
		 * c, 判断 ch != -1, 当不为-1时，说明文件中数据可以读取, ch == -1,说明读取到了文件的末尾
		 */
		int ch = -1; //定义一个变量，用来保存读取到的字节
		while ( (ch = in.read()) != -1 ) {
			//打印读取到的字节
			System.out.print((char)ch);
		}
		
		//3,关闭流(关闭文件)
		in.close();
	}
}
