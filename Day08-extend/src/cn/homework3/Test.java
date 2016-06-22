package cn.homework3;
/*
 * 定义一个perso父类,属性包括姓名,工号,薪水,工作内容
 * 再定义一个programmer子类和manager子类,并在manager子类中添加奖金的录入
 * 在两个子类中定义打印雇员信息的功能
 */
//创建测试类
public class Test {
	public static void main(String[] args) {
		//创建一个程序员子类
		Programmer programmer = new Programmer("Jobs",9001,"20k","programming");
		//调用打印子类
		programmer.printInfo();
		
		//创建一个经理子类
		Manager manager = new Manager("Gates",9002,"50k","管理",50000);
		manager.printInfo();
	}
}
