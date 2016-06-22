package cn.homework2;
//定义水果父类
abstract class Fruit {
	private String fruitname;
	//构造函数

	public Fruit() {
		super();
	}
	public Fruit(String fruitname) {
		super();
		this.fruitname = fruitname;
	}
	//定义set/get方法
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
}
//定义苹果子类
class Apple extends Fruit implements Squeeze {	
	//构造方法
	public Apple() {
		super();
	}
	public Apple(String fruitname) {
		super(fruitname);
	}
	public void juice() {
		// 重写榨汁抽象方法--苹果
		System.out.println("放入"+getFruitname()+"榨出了苹果汁");
	}
}
//定义香蕉子类
class Banana extends Fruit implements Squeeze {
	//构造方法
	public Banana() {
		super();
	}
	public Banana(String fruitname) {
		super(fruitname);
	}
	public void juice() {
		// 重写榨汁抽象方法--香蕉
		System.out.println("放入"+getFruitname()+"榨出了香蕉牛奶");
	}
}
//定义榴莲子类
class JackFruit extends Fruit implements Squeeze {
	//构造方法
	public JackFruit() {
		super();
	}
	public JackFruit(String fruitname) {
		super(fruitname);
	}
	public void juice() {
		// 重写榨汁抽象方法--苹果
		System.out.println("放入"+getFruitname()+"榨出了榴莲汁");
	}
}