package cn.itheima03_Runnable;
/*
 * 创建线程的第二种方式
 */
public class MyRunnable implements Runnable {
	private String name;
	
	public MyRunnable() {
		super();
	}

	public MyRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("name="+name+"..."+Thread.currentThread().getName()+"..."+i);		}
	}

}
