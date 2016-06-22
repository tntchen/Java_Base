package cn.itheima06_Collection_Foreach;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型：<数据类型>
 * 什么使用可以使用泛型呢？  通过查看API发现, 只要类、接口、方法、返回值上有<>就可以使用泛型
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建集合
		ArrayList<String> list = new ArrayList<String>();
		//添加元素到集合
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//迭代器遍历
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}
	
}
