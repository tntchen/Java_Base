package cn.itheima05_transportation;

public class Test {
	public static void main(String[] args) {
		SendTask sendTask = new SendTask(9003,3.3);
		
		sendTask.sendBefore();
		
		Car car = new LCar("JK23456","AE86","藤原拓海");
		sendTask.send(car);
		
		sendTask.sendAfter();
	}
}
