package cn.homework3;
/*
 * 学生类,包括name属性
 */
public class Student {
	private String name;
	//构造方法
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	//set/get方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//重写toString方法
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}
