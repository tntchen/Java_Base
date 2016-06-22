package cn.itheima10;
//快递任务类
public class SendTask {
	//成员变量
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
	//送前准备方法
	public void sendBefore() {
		System.out.println("货物送前准备工作");
	}
	//运送货物的操作
	/*public void send(LCar car) {
		System.out.println("开始送货");
		car.transport();
	}
	public void send(ZCar car) {
		System.out.println("开始送货");
		car.transport();
	}*/
	//运送货物多态的写法
	public void send(Car car) {
		System.out.println("开始送货");
		car.transport();
	} 
	//送后操作方法
	public void sendAfter() {
		System.out.println("送货结束");
	}
}
