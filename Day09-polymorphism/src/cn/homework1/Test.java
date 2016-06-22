package cn.homework1;
/*
 * 分析:
 * Animal类:父类,属性有姓名年龄,功能包括跑步方法,一个抽象的吃方法
 * Cat类,Dog类:子类,分别重写了抽象的吃方法
 * Test类:测试类,调用不同功能进行测试
 */
/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//创建对象--猫
		Animal a = new Cat("Tom",5);
		//跑步
		a.run();
		//吃饭
		a.eat();
		
		//创建对象--狗
		Animal b = new Dog("Doge",4);
		b.run();
		b.eat();
	}
}
