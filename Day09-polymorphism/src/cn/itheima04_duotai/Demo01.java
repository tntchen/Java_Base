package cn.itheima04_duotai;
/*
 * 多态的成员变量特点
 */

class Fu {
	int num = 10;
}

class Zi extends Fu {
	int num = 20;
}

class Demo01 {
	public static void main(String[] args) {
		Fu fu = new Zi();
		System.out.println(fu.num);
		Zi zi = new Zi();
		System.out.println(zi.num);
	}
}
