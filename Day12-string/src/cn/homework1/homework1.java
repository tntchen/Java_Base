package cn.homework1;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str = sc.nextLine();
		//将str转换成字符数组
		char[] chs = str.toCharArray();
		//逆序遍历数组
		for (int i = chs.length-1; i >= 0; i--) {
			System.out.print(chs[i]);
		}
	}
}
