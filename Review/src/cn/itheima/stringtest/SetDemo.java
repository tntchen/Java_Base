package cn.itheima.stringtest;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("A", "101");
		hashMap.put("B", "102");
		hashMap.put("C", "103");
		hashMap.put("D", "104");
		
		System.out.println(hashMap);
		
		Set<String> keyset = hashMap.keySet();
		for (String string : keyset) {
			System.out.println(string+"--"+hashMap.get(string));
		}
		
		for (Entry<String, String> string : hashMap.entrySet()) {
			System.out.println(string.getKey()+"--"+string.getValue());
		}
	}
}
