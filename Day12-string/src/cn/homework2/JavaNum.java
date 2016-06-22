package cn.homework2;
/*
 * 计算java在输入字符串出现的次数
 */
public class JavaNum {
	public static int count (String str) {
		if (str == null) {
			System.out.println("传入字符串为空!");
			return -1;
		}
		
		int str_length = str.length();//定义字符串长度
		int index = 0;//定义索引
		int num = 0;//定义数目统计变量
		
		while (index < str_length) {
			//使用indexOf方法返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
			index = str.indexOf("java",index);
			if (index < 0) {//如果index为-遍历结束退出循环
				break;
			} else {
				index ++;//index升级
				num ++;//计数君
			}
		}
		
		return num;		
	}
}
