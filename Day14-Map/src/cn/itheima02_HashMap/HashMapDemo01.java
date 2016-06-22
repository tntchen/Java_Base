package cn.itheima02_HashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 使用hashMap结合存储自定义元素,并遍历
 */
public class HashMapDemo01 {
	public static void main(String[] args) {
		//创建集合
		//HashMap<Student, String> map = new HashMap<>();
		LinkedHashMap<Student, String> map = new LinkedHashMap<>();
		//添加元素
		map.put(new Student("黄晓明",37), "上海");
		map.put(new Student("邓超",37), "北京");
		map.put(new Student("李晨",40), "深圳");
		map.put(new Student("李晨",40), "天津");
		map.put(new Student("李晨",37), "杭州");
		
		
		//键值对元素找值方式遍历
		Set<Entry<Student,String>> entrySet = map.entrySet();
		
		for (Entry<Student, String> entry : entrySet) {
			Student s = entry.getKey();
			String address = entry.getValue();
			
			System.out.println(s.getName()+"今年"+s.getAge()+"在"+address+"工作");
		}
	}
}
