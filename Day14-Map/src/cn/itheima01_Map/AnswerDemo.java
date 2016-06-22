package cn.itheima01_Map;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 关于迭代器Iterator的子类问题
 */
public class AnswerDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		System.out.println(list);
		
		//迭代
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String str = (String) iterator.next();
			System.out.println(str);
		}
		
		for (Iterator<String> iterator2 = list.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
	}
}
