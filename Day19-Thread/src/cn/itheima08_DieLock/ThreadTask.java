package cn.itheima08_DieLock;

import java.util.Random;

public class ThreadTask implements Runnable {
	int x = new Random().nextInt(1);//0,1

	@Override
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				synchronized (MyLock.lockA) {
					System.out.println("if-LockA");
					synchronized (MyLock.lockB) {
						System.out.println("if-LockB");
						System.out.println("if大口吃肉");
					}
				}
			}else {
				synchronized (MyLock.lockB) {
					System.out.println("else-LockB");
					synchronized (MyLock.lockA) {
						System.out.println("else-LockA");
						System.out.println("else大口吃肉");
					}
				}
			}
			x++;
		}
	}
}
