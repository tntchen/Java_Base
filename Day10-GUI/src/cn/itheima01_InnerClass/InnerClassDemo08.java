package cn.itheima01_InnerClass;
/*
 * 匿名内部类练习
 */

interface Fu8 {
	public abstract void show();
}

//外部类
class Outer8 {
	//定义一个今天方法
	public static Fu8 method8(){
		//请返回一个Fu类型的对象
		//return new Fu(); 接口不能直接创建对象
		
		//返回了一个带有内容的Fu接口子类对象
		return new Fu8(){
			//重写接口中所有的抽象方法
			public void show(){
				System.out.println("采用匿名内部类实现了该功能");
			}
		};
	}
}

public class InnerClassDemo08 {
	public static void main(String[] args) {
		//调用Fu中的show方法
		Fu8 f = Outer8.method8(); // Fu f = new Zi();
		f.show();
	}
}
