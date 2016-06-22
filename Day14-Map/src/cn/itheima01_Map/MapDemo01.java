package cn.itheima01_Map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map集合创建方式,常用的方法
 *  
 * put(K,V)添加指定的键与值到Map集合中
 * 			更新指定键对应的值得方法
 * get(Object key)返回指定键所映射的值；如果对
 * 于该键来说，此映射不包含任何映射关系，则返回 null
 * remove(Object key)将指定的键所对应的键值对元素在集合中移除,返回 值的值指定键所对应的值
 */
public class MapDemo01 {
	public static void main(String[] args) {
		//创建一个Map集合
		Map<String, String> map = new HashMap<String,String>();
		
		//向Map中添加键值对元素
		map.put("黄晓明", "Angelababy");
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		
		//更新指定键对应的值得方法
//		String value = map.put("邓超", "邓婕");
//		System.out.println(value);
		
		//获取指定键对应的值得方法
//		String value = map.get("李晨");
//		System.out.println(value);
		
		//移除集合中的元素
		String value =  map.remove("李晨");
		System.out.println(value);
		
		System.out.println(map);
	}
}
