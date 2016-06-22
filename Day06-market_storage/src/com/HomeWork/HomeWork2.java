package com.HomeWork;
/*
 * 需求:实现查看水果界面功能
 */
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		//定义商品信息的集合
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		
		Fruit a = new Fruit();
		a.id = 9056;
		a.name = "泰国空运大榴莲";
		a.price = 120.0;
		a.unit = "个";
		list.add(a);

		Fruit b = new Fruit();
		b.id = 3025;
		b.name = "昌平农家有机草莓";
		b.price = 20.0;
		b.unit = "斤";
		list.add(b);

		Fruit c = new Fruit();
		c.id = 2012;
		c.name = "新疆原产哈密瓜";
		c.price = 7.0;
		c.unit = "斤";
		list.add(c);
		
		while (true) {
			//打印操作界面,并选择操作
			int choose = printMenu();

			switch (choose) {
			case 1://查看水果界面
				showList(list);
				break;
			case 2://总收入查询
				break;
			case 3://查询货物
				break;
			case 4://添加新货物
				break;
			case 5://删除货物
				break;
			case 6://修改货物
				break;
			case 7://退出查询
				System.out.println("已退出");
				System.exit(0);
				break;
			default://异常
				System.out.println("输入错误参数");
				break;
			
			}
		}
	}
 
//打印操作界面
	public static int printMenu() {
		System.out.println("老板,请选择您要执行的操作");
		System.out.println("1:查看水果界面 2:总收入查询");
		System.out.println("3:查询货物 4:添加新货物 5:删除货物 6:修改货物");
		System.out.println("7:退出查询");
		System.out.println("您的操作是:");
		
		int x = enterNumber();
		return x;
		
}

//接受键盘录入
	public static int enterNumber() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		return x;
	}

//查看水果界面
	public static void showList(ArrayList<Fruit> list) {
		System.out.println("水果编号	"+"水果名称		"+"水果单价	"+"计价单位");
		for (int i=0;i<list.size();i++ ) {
			Fruit fruit = list.get(i);
			System.out.println(fruit.id+"		"+fruit.name+"		"+fruit.price+"		"+fruit.unit);
		}
	}
}

//定义水果类
/*class Fruit {
	int id;//商品编号
	String name;//商品名称
	double price;//商品价格
	String unit;//商品单位
}*/