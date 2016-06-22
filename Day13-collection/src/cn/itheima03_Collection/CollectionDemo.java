 package cn.itheima03_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 需求:使用集合存储自定义类型与哀伤怒,并遍历集合 
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//1.定义一个集合
		Collection<Object> list = new ArrayList<>();
		
		//2,创建自定义类
		Person p1 = new Person("Bob", 18);
		Person p2 = new Person("Tom", 20);
		//3.把元素存储到集合
		list.add(p1);
		list.add(p2);
		//4.遍历结合
		Iterator<Object> it = list.iterator();
		//通过循环使用迭代器对象,获取集合元素并打印
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName() + "--" + p.getAge());
		}
		
	}
}
