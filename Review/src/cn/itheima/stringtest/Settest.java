package cn.itheima.stringtest;

import java.util.HashSet;
import java.util.Set;

public class Settest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("f");
		System.out.println(set);
	}
}
