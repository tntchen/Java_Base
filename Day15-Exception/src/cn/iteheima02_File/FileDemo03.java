package cn.iteheima02_File;

import java.io.File;
import java.io.IOException;

/*
 * 使用File类完成文件或文件夹的创建和删除
 * 
 * 方法:
 * 	创建文件 boolean createNewFile()
 * 	创建文件夹	boolean mkdir() 创建单层文件夹
 * 				boolean mkdirs() 创建多层文件夹
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//创建File对象,指定参数为E:\workspace\Day15\aaa.txt
		File file = new File("E:\\workspace\\aaa.txt");
		
		//创建文件
		boolean flag = file.createNewFile();
		System.out.println(flag);
				
		//创建文件夹,指定参数为E:\workspace\测试用的文件夹
		File file2 = new File("E:\\workspace\\测试用的文件夹");
		
		//创建文件夹
		boolean flag2 = file2.mkdir();
		System.out.println(flag2);
		
		//创建多层文件夹,指定参数E:\workspace\测试用的文件夹\a\b\c
		File file3 = new File("E:\\workspace\\测试用的文件夹\\a\\b\\c");
		
		boolean flag3 = file3.mkdirs();
		System.out.println(flag3);
	}
}
