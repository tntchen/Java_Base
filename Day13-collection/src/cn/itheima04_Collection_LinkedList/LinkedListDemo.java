package cn.itheima04_Collection_LinkedList;

import java.util.LinkedList;

/*
 * LinkedList 集合
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		
//		System.out.println(link.getFirst());
//		System.out.println(link.getLast());
//		
//		System.out.println(link.removeFirst());
//		System.out.println(link.removeLast());
		
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
       }
		
		System.out.println("link=" + link);
	}
}
