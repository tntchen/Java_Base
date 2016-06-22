package cn.itheima01_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map集合遍历方式2:通过键值对方式,获取键获取值
 * 		创建一个Map集合
 * 		添加元素到集合
 *		遍历Map集合,得到一个包含多个键值对元素的set集合
 *			使用到Map集合中的方法EntryDet,该方法返回的结果是
 *			一个包含多个键值对元素的Set集合
 *		通过这个键值对元素Entry对象中的getkey(),getvalue()方法,获取键与值
 */
public class MapDemo03 {
	public static void main(String[] args) {
		//创建一个Map集合
		Map<String, String> map = new HashMap<String,String>();
						
		//向Map中添加键值对元素
		map.put("黄晓明", "Angelababy");
		map.put("邓超", "孙俪");
		map.put("李晨", "范冰冰");
		
		//将Map集合转换成Set集合,得到一个包含多个键值对元素的set集合
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		//遍历包含多个键值对元素的Set集合,得到每一个键值对元素
		for (Map.Entry<String, String> entry : entrySet) {
			//通过这个键值对元素Entry对象中的getkey(),getvalue()方法,获取键与值
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "--" + value);
		}
	}
}
