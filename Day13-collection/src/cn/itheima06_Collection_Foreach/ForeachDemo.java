package cn.itheima06_Collection_Foreach;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 增强版的for循环
 * 可以对数组与集合进行遍历
 * 格式：
 * 	 for (元素数据类型   元素名 : 要遍历的数组对象 或者集合对象) {
 *      执行语句..
 *   }
 *   
 *   HashSet<Person> set = new HashSet<Person>();
 *   
 *   for (Person p : set ){
 *   	SOP(p);
 *   }
 */
public class ForeachDemo {
	public static void main(String[] args) {
		//打印数组
		int[] arr= {1,23,5};
		//普通for循环
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------");
		
		//增强for循环
		for (int i : arr) {
			System.out.println(i);
		}
		
		//-------------------------------------
		//打印集合
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbbb");
		list.add("cccc");
		//迭代器方式
		for ( Iterator<String> it = list.iterator(); it.hasNext();  ) {
			System.out.println( it.next() );
		}
		//增强for循环
		for( String str : list ){
			System.out.println(str);
		}
		
		
	}
}
