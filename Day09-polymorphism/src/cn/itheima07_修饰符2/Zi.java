package cn.itheima07_修饰符2;

import cn.itheima07_修饰符1.Fu;

/*
 * 不同包中的子类
 */
//public class Zi extends cn.itheima07_修饰符1.Fu {}
public class Zi extends Fu {
	public static void main(String[] args) {
		//Fu f = new Zi();
		//f.method1();
		
		//普通方法
		Zi z = new Zi();
		z.method1();
		z.method2();
		//z.method3();
		//z.method4();
	}
}