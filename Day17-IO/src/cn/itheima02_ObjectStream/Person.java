package cn.itheima02_ObjectStream;

import java.io.Serializable;

/*
 * Person类是要在IO流中传输的,该Person必须要实现序列化接口
 */
public class Person implements Serializable {
	//序列化版本号
	private static final long serialVersionUID = 1L;
	private String name;
	private transient int age;//年龄为瞬时态
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
