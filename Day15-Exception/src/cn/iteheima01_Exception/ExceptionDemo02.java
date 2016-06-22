package cn.iteheima01_Exception;
/*
 * 异常发生的过程
 */
public class ExceptionDemo02 {
	public static void main(String[] args) {
		int[] arr = {11,22,33};
		printArray(null,3);
		
		System.out.println("over");
		
	}
	
	//打印数组
	public static void printArray(int[] arr,int index) {
		System.out.println("arr="+arr);
		System.out.println("index="+index);
		
		int result = arr[index];
		System.out.println(result);
	}
}
