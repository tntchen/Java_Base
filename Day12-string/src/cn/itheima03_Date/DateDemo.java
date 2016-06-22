package cn.itheima03_Date;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		Date d = new Date(time);
		System.out.println(d);
	}
}
