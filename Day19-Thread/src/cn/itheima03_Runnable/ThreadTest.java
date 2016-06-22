package cn.itheima03_Runnable;

public class ThreadTest {
	public static void main(String[] args) {
		MyRunnable my = new MyRunnable("Jonah");
		
		Thread t1 = new Thread(my);
		Thread t2 = new Thread(my);
		t1.start();
		t2.start();
	}
}
