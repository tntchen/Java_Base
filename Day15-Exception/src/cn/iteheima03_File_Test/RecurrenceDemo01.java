package cn.iteheima03_File_Test;
/*
 * 递归:计算5的阶乘值
 */
public class RecurrenceDemo01 {
	public static void main(String[] args) {
		int x = jc(5);
		System.out.println(x);
	}
	
	public static int jc(int n) {		
		if (n==1) {
			return 1;
		} else {
			return jc(n-1) * n;
		}		
	}
}
