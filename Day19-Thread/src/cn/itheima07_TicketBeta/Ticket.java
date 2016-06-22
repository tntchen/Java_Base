package cn.itheima07_TicketBeta;

public class Ticket implements Runnable {
	//Ticket.class
	
	
	//共100票
	static int ticket = 100;
	
	//定义所对象
	Object lock = new Object();
	int x = 0;
	
	@Override
	public void run() {
		//模拟卖票
		while(true){
			//同步方法
			if (x %2 ==0) {
				method();
				x++;
			} else {
				synchronized (Ticket.class) {
					if (ticket > 0) {
						//模拟选坐的操作
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
					}
				}
				x++;
			}
		}
	}
	
	//静态同步方法,锁对象this
	public static synchronized void method(){
		if (ticket > 0) {
			//模拟选坐的操作
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
		}
	}
	
	
}
