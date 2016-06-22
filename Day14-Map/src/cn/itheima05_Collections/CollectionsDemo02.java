package cn.itheima05_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo02 {
	public static void main(String[] args) {
		//字符串类型的集合
		ArrayList<String> sList = new ArrayList<>();
		//批量添加元素到集合
		//[♣J, ♠A, ♦9, ♣2, ♣4, ♥10, 小王, ♥9, ♥A, ♣A, ♥J, ♦5, ♦7, ♦3, ♣8, ♦10, 大王]
		Collections.addAll(sList, "♠A","♥10"," ♥9","♥J","♦10","♣J","小王");
		//排序
		Collections.sort(sList);
		
		System.out.println(sList);
	}
}
