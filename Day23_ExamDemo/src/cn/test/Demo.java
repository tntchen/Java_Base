package cn.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;

public class Demo {
	public static void main(String[] args) throws Exception {
		File f=new File("e:\\io.txt");
		FileWriter out=new FileWriter(f);
		out.write("hello world");
		File f2=new File("e:\\io2.txt");
		OutputStream outStream=new FileOutputStream(f2);
		outStream.write("你好世界".getBytes());
	}
}

