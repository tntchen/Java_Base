package cn.itheima01_InnerClass;
/*
 * 在其他类中，向访问私有修饰的内部类中的成员
 */

abstract class Fu6 {
	public abstract void show6();
}

class Outer6 {
	private int num = 0;
	
	//定义private修饰的内部类
	private class Inner6 extends Fu6 {
		//重写父类中所有的抽象方法
		public void show6(){
			System.out.println("私有内部类的show方法");
		}
	}
	
	//为private修饰的内部类，提供get方法，用来获取Inner类对象
	//public Inner getObject(){
	public Fu6 getObject(){	 //返回值  Fu f = new Inner(); 多态
		return new Inner6();
	}
}

public class InnerClassDemo06 {
	public static void main(String[] args) {
		//访问私有内部类中的show方法
		Outer6 ou = new Outer6();
		
//		 * 调用外部类中的getObject()方法，得到内部类对象inner
//		 * Inner类是私有的，在其他类中 访问不了，无法使用
		 
		//Inner in = ou.getObject();
		
		//代码修改成public Fu getObject(){} 后，再次调用方法
		Fu6 f = ou.getObject();// Fu f = new Inner(); 多态
		//调用show方法, 由于多态的原因，调用方法时，会执行子类的方法
		f.show6();
	}
}
