package cn.itheima05_transportation;
/*
 * 专用邮政车类,继承运输工具类
 */
public class ZCar extends Car implements Care{

	@Override
	public void transport() {
		System.out.println(getManager()+"在运输");

	}

	@Override
	public void carCare() {
		System.out.println("车辆保养");
	}

	public ZCar() {
		super();
	}

	public ZCar(String id, String brand, String manager) {
		super(id, brand, manager);
	}
	//获取车辆位置
	public void getGPS(GPS gps) {
		gps.getlocation();
	}
	
}
