package cn.homework;
/*
 * 定义一个Student类(包含name和age属性),
 * 创建一个student对象,分别为name和age属性赋值,
 * 并在控制台打印name和age的属性值
 */
/*
 * 定义一个Student类
 */
class Student {
	//定义属性
	private String name;
	private int age;
	
	//构造方法
	public Student(String n,int a) {
		name = n;
		age = a;
	}
	//get方法
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	//set方法
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	//定义show方法
	public void show() {
		System.out.println("name = " + name + "	age = " + age);
	}
}

public class HomeWork2 {
	public static void main(String[] args) {
		Student student = new Student("chen",24);
		student.show();
	}
}
