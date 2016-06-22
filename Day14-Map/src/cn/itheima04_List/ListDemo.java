package cn.itheima04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * 编写一个用来遍历集合的通用方法
 */
public class ListDemo {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("aaa");
		stringList.add("bbb");
		printCollection(stringList);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(111);
		intList.add(222);
		printCollection(intList);
		
	}
	//遍历集合
	public static void printCollection(Collection<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
