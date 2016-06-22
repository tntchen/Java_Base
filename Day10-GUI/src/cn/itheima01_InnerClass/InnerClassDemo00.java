package cn.itheima01_InnerClass;


/*
 * 非静态非私有内部类
 */
public class InnerClassDemo00 {
	public static void main(String[] args) {
		//通过创建外部对象接着创建内部对象
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}

class Outer {
	//定义一个成员变量
	int num = 5;
	//1.定义一个内部类
	class Inner {
		//在内部类定义一个方法
		void show() {
			//访问外部类中的成员变量
			System.out.println("外部类num="+num);
		}
	}

	
	//外部类中定义一个method方法
	public void method() {
		/*访问内部类中的show方法
		发现不能直接访问内部类成员,若要访问
		必须创建内部类对象才能访问*/
		Inner in = new Inner();
		in.show();
	}
}
