package cn.itheima01_InnerClass;
/*
 * 匿名内部类： 就是一个带有内容的对象
 * 匿名内部类使用的前提条件： 需要有一个父类或者有一个接口
 */

interface Fu7 {
	public abstract void show();
	public abstract void show2();
}

class Outer7 {
	/*//定义一个内部类
	class Inner7 implements Fu7{
		public void show(){}
		public void show2(){}
	}
	public void method7(){
		Inner7 in = new Inner7();
		in.show();
	}*/
	
	
	//简化形式
	public void method7(){
		//new Inner().show();
		//接口与抽象类不能直接new对象，原因是内部包含了抽象方法，只要重写了全部抽象方法就可以new对象了
		//new Fu，它是一个带有内容的Fu类的子类对象,称为匿名内部类
		new Fu7(){//1234
			public void show(){System.out.println("haha");}
			public void show2(){}
		}.show();
	}
}


public class InnerClassDemo07 {
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.method();
	}
}
