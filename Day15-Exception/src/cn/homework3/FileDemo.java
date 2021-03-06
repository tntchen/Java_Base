package cn.homework3;

import java.io.File;
import java.io.IOException;

/*
 * 编写程序，创建几个文件，并获取此路径下的文件和目录，并打印输出
 */
public class FileDemo {
	public static void main(String[] args) throws IOException {
		//创建File对象
		File file = new File("E:\\workspace\\Day15\\homework3.txt");
		//创建文件
		boolean flag = file.createNewFile();
		if (flag) {
			System.out.println("已新建文件");
		}
		//遍历新建文件所在路径的文件夹
		//指定路径
		File dir = new File("E:\\workspace\\Day15");
		//编写一个方法打印输出
		printDirOrFile(dir);
	}
	//打印输出方法
	public static void printDirOrFile(File dir)	{
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
