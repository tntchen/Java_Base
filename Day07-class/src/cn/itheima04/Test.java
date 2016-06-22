package cn.itheima04;
/*
 * 测试类,完成快递任务对象的创建,完成方法的调用
 */
public class Test {
	public static void main(String[] args) {
		//指定快递任务信息对象
		SendTask st = new SendTask(9001,2.5);
		//送前准备
		st.sendBegin();
		//运输货物
		Transportation t = new Transportation("京Q66666","BYD","汪峰");
		st.sending(t);
		//送后操作
		st.sendEnd();
		//车辆保养
		t.CarCare();
	}
}
