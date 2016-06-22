package cn.itheima04_Ticket;
//这是个有问题的程序
public class Ticket implements Runnable {
	//共一百张票
	int ticket = 100;
	
	@Override
	public void run() {
		while (true) {
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

}
