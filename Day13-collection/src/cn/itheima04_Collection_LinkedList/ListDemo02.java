package cn.itheima04_Collection_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * 在list集合迭代元素中，对元素进行判断，一旦条件满足就添加一个新元素
 */
public class ListDemo02 {
	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<>();
		
		// 添加元素到集合
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		/*
		//遍历集合,此种方法不能插入元素
		Iterator it = list.iterator();
		//判断是否有下一个元素可以获取
		while (it.hasNext()) {
			//获取集合中的元素
			Object obj = it.next();
			//条件判断，如果当前元素值为"abc2"，则添加新元素"itcast"
			if ("abc2".equals(obj)) {
				//添加新元素"itcast"
				list.add("itcast");
			}
		}
		*/
		
		//获取列表迭代器对象
		ListIterator<String> lit = list.listIterator();
		//判断是否有下一个元素可以获取
		while (lit.hasNext()) {
			//获取元素
			Object obj = lit.next();
			//条件判断，如果当前元素值为"abc2"，则添加新元素"itcast"
			if ("abc2".equals(obj)) {
				//使用列表迭代器中的add方法，添加新元素"itcast"
				lit.add("itcast");
			}
		}
		
		
		//打印集合内容 
		System.out.println(list);
	}
}
