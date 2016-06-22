package cn.itheima.first;
/*
 * 在一个类中编写一个方法，这个方法搜索一个字符数组中是否存在某个字符，如果存在
 * ，则返回这个字符在字符数组中第一次出现的位置（序号从0开始计算），否则，返回-1
 * 。要搜索的字符数组和字符都以参数形式传递传递给该方法，如果传入的数组为null，
 * 应抛出IllegalArgumentException异常。在类的main方法中以各种可能出现的情况测试验
 * 证该方法编写得是否正确，例如，字符不存在，字符存在，传入的数组为null等。
 */
public class Demo8 {
	public static void main(String[] args) {
		char[] arr = {1,2,3,4,5,6,7,8,9,0,'a','b','c','d','e','f','g'};
		char[] arrNull = null;
		//测试字符不存在
		System.out.println("测试字符不存在结果为:"+searchChar('z', arr));
		//测试字符存在
		System.out.println("测试字符存在结果为:"+searchChar('1', arr));
		//测试传入数组为null
		System.out.println("测试传入数组为null结果为:"+searchChar('1', arrNull));
	}
	
	static int searchChar(char c, char[] arr) {
		//要查找的字符在数组中的位置
		int index = -1;
		
		//如果数组为null,则抛出IllegalArgumentException
		//如果不为null，则开始查找字符在数组中的位置
		if (arr == null) {
			new IllegalArgumentException().printStackTrace();
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (c == arr[i]) {
					index = i;
				}
			}
		}
		return index;
	}
}
