package cn.itheima01_static;
/*
 * 代码块
 */
public class CodeBlock {
	public static void main(String[] args) {
		
		{//局部代码块
			int x = 1;
			System.out.println("局部代码块 x=" + x);
		}
		//在代码块外
		int x = 99;
		System.out.println("在代码块外 x=" + x);
		
	}
}
