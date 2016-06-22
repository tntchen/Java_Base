package cn.homework2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 编写程序，路径e:\cn 下得文件fileTest.txt里写入自己想要的数据
 */
public class WriteDemo {
	public static void main(String[] args) throws IOException {
		//创建File对象并按照要求路径新建fileTest.txt文件
		File file = new File("E:\\cn\\fileTest.txt");
		boolean flag = file.createNewFile();
		if (flag) {
			System.out.println("已创建文件");
		}
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		//创建输出流对象,关联txt文件
		FileOutputStream fos = new FileOutputStream("E:\\cn\\fileTest.txt");
		System.out.println("请输入数据:");
		//定义无限循环
		while(true) {
			//将键盘录入的数据存储在line中
			String line = sc.nextLine();
			//遇到quit退出循环
			if("quit".equals(line)) {
				break;
			}
			//如果不quit,就将内容写出
			//字符串写出必须转换成字节数组
			fos.write(line.getBytes());
			fos.write("\r\n".getBytes());
		}
		//关闭流
		fos.close();
	}
}
