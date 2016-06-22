package cn.itheima08;
//专用邮政车类
public class ZCar extends Car{
	//构造方法
	public ZCar() {
		super();
	}
	public ZCar(String id, String brand, String manager) {
		super(id, brand, manager);
	}
	//重写父类中所有的抽象方法
	public void transport() {
		System.out.println(getManager()+"正在使用邮政专用车");
	}
	
	//特有的方法,车辆保养
	public void carCare() {
		System.out.println("车辆正在进行保养");
	}
}
