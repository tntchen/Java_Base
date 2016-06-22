package cn.itheima02_Collection_List;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		//往集合中添加元素
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");
		
		//删除
		coll.remove("itcast2");
		//判断是否包含
		System.out.println(coll.contains("itcast1"));
		//清除
		coll.clear();
		//打印集合
		System.out.println(coll);
	}
}
