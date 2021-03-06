package cn.homework1;
/*
 * 使用同步锁，编写一个Java程序，要求实现一个死锁现象
 */

import java.util.Random;

public class DieLockDemo implements Runnable {
	//随机生成0/1
	int x = new Random().nextInt(1);
	//创建lock对象
	Object  lockA = new Object();
	Object lockB = new Object();
	
	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (lockA) {
					System.out.println("if-lockA");
					synchronized (lockB) {
						System.out.println("if-lockB");
						System.out.println("if is running");
					}
				}
			} else {
				synchronized (lockB) {
					System.out.println("else-lockA");
					synchronized (lockA) {
						System.out.println("else-lockB");
						System.out.println("else is running");
					}
				}
			}
			x++;
		}
	}
}
