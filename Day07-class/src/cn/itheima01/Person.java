package cn.itheima01;

/*
 * Person 人类
 * 属性:名字,年龄
 * 方法:说话
 */
public class Person {
	//定义成员变量
	private String name;
	private int age;
	
	public void show() {
		System.out.println("名字="+name+"	年龄="+age);
	}
/*	成员变量私有后,需要提供public修饰的方法,
	才能给对私有的成员变量进行访问*/
	//给成员变量age赋值的方法
	public void setAge(int a) {
		if (a<0 || a>100) {
			System.out.println("年龄赋值不正确");
			return;
		}
		age = a;
	}
	//获取成员变量age的方法
	public int getAge() {
		return age;
	}
	
}
