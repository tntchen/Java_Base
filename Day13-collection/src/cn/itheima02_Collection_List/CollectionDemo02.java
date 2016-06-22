package cn.itheima02_Collection_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * 迭代器的演示
 * 需求:把集合中的元素一个个取出来,进行打印
 * 1.定义一个存储元素的集合
 * 2.创建元素,把元素添加到集合中
 * 3.使用迭代器进行集合的元素的遍历
 * 		3.1先判断集合中是否有可以获取的元素
 * 		3.2获取该元素
 * 		3.3来到下一个元素的位置,看是否有元素可以获取,如果可以执行3.2
 * 
 * 方法:
 * Collection接口中的方法:
 * Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器
 * 迭代器中的方法:
 * boolean hasNext() 如果仍有元素可以迭代，则返回 true
 * E next() 返回迭代的下一个元素
 */
public class CollectionDemo02 {
	public static void main(String[] args) {
		//创建集合
		Collection<String> list = new ArrayList<>();
		list.add("heima01");
		list.add("heima02");
		list.add("heima03");
		
		/*//while方式
		//使用迭代器对象进行集合元素遍历
		Iterator it = list.iterator();
		
		//使用迭代器,判断集合中是否有可以获取的元素
		while (it.hasNext()) {
			System.out.println(it.next());
			//来到下一个元素的位置
		}*/
		
		//for方式
		for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
		//foreach方式
		for (Object obj : list) {
			System.out.println(obj);
		}
		
	}
}
