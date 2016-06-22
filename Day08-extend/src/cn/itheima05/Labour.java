package cn.itheima05;
/*
 * 描述学生和工人两个类,将他们的共性name和age
 * 抽取出来存放在父类中,并提供相应的get和set方法.
 * 同事需要在创建学生和工人对象就必须明确姓名和年龄
 */
public class Labour extends Person {

	public Labour() {
		super();
	}

	public Labour(String name, int age) {
		super(name, age);
	}
	//定义工人类的特有方法
	public void work() {
		System.out.println("正在修门");
	}
}
