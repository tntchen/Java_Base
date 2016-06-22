package cn.itheima05_transportation;
/*
 * 快递任务类
 */
public class SendTask {
	private int id;
	private double weight;
	//构造方法
	public SendTask() {
		super();
	}
	public SendTask(int id, double weight) {
		super();
		this.id = id;
		this.weight = weight;
	}
	//set/get
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
	public void sendBefore() {
		System.out.println("送前准备工作");
	}
	//运送货物
	public void send(Car car) {
		System.out.println("开始运送货物");
		car.transport();
	}
	//送后操作
	public void sendAfter() {
		System.out.println("送货结束");
	}
}
