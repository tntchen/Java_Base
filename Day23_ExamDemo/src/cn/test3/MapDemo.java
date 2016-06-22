package cn.test3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 定义一个集合Map<Integer, String>，存入三组数据分别为：
 * 1, "小王"；2, "小张"；3, "小李"。并遍历取值打印。
 */
public class MapDemo {
	public static void main(String[] args) {
		//定义Map集合
		Map<Integer, String> map = new HashMap<Integer, String>();
		//存入数据
		map.put(1, "小王");
		map.put(2, "小张");
		map.put(3, "小李");
		//遍历打印
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			String value = map.get(key);
			System.out.println(key + "--" + value);
		}
	}
}
