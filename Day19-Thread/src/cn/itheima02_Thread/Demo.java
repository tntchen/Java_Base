package cn.itheima02_Thread;
/*
 * Demo为线程子类
 */
public class Demo extends Thread {
	private String name;

	public Demo(String name) {
		super();
		this.name = name;
	}
	//重写thread类中的run方法
	public void run() {
		for (int i=1;i<=20 ;i++ ) {
			System.out.println("name="+name+",i="+i);
			
			//获取当前线程的名称
			System.out.println("线程名称="+Thread.currentThread().getName()+",i="+i);
		}
	}

}
