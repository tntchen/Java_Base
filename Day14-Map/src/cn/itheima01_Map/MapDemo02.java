package cn.itheima01_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set<K> keySet方法:
 * 		来获取集合中所有键的元素,返回的是Set集合,因为Map集合中的键是不能重复的
 * 
 * 遍历Map集合的第一种方式:键找值的方式
 * 		1.创建Map集合
 * 		2.添加元素到集合
 * 		3.通过Map集合,获取到所有键的集合Set
 * 		4.遍历键的集合,得到每一个键key
 * 		5.通过键获取对应的值value
 * 		6.打印key和value
 */
public class MapDemo02 {
	public static void main(String[] args) {
		//创建一个Map集合
		Map<String, String> map = new HashMap<String,String>();
				
		//向Map中添加键值对元素
		map.put("黄晓明", "Angelababy");
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		
		//获取Map集合中所有的键
		Set<String> set = map.keySet();
		System.out.println(set);
		
		//遍历set集合得到每一个键
		for (String key : set) {
			//通过指定的键获取对应的值
			String value = map.get(key);
			System.out.println(key + "--" + value);
		}
	}
}
