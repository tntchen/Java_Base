package cn.itheima04_duotai;

class Fu2 {
	int num = 10;
	void show() {
		System.out.println("Fu show num");
	}
}

class Zi2 extends Fu2 {
	int num = 20;
	void show() {
		System.out.println("Zi show num");
	}
}

class Demo02 {
	public static void main(String[] args) {
		Fu2 fu = new Zi2();
		fu.show();
	}
}
