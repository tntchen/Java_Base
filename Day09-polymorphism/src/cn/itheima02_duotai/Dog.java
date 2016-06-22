package cn.itheima02_duotai;

/*
 * 子类，狗类
 */
public class Dog extends Animal {
	//重写抽象类中所有的抽象方法
	public void eat(){
		System.out.println("吃骨头");
	}
	
	//特有功能
	public void lookHome(){
		System.out.println("看家");
	}
}
