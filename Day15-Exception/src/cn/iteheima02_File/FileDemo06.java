package cn.iteheima02_File;

import java.io.File;

/*
 * 遍历制定目标下所有文件名和目录名称
 */
public class FileDemo06 {
	public static void main(String[] args) {
		File dir = new File("E:\\workspace");
		
		String[] names = dir.list();
		for (String name : names) {
			System.out.println(name);
		}
		
		File[] files = dir.listFiles();
		for (File file : files) {
			System.out.println(file);
		}
	}
}
