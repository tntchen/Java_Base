package cn.itheima05_Collection_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		//创建集合对象
		Set<String> set = new LinkedHashSet<String>();
		
		//添加元素到集合
		set.add("bbb");
		set.add("aaa");
		set.add("abc");
		set.add("bbc");
		//使用迭代器，遍历集合元素
		for (Iterator<String> it = set.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}
}
