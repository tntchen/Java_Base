package cn.itheima07_Integer;
/*
 * 自动封箱以及byte的特殊情况演示
 */
public class IntegerDemo {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println("---------------------");
		
		//自动装箱
		Integer m = 128;
		Integer n = 128;
		System.out.println(m == n);
		System.out.println(m.equals(n));
		System.out.println("---------------------");
		
		//byte特殊情况
		Integer x = 127;
		Integer y = 127;
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
	}
}
