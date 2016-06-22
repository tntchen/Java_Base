package cn.homework1;
/*
 * 子类,猫类
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		//重写eat抽象方法
		System.out.println("吃鱼");
	}
	//构造方法
	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}
	

}
