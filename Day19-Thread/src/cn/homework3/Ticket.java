package cn.homework3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Ticket implements Runnable {
	int ticket = 100;	
		
	//创建Lock锁对象
	Lock ck = new ReentrantLock();
	
	@Override
	public void run() {
		Map<Integer, String> map =  new LinkedHashMap<Integer, String>();
		String thrStr = Thread.currentThread().getName();
		//模拟卖票
		while(true){			
			ck.lock();
				if (ticket > 0) {
					//模拟选坐的操作
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					map.put(ticket, thrStr);
					//System.out.println(thrStr + "正在卖票:" + ticket);
					ticket--;
				} 
			ck.unlock();
			if (ticket <= 0) {
				break;
			}
		}
		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			String value = map.get(key);
			System.out.println(key + "--" + value);
		}
	}	
}
