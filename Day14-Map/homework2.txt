package cn.homework2;
/*
 * 编写程序，创建一个双列集合，存放一下数据
 * （baby代表湿巾，RICH代表抽纸等），并通过
 * 键名获取值，打印输出
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//创建一个Map集合
		Map<String, String> map = new HashMap<String,String>();
		
		//向map中添加元素存放数据
		map.put("baby","湿巾");
		map.put("RICH","抽纸");
		
		//获取Map集合中所有的键
		Set<String> set = map.keySet();
		//遍历set集合得到每一个键
		for (String key : set) {
			//通过指定的键获取对应的值
			String value = map.get(key);
			System.out.println(key + "--" + value);
		}
	}
}
