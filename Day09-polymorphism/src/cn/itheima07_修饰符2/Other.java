package cn.itheima07_修饰符2;

import cn.itheima07_修饰符1.Fu;

/*
 * 不同包中其他类
 */
public class Other {
	public static void main(String[] args) {
		Fu f = new Fu();
		f.method1();
		//f.method2();
		//f.method3();
		//f.method4();
	}
}
