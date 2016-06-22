package cn.itheima01_static;
/* 
 * 代码块执行先后顺序： 
 * 	静态代码块-->构造代码块-->构造方法
 * 
 * 注意： 静态代码块，创建多个对象时，只调用一次
 *     构造代码块，每创建一个对象，调用一次
 */
class Student {
	private String name;
	private int age;
	//静态代码块
	static{
		System.out.println("静态代码块执行了");
	}	
	//构造代码块
	{
		System.out.println("构造代码块执行了");
	}
	//构造方法
	Student(){
		System.out.println("Person无参数的构造函数执行");
	}
	Student(int age){
		this.age = age;
		System.out.println("Person（age）参数的构造函数执行");
	}
}

public class CodeBlock02 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("--------------");
		Student s2 = new Student(30);
		
	}
}
