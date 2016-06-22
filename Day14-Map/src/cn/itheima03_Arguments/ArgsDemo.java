package cn.itheima03_Arguments;
/*
 * 可变参数只能使用在方法的参数中
 */
public class ArgsDemo {
	public static void main(String[] args) {
		int[] arr = {2,4,9};
		int result = add(arr);
		System.out.println(result);
	}
	
	//可变参数
	public static int add(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
/*	public static int add(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}*/
}
