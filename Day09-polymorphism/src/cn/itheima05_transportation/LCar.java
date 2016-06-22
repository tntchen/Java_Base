package cn.itheima05_transportation;
/*
 * 临时征用车类
 */
public class LCar extends Car {

	@Override
	public void transport() {
		//重写抽象方法
		System.out.println(getManager() + "在送货");
		getGPS(new Phone());
	}
	//构造方法
	public LCar() {
		super();
	}

	public LCar(String id, String brand, String manager) {
		super(id, brand, manager);
	}
	//获取车辆位置
	public void getGPS(GPS gps) {//GPS gps = new GPS()
		gps.getlocation();
	}
}
