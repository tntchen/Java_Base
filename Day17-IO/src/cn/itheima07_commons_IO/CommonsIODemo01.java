package cn.itheima07_commons_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/*
 * 完成文件的复制
 */
public class CommonsIODemo01 {
	public static void main(String[] args) throws IOException {
		//method1("D:\\test.avi", "D:\\copy.avi");
		
		//通过Commons-IO完成了文件复制的功能
		FileUtils.copyFile(new File("E:\\test.avi"), new File("E:\\copy.avi"));
		
		
	}

	//文件的复制
	private static void method1(String src, String dest) throws IOException {
		//1,指定数据源 
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
		//2,指定目的地
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest));
		//3，读
		byte[] buffer = new byte[1024];
		int len = -1;
		while ( (len = in.read(buffer)) != -1) {
			//4,写
			out.write(buffer, 0, len);
		}
		//5，关闭流
		in.close();
		out.close();
	}
}
