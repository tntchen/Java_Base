package cn.iteheima03_File_Test;

import java.io.File;

/*
 * 获取所有子目录中的内容
 * 分析:
 * 	1.指定要遍历的文件夹
 * 	2.编写一个方法,用来打印指定文件夹中的文件信息printDirAndFile(File dir)
 * 	2.1 获取当前dir目录下所有的文件与文件夹 FIles[] listFiles()
 * 	2.2 通过遍历Files数组,得到每一个File对象
 * 	2.3 判断当前的File对象是否为文件
 * 		是:打印当前文件路径
 * 	2.4 判断当前的File对象是否为文件夹
 * 		是:进入文件夹,执行2.1
 */
public class FileTest01 {
	public static void main(String[] args) {
		//指定要遍历的文件夹
		File dirPath = new File("E:\\黑马资料\\讲义");
		//编写一个方法,用来打印指定文件夹中的文件信息
		printDirAndFile(dirPath);
	}
	
	public static void printDirAndFile(File dirPath) {
		File[] files = dirPath.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(file);
			}
			if (file.isDirectory()) {
				printDirAndFile(file);
			}
		}
	}
}
