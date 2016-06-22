package cn.itheima04_Collection_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListDemo01 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		//增加元素
		list.add(new Student("xiaoqiang1",21));
		list.add(new Student("xiaoqiang2",22));
		list.add(new Student("xiaoqiang3",23));
		
		//插入元素
		list.add(new Student("wangcai",25));
		
		//删除元素
		list.remove(4);
		
		//修改元素
		list.set(1,new Student("xiaoming",11));
		
		for (Iterator<Student> iterator = list.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			
		}
	}
}
