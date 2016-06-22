package cn.itheima06_Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * 斗地主洗牌发牌案例
 * 1.准备牌(每张牌由花色和数字组成)
 * 		1.1 创建集合,用来存放花色(♠♥♦♣)
 * 		1.2 创建集合,用来存放数字(3,4,5,6,7,8,9,10,J,Q,K,A,2)
 * 		1.3 组装牌
 * 			for(数字) {
 * 				for(花色) {
 * 				}
 * 			}
 * 			添加大小王
 * 2.洗牌,通过牌的编号进行洗牌
 * 		2.1 创建一个ArrayList<Integer>集合,用来存储0~53编号,添加编号到集合
 * 		2.2 吧集合随机打乱
 * 3.发牌
 * 		3.1 创建玩家1,2,3,底牌集合,存储牌的编号
 * 		3.2 把牌的编号发给三个玩家
 * 		3.3 对三个玩家的集合进行排序
 * 		3.4 创建新的玩家1,2,3,底牌集合,存储牌
 * 		3.5 通过Map集合使用编号获取牌存储到新的集合中
 */
public class Poker {
	public static void main(String[] args) {
		/*准备牌*/
		//创建集合,用来存放花色(♠♥♦♣)
		ArrayList<String> color =new ArrayList<>();
		Collections.addAll(color, "♠","♥","♦","♣");
		
		//创建集合,用来存放数字(3,4,5,6,7,8,9,10,J,Q,K,A,2)
		ArrayList<String> number = new ArrayList<>();
		Collections.addAll(number, "3","4","5","6","7","8","9","10","J","Q","K","A","2");
		
		//组装牌HashMap<Integer,String>
		HashMap<Integer, String> map = new HashMap<>();
		
		int index = 0;
		for (String thisNumber : number) {//数字
			for (String thisColor : color) {//花色
				map.put(index, thisColor+thisNumber);//编号=花色+数字
				index ++;
			}
		}
		//添加大小王
		map.put(index++, "小王");
		map.put(index++, "大王");
		
		//System.out.println(map);//测试
		
		/*洗牌*/
		//创建一个ArrayList<Integer>集合,用来存储0~53编号,添加编号到集合
		ArrayList<Integer> pokerNumber = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			//把牌的编号添加到集合
			pokerNumber.add(i);
		}
		//把集合随即打乱
		Collections.shuffle(pokerNumber);
		//System.out.println(pokerNumber);//测试
		
		/*发牌*/
		//创建玩家1,2,3,底牌集合,存储牌的编号
		ArrayList<Integer> player1 = new ArrayList<>();
		ArrayList<Integer> player2 = new ArrayList<>();
		ArrayList<Integer> player3 = new ArrayList<>();
		ArrayList<Integer> dipai = new ArrayList<>();
		//把牌的编号发给三个玩家
		for (int i = 0; i < 54; i++) {
			if (i >= 51 ) {
				dipai.add(pokerNumber.get(i));
			} else {
				if (i % 3 == 0) {
					player1.add(pokerNumber.get(i));
				}	else if (i % 3 == 1) {
					player2.add(pokerNumber.get(i));
				} else {
					player3.add(pokerNumber.get(i));
				}
			}
		}
		
		//对三个玩家的集合进行排序
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		
		//创建新的玩家1,2,3,底牌集合,存储牌
		ArrayList<String> strPlayer1 = new ArrayList<>();
		ArrayList<String> strPlayer2 = new ArrayList<>();
		ArrayList<String> strPlayer3 = new ArrayList<>();
		ArrayList<String> strDipai = new ArrayList<>();
		
		//通过Map集合使用编号获取牌存储到新的集合中
		//存储玩家1
		for (int n : player1) {
			//n代表编号
			String strPoker = map.get(n);
			strPlayer1.add(strPoker);
		}
		for (int n : player2) {
			//n代表编号
			String strPoker = map.get(n);
			strPlayer2.add(strPoker);
		}
		for (int n : player3) {
			//n代表编号
			String strPoker = map.get(n);
			strPlayer3.add(strPoker);
		}
		for (int n : dipai) {
			//n代表编号
			String strPoker = map.get(n);
			strDipai.add(strPoker);
		}
		
		/*看牌*/
		System.out.println(strPlayer1);
		System.out.println(strPlayer2);
		System.out.println(strPlayer3);
		System.out.println(strDipai);
	}
}
