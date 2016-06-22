package cn.itheima01_static;

class Demo{
	static int x = 1; //静态成员变量
	int y = 1;	 //非静态成员变量
	static  {//静态代码块
		System.out.println("static code...x="+x);
	}
	{//构造代码块
		System.out.println("cons code ...y="+y);
		//为成员变量y赋值
		y = 2;
	}
	Demo(){//构造函数
		System.out.println("cons function ...y="+y);
		//为成员变量y赋值
		y = 3;
	}
}

public class CodeBlock03 {
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println("main y="+ d.y);
	}
}
