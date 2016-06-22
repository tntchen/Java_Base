package cn.itheima01_String;
/*
 * 对比StringDemo01.java
 */
public class StringDemo02 {
	public static void main(String[] args) {
		String s3 = "abc";
		String S4 = new String("abc");
		
		System.out.println(s3 == S4);
		//通过字符串的内容进行判断
		System.out.println(s3.equals(S4));
	}
}
