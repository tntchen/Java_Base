package cn.itheima10;
/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//创建快递任务类对象
		SendTask st = new SendTask(9003,5.5);
		//送前准备操作
		st.sendBefore();
		//运送货物操作
		ZCar zc = new ZCar("JK55800","Lotus","Batman");
		st.send(zc);
		//打印车辆当前位置
		zc.getLocation();
		//送后操作
		st.sendAfter();
		//车辆保养
		zc.carCare();
	}
}
