package cn.itheima01_InnerClass;
/*
 * 内部类也可以继承父类，实现接口
 */

//父类
abstract class Fu5 {
	public abstract void method5();
}

class Outer5 {
	//定义内部类
	class Inner5 extends Fu5 {
		//重写父类中所有的抽象方法
		public void method5(){
			System.out.println("在内部类中，重写了父类中的抽象方法");
		}
	}
	
	//在外部类中，定义一个成员方法
	public void show5(){
		//创建内部类对象，调用内部类中的method方法
		Inner5 in = new Inner5();
		in.method5();
	}
}

//测试类
public class InnerClassDemo05 {
	public static void main(String[] args) {
		Outer5 ou = new Outer5();
		ou.show5();
	}
}
