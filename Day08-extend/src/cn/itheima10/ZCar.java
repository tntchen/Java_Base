package cn.itheima10;
//专用邮政车类
//继承运输工具额累,实现GPS和车辆保养接口
public class ZCar extends Car implements GPS,Care{
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
	@Override
	public void carCare() {
		// 重写车辆保养的抽象方法
		System.out.println("车辆正在做保养");
		
	}
	@Override
	public void getLocation() {
		// 重写GPS的抽象方法
		System.out.println("36.6N~127.5E");
	}
}
