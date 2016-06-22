package cn.itheima02;
/*
 * 子类中成员变量名称不同的情况,
 * 通过super.成员变量的方式访问父类中的成员变量
 * 通过this.成员变量的方式访问父类中的成员变量
 */

class Fu2 {
	int num = 14;
}

class Zi2 extends Fu2 {
	int num = 5;
	
	public void show() {
		int num = 8;
		
		//访问fu2类中num
		System.out.println("Fu2 num = "+super.num);
		//访问zi2类中num
		System.out.println("Zi2 num = "+this.num);
		//访问show方法中的局部变量
		System.out.println("show num = "+num);
	}
}

public class ExtendsDemo2 {
	public static void main(String[] args) {
		//new zi
		Zi2 z = new Zi2();
		z.show();
	}
}
