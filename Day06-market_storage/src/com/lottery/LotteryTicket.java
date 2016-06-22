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
public class LotteryTicket {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		//输入33个数字
		for (int i = 1; i <= 33; i++) {
			num.add(i);
		}
		//定义集合lottery存储中奖号码
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		//准备循环直到选出了7个数
		for (int i = 0; i < 7; i++) {
			Random r = new Random();
			int x = r.nextInt(num.size());
			lottery.add(x);
			num.remove(x);
		}
		System.out.println("中奖号码为:");
		System.out.println(lottery);
	}
}
