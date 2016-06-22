package cn.itheima07_修饰符1;

public class Other {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.method1();
		f.method2();
		f.method3();
		//f.method4(); //在其他类中，不能访问Fu类中的私有方法
	}
}
