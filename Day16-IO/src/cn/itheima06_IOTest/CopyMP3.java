package cn.itheima06_IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制MP3文件:E:\test.mp3--->E:\test1.mp3
 * 
 * 分析:
 * 	确定数据源
 * 	确定目的地
 * 	创建字节输入流,完成从数据源获取数据
 * 	创建字节输出流,完成向目的地写入数据
 * 	读数据
 * 	写数据
 * 	关闭流
 */
public class CopyMP3 {
	public static void main(String[] args) throws IOException {
		File srcPath = new File("E:\\test.mp3");
		
		File destPath = new File("E:\\test1.mp3");
		
		FileInputStream in = new FileInputStream(srcPath);
		
		FileOutputStream out = new FileOutputStream(destPath);
		
		int len = -1;
		byte[] buffer = new byte[1024];
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}
}
