package cn.itheima01_static;
/*
 * 静态变量和成员变量的区别：
	1、变量所属不同
		静态变量所属与类，也称为类变量
		成员变量所属于对象，也称为实例变量(对象变量)
	2、内存中的位置
		静态变量存储于方法区中的静态区中
		成员变量存储于堆内存中
	3、在内存中出现的时间
		静态变量随着类的加载而加载，随着类的消失而消失
		成员变量随着对象的创建而在堆内存中出现，随着对象的消失而消失
 */
class Zi {
	//成员变量
	int num = 5;
	//静态变量
	static int num2 = 10;
}

public class Demo02 {
	public static void main(String[] args) {
		//访问成员变量
		Zi z = new Zi();
		System.out.println(z.num);
		
		//访问静态变量
		System.out.println(z.num2);
		//类名.静态变量;
		System.out.println(Zi.num2  );
	}
}
