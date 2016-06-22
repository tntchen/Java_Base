package cn.itheima10_InnerClassThread;
/*
 * 线程的匿名内部类使用
 */
public class ThreadDemo {
	public static void main(String[] args) {
		
		//方式1
		new Thread(){
			@Override
			public void run() {
				System.out.println("哈哈");
			}
		}.start();
		
		
		//方式2
		Runnable r = new Runnable(){
			@Override
			public void run() {
				System.out.println("嘿嘿");
			}
		};
		new Thread( r ).start();
	}
}
