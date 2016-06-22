package cn.itheima04;
/*
 * 快递任务类
 * 属性:
 * 		快递单号	id
 * 		重量	weight
 * 方法:
 * 		set/get
 * 		构造方法
 * 		送前准备
 * 		运送货物
 * 		送后操作
 */
public class SendTask {
	//成员变量
	private int id;
	private double weight;
	//构造方法
	public SendTask() {
	}
	public SendTask(int id, double weight) {
		this.id = id;
		this.weight = weight;
	}
	//get
	public int getId() {
		return id;
	}
	public double getWeight() {
		return weight;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//送前准备
	public void sendBegin() {
		System.out.println("送货前准备:打包装");
	}
	//运送货物
	public void sending(Transportation t) {//t,运输使用的车辆
		System.out.println("开始送货");
		t.transport();//运输货物
	}
	
	//送后操作
	public void sendEnd() {
		System.out.println("送货结束");
	}
}
