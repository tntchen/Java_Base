package cn.iteheima01_Exception;
/*
 * 异常的应用
 */
public class ExceptionDemo03 {
	public static void printArray(int[] arr,int index) {
		//判断数组是否可用
		if (arr == null) {
			throw new NullPointerException("arr指向的数组不存在");
		};
		if (index < 0 || index >= arr.length) {
			throw new ArrayIndexOutOfBoundsException("错误的角标,"+
		index+"索引在数组中不存在");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		
		printArray(arr, 3);
		System.out.println("over");
	}
}
