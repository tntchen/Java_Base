package cn.itheima05_Collection_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 需求： 使用HashSet集合存储自定义类型元素，并遍历
 * 
 * Set元素的唯一: 重写Person类的hashcode() 与 equals()方法
 */
public class HashSetDemo {
	public static void main(String[] args) {
		//创建集合
		Set<Person> set = new HashSet<Person>(); //接口多态
		//添加元素到集合
		set.add( new Person("刘德华", 55));
		set.add( new Person("张学友", 55));
		set.add( new Person("张学友", 55));
		//遍历集合
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person p = (Person)it.next();
			System.out.println(p);
		}
		
	}
}
