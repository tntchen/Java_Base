package cn.itheima04;

/*
 * 子父类中的构造方法
 */
class Fu3 {
	int num;
	//空参数构造方法
	public Fu3() {
		System.out.println("父类构造方法=" + num);
		num = 5;
	}

}

class Zi3 extends Fu3 {
	//空参数构造方法
	public Zi3() {
		this("Hello");//调用Zi3类中有参数构造方法
		System.out.println("子类构造方法=" + num);
	}
	
	//有参数构造方法
	public Zi3(String s) {
		//super();
		System.out.println("子类构造方法=" + s);
	}
}
public class Test3 {
	public static void main(String[] args) {
		new Zi3();
	}
}
