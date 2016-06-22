package cn.homework2;
/*
 * 编写一个Java程序，除main线程外，再开启一个线程，2个线程都循环执行20次
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Demo demo = new Demo("testname");
		
		Thread thread = new Thread(demo);
		
		//开启主线程
		thread.run();
		//开启线程
		thread.start();		
	}
}
