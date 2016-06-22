package cn.itheima01_InnerClass;
/*
 * 内部类的细节
 */

class Outer3{
	//定义外部类成员变量
	int num = 5;
	
	//定义内部类 
	class Inner3 {
		//定义内部类成员变量
		int num = 6;
		
		//定义内部类成员方法
		public void method3(){
			//定义局部变量
			int num = 7;
			System.out.println("请将3个num的值完成打印");
			
			System.out.println("局部变量 num=" + num);
			System.out.println("内部类成员变量 num="+ this.num);//默认 Inner.this.num
			System.out.println("外部类成员变量 num=" + Outer3.this.num);//Outer.this.num
		}
	}
}


public class InnerClassDemo03 {
	public static void main(String[] args) {
		//内部类没有private修饰，在其他类中是可以访问到内部类的
		//内部类对象的创建格式:  
		//外部类.内部类 对象名 = new 外部类对象().new 内部类对象();
		Outer3.Inner3 in = new Outer3().new Inner3();
		//调用内部类中method方法
		in.method3();
	}
}
