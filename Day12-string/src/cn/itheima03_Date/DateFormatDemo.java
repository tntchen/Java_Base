package cn.itheima03_Date;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * 日期格式化类
 * 
 * 格式化:日期->文本 public final String format(Date date)
 * 解析:文本->日期 public Date parse(String sourse)
 */
public class DateFormatDemo {
	public static void main(String[] args) {
		//创建一个对象
		Date date = new Date();
		System.out.println(date);
		
		//通过日期格式化类,显示出我们想要的格式化后日期
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String str = df.format(date);
		System.out.println(str);
	}
}
