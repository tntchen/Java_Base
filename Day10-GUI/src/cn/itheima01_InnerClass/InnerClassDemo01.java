package cn.itheima01_InnerClass;
/*
 * 静态非私有内部类
 */
public class InnerClassDemo01 {
	public static void main(String[] args) {
		//内部类是静态,不用新建对象,直接创建类名就好
		Outer1.Inner1 inner = new Outer1.Inner1();
		inner.show1();
	}
}

class Outer1 {
	//定义一个成员变量
	static int num = 5;
	//2.定义一个内部类(静态非私有)
	static class Inner1 {
		//在内部类定义一个方法
		public void show1() {
			//访问外部类中的成员变量
			System.out.println("外部类num="+num);
		}
	}
	
	//外部类中定义一个method方法
	public void method1() {
		/*访问内部类中的show方法
		发现不能直接访问内部类成员,若要访问
		必须创建内部类对象才能访问*/
		Inner1 in = new Inner1();
		in.show1();
	}
}