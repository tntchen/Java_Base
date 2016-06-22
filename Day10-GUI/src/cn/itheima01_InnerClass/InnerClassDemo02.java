package cn.itheima01_InnerClass;
/*
 * 静态内部类的静态成员
 */
public class InnerClassDemo02 {
	public static void main(String[] args) {
		Outer2.Inner2.show2();
	}
}

class Outer2 {
	//定义一个成员变量
	static int num = 5;
	//3.定义一个内部类(静态类+静态方法)
	static class Inner2 {
		//在内部类定义一个方法
		public static void show2() {
			//访问外部类中的成员变量
			System.out.println("外部类num="+num);
		}
}
	
	//外部类中定义一个method方法
	public void method2() {
		/*访问内部类中的show方法
		发现不能直接访问内部类成员,若要访问
		必须创建内部类对象才能访问*/
		Inner2 in = new Inner2();
		in.show2();
	}
}
