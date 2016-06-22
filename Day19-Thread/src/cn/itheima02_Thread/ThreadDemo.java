package cn.itheima02_Thread;
/*
 * 测试类
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//创建两个线程任务
		Demo d = new Demo("小强");
		Demo d2 = new Demo("旺财");
		//d.run(); 这里仍然是主线程在调用run方法，并没有开启两个线程
		//d2.run();
		d2.start();//开启一个线程
		d.run();//主线程在调用run方法
	}
}
