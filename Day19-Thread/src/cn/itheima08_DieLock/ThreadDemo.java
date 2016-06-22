package cn.itheima08_DieLock;
/*
 * 演示死锁
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//创建一个线程任务类对象
		ThreadTask task = new ThreadTask();
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
	}
}
