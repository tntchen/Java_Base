package cn.itheima06_TicketBeta;

public class Ticket implements Runnable {
	//共一百张票
	int ticket = 100;
	//定义一个锁
	//Object lock = new Object();
	
	@Override
	public void run() {
		while (true) {
			//同步代码块
			method();
		}
	}

	private synchronized void method() {
		//synchronized (lock) {
		if (ticket > 0) {
			System.out.println(Thread.currentThread().getName()+"正在卖票"+ticket);
			ticket--;
				
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
