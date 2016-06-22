package cn.homework1;
/*
 * 定义动物父类
 */
public abstract class Animal {
	//定义成员变量
	private String name;
	private int age;
	//构造方法
	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//set/get函数
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//跑步方法
	public void run() {
		System.out.println(getAge()+"岁的"+getName()+"正在跑步");
	}
	//吃饭方法
	public abstract void eat();
}
