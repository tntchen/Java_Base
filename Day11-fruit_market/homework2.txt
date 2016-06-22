package cn.homework2;

interface Inter {
	public abstract void show();
}

class Outer {
	public void method(){
		new Inter(){
			public void show(){System.out.println("匿名内部类被调用");}
		}.show();
	}
}


public class InnerClassDemo {
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.method();
	}
}