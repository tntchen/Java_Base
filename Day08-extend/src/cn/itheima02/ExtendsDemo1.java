package cn.itheima02;
/*
 * 子类可以直接使用父类的情况
 */
class Fu {
	int num = 5;
}

class Zi extends Fu {
	int num2 = 6;
	
	public void show() {
		//访问fu类中num变量
		System.out.println("Fu num = "+num);
		//访问zi类中num2变量
		System.out.println("Zi num2 = "+num2);
	}
}
public class ExtendsDemo1 {
	public static void main(String[] args) {
		//new zi
		Zi zi = new Zi();
		zi.show();
	}
}
