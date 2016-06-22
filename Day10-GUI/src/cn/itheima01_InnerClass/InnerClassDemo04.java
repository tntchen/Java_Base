package cn.itheima01_InnerClass;
/*
 * 内部类在外部类局部位置
 */
public class InnerClassDemo04 {
	public static void main(String[] args) {
		//局部内部类,在其他类中是看不到的,只能通过Outer类中的
		//method方法进行访问
		Outer4 outer = new Outer4();
		outer.method4();
	}
}

class Outer4 {
	public void method4() {	
		System.out.println("method方法调用了");
		class Inner4 {
			public void show4() {
				System.out.println("局部内部类的show方法");
			}
		}
		Inner4 inner = new Inner4();
		inner.show4();
	}
}