package cn.itheima04_duotai;

class Fu3 {
	int num = 4;
	static void method() {
		System.out.println("Fu static method run");
	}
}

class Zi3 extends Fu3 {
	int num = 5;
	static void method() {
		System.out.println("Zi static method run");
	}
}

public class Demo03 {
	public static void main(String[] args) {
		Fu3 f = new Zi3();
		f.method();
	}
}
