package cn.itheima03_BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 通过字节缓冲流进行文件的读写操作
 * 
 * 写数据到文件的操作
 * 	BufferedOutputStream
 * 
 */
public class BufferedOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		//写数据到文件的额方法
		write();
	}

	private static void write() throws IOException {
		FileOutputStream fileOut = new FileOutputStream("abc.txt");
		//使用搞笑的流,把基本的流进行封装,实现速度提升
		BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut);
		//写数据
		bufferedOut.write("hello".getBytes());
		bufferedOut.close();
	}
}
