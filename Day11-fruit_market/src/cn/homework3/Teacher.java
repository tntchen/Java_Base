package cn.homework3;
/*
 * 老师类-父类
 */
abstract class Teacher {
	//属性
	private String name;
	private int age;
	private boolean JP;//是否会说日语
	
	//set/get方法
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public boolean isJP() {
		return JP;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setJP(boolean jP) {
		JP = jP;
	}

	//构造方法
	public Teacher(String name, int age, boolean jP) {
		super();
		this.name = name;
		this.age = age;
		JP = jP;
	}
	public Teacher() {
		super();
	}

	//特殊功能-讲课
	public abstract void teach();
	
}
