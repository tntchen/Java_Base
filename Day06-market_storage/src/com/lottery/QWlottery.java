package com.lottery;

import java.util.ArrayList;
import java.util.Random;
/*
 * 需求:
 * 		双色球摇奖:	随机摇出1-33之间的7个随机数，不能重复
 * 
 * 分析:
 * 	定义一个ArrayList<Integer> num来存储所有双色球数字
 * 	向集合内存入1-33数字
 * 	循环重复7次选出7个数
	 *使用random选出随机数字--->方法
	 *选出数字存入集合ArrayList<Integer> lottery
	 *吧选出的数字从numremove掉
 * 	lottery输出输出
 */
public class QWlottery {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 1; i <= 33; i++) {
			list.add(i);    //
		}
		for (int j = 0; j < 7; j++) {
			int a = r.nextInt(list.size());
			System.out.print(list.get(a) + "| ");
			list.remove(a);
		}
	}
}
