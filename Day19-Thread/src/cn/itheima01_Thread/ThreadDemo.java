package cn.itheima01_Thread;

class Demo {
	String name;
	Demo(String name) {
		this.name = name;
	}
	void show() {
		for (int i=1;i<=20 ;i++ ) {
			System.out.println("name="+name+",i="+i);
		}
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		Demo d = new Demo("小强");
        Demo d2 = new Demo("旺财");
		d.show();		
		d2.show();
		System.out.println("Hello World!");
	}
}

