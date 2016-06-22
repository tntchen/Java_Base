package cn.homework2;

import java.util.Scanner;

public class JavaNumTest {
	public static void main(String[] args) {
		System.out.println("请输入字符串:");
		//创建输入对象
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//调用JavaNum函数
		int x = JavaNum.count(str);
		System.out.println("字符串中java出现字数为" + x);		
	}
}
