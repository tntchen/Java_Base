package cn.itheima08;
//测试类
public class Test {
	public static void main(String[] args) {
		//创建快递任务对象
		SendTask sendTask = new SendTask(9001,3.3);
		//送前方法
		sendTask.sendBefore();
		//使用临时征用车
		LCar lCar = new LCar("JQ32388","Benz","Jonah");
		sendTask.send(lCar);
		//送后操作
		sendTask.sendAfter();
		
		//------------------------------------------------
		SendTask sendTask2 = new SendTask(9002,5.6);
		sendTask2.sendBefore();
		
		ZCar zCar = new ZCar("JK65894","BMW","Lily");
		sendTask2.send(zCar);
		sendTask2.sendAfter();
		zCar.carCare();
	}
}
