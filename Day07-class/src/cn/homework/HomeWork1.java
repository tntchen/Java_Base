package cn.homework;
/*
 * 创建一个类MyClass,顶一个int类型成员变量a并复制,
 * 和一个show方法,在show方法中打印成员变量,创建一个
 * 测试类是show方法执行
 */

import java.util.Date;

/*
 * 创建MyClass类
 */
class MyClass {
	//定义int类型成员
	private int a;
	//构造方法
	public MyClass() {
		a = 3;
	}
	//定义get方法
	public int getA() {
		return a;
	}
	
	//定义show方法
	public void show() {
		System.out.println("成员变量为:" + a);
	}
}
public class HomeWork1 {
	public static void main(String[] args) {
		MyClass x = new MyClass();
		x.show();
	}
}
