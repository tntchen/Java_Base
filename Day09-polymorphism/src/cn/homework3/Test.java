package cn.homework3;
/*定义一个Squeeze接口,抽象榨汁方法
定义一个fruit父类,三个水果的子类
子类分别继承fruit父类并实现Squeeze接口
并实现接受水果的输出,打印水果和榨汁三个功能*/
//编写测试类
public class Test {
	public static void main(String[] args) {
		//创建一个apple子类
		Apple apple= new Apple("苹果");
		//输出果汁
		apple.juice();
		
		//创建一个banana子类
		Banana banana = new Banana("香蕉");
		banana.juice();
		
		//创建一个JackFruit子类
		JackFruit jackFruit = new JackFruit("榴莲");
		jackFruit.juice();
	}
}
