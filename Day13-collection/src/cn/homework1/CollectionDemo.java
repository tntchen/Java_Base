package cn.homework1;

import java.util.ArrayList;
import java.util.List;

/*
 * 创建一个集合对象，通过for循环向其中添加五个int类型的元素，
 * 获取下标为1的元素并打印，修改下标为2的元素的值，删除下标为
 * 3的元素，打印集合的长度。
 */
public class CollectionDemo {
	public static void main(String[] args) {
		//创建集合对象
		List<Integer> list = new ArrayList<Integer>();
		//通过for循环向内添加5个int类型元素
		for (int i = 0; i < 5; i++) {
			list.add(i * 2);
		}
		//打印下标为1的元素
		System.out.println("下标为1的元素:" + list.get(1));
		//修改下标为2的元素值为55
		list.set(2, 55);
		//删除下标为3的元素
		list.remove(3);
		//打印集合长度
		System.out.println("集合长度为:" + list.size());
	}
}
