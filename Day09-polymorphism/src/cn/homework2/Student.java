package cn.homework2;
/*
 * 定义Student类继承Person类，定义学习方法，并重写Person类的吃饭方法
 */
public class Student extends Person {

	@Override
	public void eat() {
		//重写吃饭方法
		System.out.println(getName()+"正在吃饭");
	}
	//定义特有的学习方法
	public void study() {
		System.out.println("正在努力学习");
	}
	//构造方法
	public Student() {
		super();
	}
	public Student(String name) {
		super(name);
	}
}
