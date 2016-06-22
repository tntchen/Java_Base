package cn.itheima05_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  集合工具类
 *  	将所有指定元素添加到指定collection中
 *  	public static <T> boolean addAll(Collection<? super T> c,T... elements)
 *  	排序
 *  	public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  	打乱元素顺序
 *  	public static void shuffle(List<?> list)
 *  	
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		//创建集合
		List<String> list = new ArrayList<>();
		//通过集合工具中类中addAll方法将所有指定元素添加到指定collection中
		Collections.addAll(list, "aaa","bbb","ccc","abc","bbc");
		//排序
		Collections.sort(list);
		//打乱顺序
		Collections.shuffle(list);
		
		System.out.println(list);
	}
}
