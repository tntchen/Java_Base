package cn.homework2;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 使用Set集合存储下列单词“till”，“speack”，“do”，“util”
 * ，“it”，使用增强for获取集合中的并在元素并控制台输出该集合长度
 */
public class SetDemo {
	public static void main(String[] args) {
		//创建set集合对象
		Set<String> set= new LinkedHashSet<String>();
		//向集合添加元素
		set.add("till");
		set.add("speack");
		set.add("do");
		set.add("util");
		set.add("it");
		
		System.out.println("集合元素有:");
		//使用增强for获取集合中的元素
		for (String str : set) {
			System.out.println(str);
		}
		//输出该集合长度
		System.out.println("该集合长度:" + set.size());
	}
}
