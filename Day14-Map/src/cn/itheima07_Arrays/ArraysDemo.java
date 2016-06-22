package cn.itheima07_Arrays;

import java.util.Arrays;

/*
 * 数组工具类
 * 
 * sort(数组) 为指定的数组排序
 * toString(数组) 将制定的数组转换成字符串
 */
public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr = {234,56,65,23,5,7,56,867,8,432,341,6,34,21,56,324};
		//toString(数组) 将制定的数组转换成字符串
		String arrStr = Arrays.toString(arr);
		System.out.println(arrStr);
		//sort(数组) 为指定的数组排序
		Arrays.sort(arr);
		
		arrStr = Arrays.toString(arr);
		System.out.println(arrStr);
	}
}
