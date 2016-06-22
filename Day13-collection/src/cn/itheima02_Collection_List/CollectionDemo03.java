package cn.itheima02_Collection_List;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 在collection中存进去的数据还是原来的数据吗?
 */


public class CollectionDemo03 {
	public static void main(String[] args) {
		Collection<Object> list = new ArrayList<>();
		
		//添加元素到集合
		list.add(new Object());
		list.add("Hello");
		list.add(123);
		list.add(false);
		
		//打印集合
		System.out.println(list);
		System.out.println(list.toString());
	}
}
