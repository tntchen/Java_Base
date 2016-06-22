package cn.iteheima01_Exception;
/*
 * 异常/错误演示
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		//异常
		int[] arr = {11,22,33};	
		System.out.println(arr[0]);
		//System.out.println(arr[3]);
		/*
		 * 该句运行时发生了ArrayIndexOutOfBoundsException
		 * 程序无法继续运行,程序结束
		 */	
		System.out.println("Hello World");
		
		//错误
		int[] array = new int [1024*1024*1000];
		/*
		 * 开辟了过大的数组空间OutOfMemoryError
		 */
	}
}
