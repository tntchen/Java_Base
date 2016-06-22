package cn.homework3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 编写Java程序，要求：开启3个主线程之外的线程，3个线程同时卖票，票卖完后在控制
 * 台显示分别打印每个线程所卖的票号
 */
public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Ticket ticket = new Ticket();
		
		Thread t1 = new Thread(ticket,"窗口1");
		Thread t2 = new Thread(ticket,"窗口2");
		Thread t3 = new Thread(ticket,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
			
		
	}
}	

