package cn.itheima04;

/*
 * 子父类中的构造方法
 */
class Fu {
	int num;
	//空参数构造方法
	public Fu() {
		System.out.println("父类构造方法=" + num);
		num = 5;
	}
}

class Zi extends Fu {
	//空参数构造方法
	public Zi() {
		System.out.println("子类构造方法=" + num);
	}
}
public class Test {
	public static void main(String[] args) {
		new Zi();
	}
}
