package cn.itheima04;

/*
 * 子父类中的构造方法
 */
class Fu2 {
	int num;
	/*//空参数构造方法
	public Fu2() {
		System.out.println("父类构造方法=" + num);
		num = 5;
	}*/
	
	//有参数的构造方法
	public Fu2(int num) {
		System.out.println("父类构造方法=" + num);
		this.num = num;
	}
}

class Zi2 extends Fu2 {
	//空参数构造方法
	public Zi2() {
		super(123);//调用了父类的有参数构造方法
		System.out.println("子类构造方法=" + num);
	}
}
public class Test2 {
	public static void main(String[] args) {
		new Zi2();
	}
}
