package cn.itheima07_修饰符1;

public class Zi extends Fu{
	public static void main(String[] args) {
		Fu f = new Zi();
		f.method1();
		f.method2();
		f.method3();
		//f.method4(); 父类私有方法，子类无法使用
	}
}
