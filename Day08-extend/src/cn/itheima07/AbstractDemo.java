package cn.itheima07;
/*
 * 抽象类与抽象方法
 * 1.抽象类和抽象方法都需要被abstract修饰,抽象方法一定要定义在抽象类中
 * 2.抽象类不可以创建实例,因为调用抽象方法没有意义
 * 3.只有覆盖了抽象类中所有的抽象方法后,其子类才可以实例化,否则该子类还是一个抽象类
 */
abstract class Person {
	//共性方法吃饭进行抽取
	public abstract void eat();
}
class Boy extends Person {
	public void eat() {
		System.out.println("狼吞虎咽的吃");
	}
}
class Girls extends Person {
	public void eat() {
		System.out.println("细嚼慢咽的吃");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		//创建boy类对象
		Boy boy = new Boy();
		boy.eat();
		
		Girls girls = new Girls();
		girls.eat();
	}
}
