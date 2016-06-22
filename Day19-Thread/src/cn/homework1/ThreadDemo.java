package cn.homework1;
/*
 * 使用同步锁，编写一个Java程序，要求实现一个死锁现象
 */
public class ThreadDemo {
	public static void main(String[] args) {
		DieLockDemo dieLock = new DieLockDemo();
		
		Thread t1 = new Thread(dieLock);
		Thread t2 = new Thread(dieLock);
		
		t1.start();
		t2.start();
	}
}
