package cn.itheima07_修饰符1;

/*
 * 类、方法、成员变量使用修饰符后，使用范围的演示
 * 
 * 				public	protected	默认的		private
	在当前类中		Y		Y			Y		Y
	同一包中的子类	Y		Y			Y
	同一包中的其他类	Y		Y			Y
	不同包中的子类	Y		Y
	不同包中的其他类	Y
 */
public class Fu {
	//public修饰的方法
	public void method1(){
		System.out.println("我是public方法");
	}
	//protected修饰的方法
	protected void method2(){
		System.out.println("我是protected方法");
	}
	//默认修饰的方法
	void method3(){
		System.out.println("我是默认修饰的方法");
	}
	//private修饰的方法
	private void method4(){
		System.out.println("我是private方法");
	}
	
	public static void main(String[] args) {
		Fu f = new Fu();
		f.method1();
		f.method2();
		f.method3();
		f.method4();
	}
}
