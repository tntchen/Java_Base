package cn.itheima05;
/*
 * 描述学生和工人两个类,将他们的共性name和age
 * 抽取出来存放在父类中,并提供相应的get和set方法.
 * 同事需要在创建学生和工人对象就必须明确姓名和年龄
 */


class Person {
	private String name;
	private int age;
	
	//构造方法
	public Person() {
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//set/get方法
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
}
