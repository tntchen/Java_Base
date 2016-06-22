package cn.itheima07_commons_IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/*
 * 完成文件夹的复制
 */
public class CommonsIODemo02 {
	public static void main(String[] args) throws IOException {
		
		//通过Commons-IO完成了文件夹复制的功能
		//D:\黑马基础班\黑马01期
		FileUtils.copyDirectoryToDirectory(new File("D:\\黑马基础班\\黑马01期"), new File("C:\\111"));
		
	}

}
