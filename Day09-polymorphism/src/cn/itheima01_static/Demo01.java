package cn.itheima01_static;

/*
 * 静态修饰的方法中无法访问非静态的属性和方法。这是为什么呢？
 * 
 * 1、静态是随着类的加载就加载了。也是随着类的消失而消失了。
   2、静态优先于对象存在，被对象共享。
   3、因为静态先存在于内存中无法访问后来的对象的中的数据，所以静态无法访问非静态。
                 而且内部无法书写this。因为这时对象有可能不存在，this没有任何指向。
 */
class Person {
	//成员变量
	private String name;
	//构造方法
	public Person(String name) {
		super();
		this.name = name;
	}
	//说话方法,说出自己的名字
	public void speak(){
		System.out.println("name="+ name);
		//sleep();
	}
	//睡觉方法，打呼噜的方式睡觉
	public static void sleep(){
		System.out.println("打呼噜ZZZ..噜噜噜...");
		//System.out.println("name=" + name); 报错
		//speak(); 报错
		//System.out.println(this.name);  报错
	} 
}

public class Demo01 {
	public static void main(String[] args) {
		//创建Person类对象
		Person p = new Person("黄晓明");
		p.speak();
		//p.sleep();
		
		//静态方法的第二种调用形式
		//类名.方法名();
		//Person.sleep();
	}
}
