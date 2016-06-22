package cn.homework1;

public class Dog extends Animal {

	@Override
	public void eat() {
		//重写eat抽象方法
		System.out.println("吃骨头");
	}
	//构造方法
	public Dog() {
		super();
	}

	public Dog(String name, int age) {
		super(name, age);
	}
	
}
