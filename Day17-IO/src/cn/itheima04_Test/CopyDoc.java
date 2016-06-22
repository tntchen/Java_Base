package cn.itheima04_Test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制doc文件
 */
public class CopyDoc {
	public static void main(String[] args) throws IOException {
		BufferedInputStream src = new BufferedInputStream(new FileInputStream("a.docx"));
		BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream("b.docx"));
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = src.read(buffer)) != -1 ) {
			dest.write(buffer, 0, len);
		}
		src.close();
		dest.close();
	}
}
