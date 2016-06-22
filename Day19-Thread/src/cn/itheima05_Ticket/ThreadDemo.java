package cn.itheima05_Ticket;
/*
 * 带朋友看电影,需要买票,电影院卖票,模拟电影院的买票操作
 * 假设我们要看"功夫熊猫3",本次电影作为一共100个
 * 模拟电影院的售票窗口,实现多个窗口一起卖票
 * 
 *窗口:线程对象来模拟
 *票:RUnnable接口子类来模拟
 */
public class ThreadDemo {
	public static void main(String[] args) {
		//创建票对象
		Ticket ticket = new Ticket();
		
		Thread t1 = new Thread(ticket,"窗口1");
		Thread t2 = new Thread(ticket,"窗口2");
		Thread t3 = new Thread(ticket,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
