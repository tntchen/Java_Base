package cn.itheima09;
/*
 * 具体的类,让类与接口产生关系:实现关系implements
 */
public class Zi implements Fu {
	//重写接口中所有的抽象方法
	@Override
	public void show() {
		System.out.println("show方法");
	}

	@Override
	public void show2() {
		System.out.println("show2方法");
	}
}
