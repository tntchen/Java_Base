package cn.homework2;
/*
 * 定义一个Person类，定义吃饭和睡觉方法并用打印语句描述
 */
public abstract class Person {
	private String name;//定义人的姓名
	//构造方法
	public Person() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}
	//get/set
	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	//睡觉方法
	public void sleep() {
		System.out.println(getName()+"正在睡觉");
	}
	//吃饭方法
	public abstract void eat();
}
