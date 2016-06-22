package cn.homework3;
/*
 * 就业班老师子类
 */
class WorkTeacher extends Teacher implements Language {
	//构造方法
	public WorkTeacher() {
		super();
	}

	public WorkTeacher(String name, int age, boolean jP) {
		super(name, age, jP);
	}

	@Override
	public void teach() {
		//重写讲课方法
		System.out.println("在就业班讲课");
	}
	
	@Override
	public void Japanese() {
		//重写日语抽象方法
		System.out.println("说日语");
	}
}
