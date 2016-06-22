package cn.itheima01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 分析:
 * 	1.打印菜单
 * 		============================欢迎光临itheima超市===========================
 * 		1:货物清单	2:添加新货物	3:删除新货物	4:修改货物	5:退出系统
 * 		请您输入要操作的功能序号:
 * 	2.switch语句,根据输入的功能序号,调用对应的方法
 * 	3.发现1-4与货物有关,要对货物进行封装Goods.java
 * 	4.创建库来存储商品,ArrayList<Goods>
 * 	5.功能1:货物清单
 * 		遍历集合中商品信息
 * 	功能2:添加新货物
 * 		a.创建新商品
 * 		b.键盘录入为商品属性赋值
 * 		c.把商品添加到库存中
 * 	功能3:删除货物
 * 		a.键盘录入要删除的商品的商品编号
 * 		b.遍历集合,得到每一个商品
 * 		c.使用每个商品的商品编号与要删除的商品编号进行比较
 * 			如果相同删除库存中当前商品
 * 			如果没有,输出"库存中没有此商品
 * 	功能4:修改货物
 * 		a.键盘录入要删除的商品的商品编号
 * 		b.遍历集合,得到每一个商品
 * 		c.使用每个商品的商品编号与要修改的商品编号进行比较
 * 			如果相同修改库存中当前商品
 * 			如果不同,输出"库存中没有此商品"
 * 	功能5:退出系统
 * 		System.exit(0);
 */

public class StoreManageTea {
	public static void main(String[] args) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		
		while (true) {
			printMenu();
			//switch选择功能
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1://货物清单
				printList(list);
				break;
			case 2://添加新货物
				addGoods(list);
				break;
			case 3://删除货物
				removeGoods(list);
				break;
			case 4://修改货物
				updateGoods(list);
				break;
			case 5://退出
				exit();
				break;
			default:
				System.out.println("您输入的功能序号有误");
				break;
			}
		}
		
	}
	
	//打印菜单
	public static void printMenu() {
		System.out.println("============================欢迎光临itheima超市===========================");
		System.out.println("1:货物清单	2:添加新货物	3:删除货物	4:修改货物	5:退出系统");
		System.out.println("请您输入要操作的功能序号:");
	}
	
	//货物清单
	public static void printList(ArrayList<Goods> list) {
		System.out.println("=============================商品库存清单============================");
		System.out.println("商品编号		商品名称		商品单价");
		for (int i = 0; i < list.size(); i++) {
			Goods goods = list.get(i);
			//打印商品信息
			System.out.println(goods.id+"	"+goods.name+"		"+goods.price);
		}
	}
	
	//添加货物
	public static void addGoods(ArrayList<Goods> list) {
		Goods goods = new Goods();//声明调用
		//定义字符输入和数字输入
		Scanner sc = new Scanner(System.in);
		//输入数据
		System.out.println("请输入新水果的名称:");
		goods.name = sc.nextLine();
		System.out.println("请输入新水果的编号:");
		goods.id = sc.nextInt();
		System.out.println("请输入新水果单价:");
		goods.price = sc.nextDouble();
		
		list.add(list.size(),goods);
		System.out.println("新商品添加成功~");
	}
	
	//删除货物
	public static void removeGoods(ArrayList<Goods> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要删除的水果编号:");
		int id = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Goods goods = list.get(i);
			if (goods.id == id) {
				list.remove(i);
				System.out.println("水果信息删除完毕!");
			}
		}
	}
	
	//修改货物
	public static void updateGoods(ArrayList<Goods> list) {
		System.out.println("请输入您要修改信息的水果编号");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			Goods goods = list.get(i);
			if (goods.id == x) {
				System.out.println("请输入新的水果ID:");
				goods.id = sc.nextInt();
				System.out.println("请输入新的水果名称:");
				goods.name = sc.next();
				System.out.println("请输入新的水果单价");
				goods.price = sc.nextDouble();
				list.set(i,goods);
			}
		}
	}
	
	//退出系统
	public static void exit() {
		System.out.println("以退出系统!");
		System.exit(0);
	}
}
