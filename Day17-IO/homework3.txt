//package cn.itheima_Buffer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 编写程序，读取输入的数据，并判断数据，如果是exit就退出
 */
public class homework3 {
	public static void main(String[] args) throws IOException {
		//创建 字符 输出流
		FileWriter in=new FileWriter("a.txt");
		
		//写入数据
		while(true){
			System.out.println("请输入字符串:");
			//创建 键盘录入
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			in.write(str+"\r\n");
			
		}
		
		//关闭流
		in.close();
	}

}