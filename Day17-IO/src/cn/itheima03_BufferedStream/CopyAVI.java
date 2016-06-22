package cn.itheima03_BufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 需求:将E:\test.avi文件进行复制
 * 采用四种方式进行复制:
 * 方式1:采用基本的流,一次一个字节的方式复制time=208324
 * 方式2:采用基本的流,一次多个字节的方式复制time=   257
 * 方式3:采用高效的流,一次一个字节的方式复制time=  2236
 * 方式4:采用高效的流,一次多个字节的方式复制time=    68
 */
public class CopyAVI {
	public static void main(String[] args) throws IOException {
		//开始计时
		long start = System.currentTimeMillis();
		
		//method1("E:\\test.avi","E:\\test1.avi");
		//method2("E:\\test.avi","E:\\test2.avi");
		//method3("E:\\test.avi","E:\\test3.avi");
		method4("E:\\test.avi","E:\\test4.avi");
		
		//结束计时
		long end = System.currentTimeMillis();
		//打印耗时多少毫秒
		System.out.println("time=" + (end - start));
	}
	
	@SuppressWarnings("unused")
	private static void method4(String src, String dest) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
		
		}
		in.close();
		out.close();
		
	}

	@SuppressWarnings("unused")
	private static void method3(String src, String dest) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		int ch = -1;
		while ((ch = in.read()) != -1) {
			out.write(ch);
		}
		in.close();
		out.close();
	}

	@SuppressWarnings("unused")
	private static void method2(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		in.close();
		out.close();
		
	}
	
	@SuppressWarnings("unused")
	private static void method1(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		int ch = -1;
		while ((ch = in.read()) != -1) {
			out.write(ch);
		}
		in.close();
		out.close();
	}
}
