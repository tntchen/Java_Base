package cn.itheima02_duotai;
/*
 * 子类，猫类
 */
public class Cat extends Animal {
	//重写ANimal中所有的抽象方法
	public void eat(){
		System.out.println("吃鱼");
	}
	
	//特有方法
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}
