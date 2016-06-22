package cn.itheima03;
/*
 * 子类中方法的特点
 * 
 * 子父类中方法名字不同
 */
class Fu {
	public void show() {
		System.out.println("父类的show方法执行了");
	}
}

class Zi extends Fu {
	public void show() {
		System.out.println("子类中的show2方法执行了");
	}
}
public class Test {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.show();
		//zi.show2();
	}
}
