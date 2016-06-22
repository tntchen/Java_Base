package cn.itheima01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * IO中异常的处理
 */
public class FileOutputStreamDemo03 {
	public static void main(String[] args) {
		FileOutputStream out = null;
		try{
			//创建字节输出流
			out = new FileOutputStream("f:\\c.txt");
			//写入数据到文件
			out.write("helloWorld".getBytes());
			
		} catch(IOException e){
			//e.printStackTrace();
			throw new RuntimeException("写入数据失败");
			//System.out.println("异常产生啦");
		} finally {
			//一定会被执行的代码
			//关闭文件
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("程序运行完毕");
	}
}
