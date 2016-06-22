package cn.itheima01_Properties;

import java.util.Properties;
import java.util.Set;

/*
 * Properties集合,它是唯一一个能与IO流交互的集合
 * 
 * 需求:向Properties集合中添加元素并遍历
 * 
 * 方法:
 * public Object setProperty(String key,String value) 调用 Hashtable 的方法 put
 * public Set<String> stringPropertyNames()	返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
 * public String getProperty(String key) 用指定的键在此属性列表中搜索属性
 */
public class PropertiesDemo01 {
	public static void main(String[] args) {
		//创建对象
		Properties prop = new Properties();
		//添加元素到集合
		//prop.put(key, value);
		prop.setProperty("周迅", "张学友");
		prop.setProperty("孙俪", "邓超");
		prop.setProperty("杨幂", "刘恺威");
		
		//System.out.println(prop);//测试
		//遍历
		Set<String> keys = prop.stringPropertyNames();
		for (String key : keys) {
			String value = prop.getProperty(key);
			System.out.println(key + "..." + value);
		}
		
	}
}
