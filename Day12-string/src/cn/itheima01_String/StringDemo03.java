package cn.itheima01_String;
/*
 * 字符串方法的演示
 * 	字符串长度方法int length()
 * 	获取子字符串String substring (int start,int end)
 * 	字符串是否以指定字符串开头/结尾boolean startWeith/endWith(String)
 *  字符串是否包含另一个字符串boolean contains(String)
 * 	将字符串转换成一个字符数组或者字节数组
 * 	字符数组:public char[] toCharArray()
 * 	字节数组:public byte[] getBytes(String charsetName)
 */
public class StringDemo03 {
	public static void main(String[] args) {
		String s = "abcdef";
		
		//获取长度的方法
		int length = s.length();
		//自动生成方法返回值(等号左边的内容)
		//Ctrl +2,L
		System.out.println(length);
		 
		//获取字符串
		String substring = s.substring(1, 3);
		System.out.println(substring);
		
		//字符串是否以指定字符串开头/结尾
		boolean b = s.startsWith("abc");;
		boolean c = s.endsWith("abc");
		//System.out.println(b,c);
		System.out.println(b+","+c);
		
		//字符串是否包含另一个字符串
		boolean d = s.contains("abc");
		System.out.println(d);
		
		//将字符串转换成一个字符数组或者字节数组
		char[] chas = s.toCharArray();
		byte[] bys = s.getBytes();
		for (int i = 0; i < chas.length; i++) {
			System.out.println(chas[i]);
		}
		for (int i = 0; i < bys.length; i++) {
			System.out.println(bys[i]);
		}
	}
}
