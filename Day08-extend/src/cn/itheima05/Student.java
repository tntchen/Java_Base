package cn.itheima05;
/*
 * 描述学生和工人两个类,将他们的共性name和age
 * 抽取出来存放在父类中,并提供相应的get和set方法.
 * 同事需要在创建学生和工人对象就必须明确姓名和年龄
 */
public class Student extends Person{

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super(name, age);
	}
	//定义学生类特有的学习方法
	public void study() {
		System.out.println("我们正在学习java");
	}
}
