package cn.test2;
/*
 * 现有字符串“qazx234567WSXC7654312”。编写程序实现以下功能：
 * (1)截取并打印该字符串中的字母部分，然后分别求出这两段字母的长度并打印输出
 * (2)将第一段字母转为大写，第二段字母转为小写，然后拼接两段字母并打印
 * 经测试0-9uinicode分别为48~57 a~z分别为97~122 A~Z分别为65~90
 */
public class StringDemo {
	public static void main(String[] args) {
		String testStr = "qazx234567WSXC7654312";
		//截取出字符串中的字母部分
		String[] method1 = method1(testStr);
		//打印字母部分
		System.out.println(method1[0]);
		System.out.println(method1[1]);
		//求出两段字母长度并打印输出
		System.out.println("小写字符长度为"+method1[0].length());
		System.out.println("大写字符长度为"+method1[1].length());
		//将字母大小写转换
		String[] method2 = new String[2];
		method2[0] = method1[0].toUpperCase();
		method2[1] = method1[1].toLowerCase();
		//打印
		System.out.println("拼接后打印结果为:\n"+method2[0]+method2[1]);
	}

	private static String[] method1(String testStr) {
		//创建String数组存储字母部分
		String[] str = new String[2];
		byte[] bytes = testStr.getBytes();
		for (byte b : bytes) {
			if (b >= 65 && b <= 90) {
				str[1] = String.valueOf((char) b);
			}
			if (b >= 97 && b <= 122) {
				str[0] = String.valueOf((char) b);
			}
		}
		return str;
	}	
}
