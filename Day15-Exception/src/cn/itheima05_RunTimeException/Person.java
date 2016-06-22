package cn.itheima05_RunTimeException;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		//加入逻辑判断
		if (age<0 || age>200) {
			throw new NoAgeException(age + ",年龄数值非法");
		}
		this.name = name;
		this.age = age;
	}
	//定义Person对象对应的字符串表现形式,覆盖Object中的toString方法
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
