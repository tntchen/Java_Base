package cn.homework3;
/*
 * 基础班老师子类
 */
class BaseTeacher extends Teacher implements Language {	
	//构造方法
	public BaseTeacher() {
		super();
	}
	public BaseTeacher(String name, int age, boolean jP) {
		super(name, age, jP);
	}

	@Override
	public void teach() {
		//重写讲课方法
		System.out.println("在基础班讲课");
	}
	
	@Override
	public void Japanese() {
		// 重写日语方法
		System.out.println("说日语");
	}

}
