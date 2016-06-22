package cn.itheima07_Poker;

import java.util.ArrayList;
import java.util.Collections;

/*
 	准备牌：
	牌可以设计为一个ArrayList<String>,每个字符串为一张牌。
	每张牌由花色数字两部分组成，我们可以使用花色集合与数字集合嵌套迭代完成每张牌的组装。
	牌由Collections类的shuffle方法进行随机排序。
	发牌：
	将每个人以及底牌设计为ArrayList<String>,将最后3张牌直接存放于底牌，剩余牌通过对3取模依次发牌。
	看牌：
	直接打印每个集合。
 */
public class Poker {
	public static void main(String[] args) {
		//♠♥♦♣
		/*
		 * 准备牌
		 */
		//创建一个集合，用来存储54张牌
		ArrayList<String> poker = new ArrayList<String>();
		//花色
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("♥");
		colors.add("♦");
		colors.add("♠");
		colors.add("♣");
		//牌的数字
		ArrayList<String> number = new ArrayList<String>();
		//数字部分 2-10
		for (int i = 2; i <= 10; i++) {
			number.add(i + "");
		}
		number.add("J");
		number.add("Q");
		number.add("K");
		number.add("A");
		
		//把牌 组合起来, 每张牌由 花色与数字组成
		//指定花色
		for (String color : colors) {
			//指定数字
			for (String n : number) {
				//每张牌由 花色与数字组成
				poker.add(color + n );
			}
		}
		//添加大小王
		poker.add("大王");
		poker.add("小王");
		
		/*
		 * 洗牌
		 */
		Collections.shuffle(poker);
		
		/*
		 * 发牌
		 * 玩家一 player1
		 * 玩家二 player2
		 * 玩家三 player3
		 * 留三张底牌
		 */
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		ArrayList<String> player3 = new ArrayList<String>();
		ArrayList<String> dipai = new ArrayList<String>();
		for (int i = 0; i < poker.size(); i++) {
			if (i >= 51) {
				//把最后的三张牌 给底牌
				dipai.add( poker.get(i) );
			} else {
				//把前51张牌，平均分给3个玩家
				if (i % 3 == 0) {
					//给玩家一
					player1.add( poker.get(i) );
				} else if (i % 3 == 1){
					//给玩家二
					player2.add( poker.get(i) );
				} else if (i % 3 == 2){
					//给玩家三
					player3.add( poker.get(i) );
				}
			}
		}
		//看牌
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(dipai);
		
	}
}
