package cn.iteheima01_Exception;
/*
 * 异常的分类
 */
public class ExceptionDemo04 {
	public static void main(String[] args) {
		int[] arr = {111,222,3121};
		method(arr, 3);
		
		System.out.println("over");
	}
	
	public static void method(int[] arr,int index) {
		if (index < 0 || index >= arr.length) {
			//抛出运行期异常
			throw new RuntimeException("运行期异常");
		}
		
		int result = arr[index];
		System.out.println(result);
	}
}
