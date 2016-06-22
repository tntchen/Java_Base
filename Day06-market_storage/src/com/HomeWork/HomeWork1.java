package com.HomeWork;

public class HomeWork1 {
	public static void main(String[] args) {
		System.out.println("水仙数有:");
		for (int num = 100;num < 1000;num++) {
			//定义个位/十位/百位
			int oneDigit,tenDigit,hundredDigit;
			//分离个位/十位/百位
			hundredDigit = num / 100;
			tenDigit = (num - hundredDigit * 100) / 10;
			oneDigit = num - hundredDigit * 100 - tenDigit * 10;
			if (num == Math.pow(hundredDigit,3)+Math.pow(tenDigit,3)+Math.pow(oneDigit,3)) {
				System.out.println(num);
			}
		}
	}
}
