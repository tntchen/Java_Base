package cn.homework1;
/*
 * 编写程序，根据D:\\cn\\itcast\\day16\\FileTest，获取此抽象路径名
 */
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建File对象
		File file = new File("D:\\cn\\itcast\\day16\\FileTest");
		//获取此对象的路径名
		File canonicalFile = file.getCanonicalFile();
		System.out.println("canonicalFile=" + canonicalFile);
	}
}
