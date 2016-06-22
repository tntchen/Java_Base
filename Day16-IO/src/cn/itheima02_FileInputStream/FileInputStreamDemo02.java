package cn.itheima02_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 需求： 从指定的a.txt文件中，读取字节数据，把读取到的字节进行打印
 * 分析：
 * 	1.创建用来读取数据的字节输入流对象  FileInputStream
 * 	2,读取数据
 * 	3,关闭流(关闭文件)
 * 
 * int read(byte[]): 读取一定量的字节数，并存储到字节数组中，返回读取到的字节数。返回返回结果为-1，代表读取到了文件的末尾
 */
public class FileInputStreamDemo02 {
	public static void main(String[] args) throws IOException {
		//1.创建用来读取数据的字节输入流对象  FileInputStream
		FileInputStream in = new FileInputStream("a.txt");
		
		//2,读取数据
		//定义一个临时的数组，用来存储每次读取的字节
		byte[] buffer = new byte[1024];//1024个字节  相当于1kb
		/*
		 * 循环条件中的操作
		 * 1,读取文件中的数据到数组 in.read(buffer)
		 * 2,记录每次从文件中读取到的字节数量  len = in.read(buffer)
		 * 3,len == -1,结束文件内容的读取， len !=-1,继续读文件中的内容
		 */
		int len = -1; //记录每次从文件只用读取到了多少个新的字节
		while ( (len = in.read(buffer)) != -1 ) {
			//把字节数组转换成 字符串
			String data = new String(buffer, 0, len);
			System.out.print(data);
		}
		
		//3,关闭流(关闭文件)
		in.close();
	}
}
