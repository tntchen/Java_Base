package cn.homework2;
/*
 * 编写一个Java程序，除main线程外，再开启一个线程，2个线程都循环执行20次
 */
public class Demo implements Runnable {
	private String name;

	public Demo(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+"---"+name+"---"+i);
		}
	}
	
}
