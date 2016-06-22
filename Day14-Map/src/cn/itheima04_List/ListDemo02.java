package cn.itheima04_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo02 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student("zhangsan",31));
		set.add(new Student("lisi",23));
		set.add(new Student("wangwu",21));
		
		List<Worker> list = new ArrayList<>();
		list.add(new Worker("xiaoqiang",45));
		list.add(new Worker("huaan",41));
		list.add(new Worker("daming",47));
		
		List<String> list2 = new ArrayList<>();
		list2.add("xiaoqiang");
		list2.add("huaan");
		list2.add("daming");
		
		List<Person> list3 = new ArrayList<>();
		
		List<Object> list4 = new ArrayList<>();
		
		printCollection(set);
		printCollection(list);
		//printCollection(list2);
		printCollection(list3);
		//printCollection(list4);
		
	}
	
	public static void printCollection(Collection<? extends Person> list) {
		for (Iterator<? extends Person> it = list.iterator(); it.hasNext();) {
			Person person = (Person) it.next();
			System.out.println(person);
		}
	}
}
