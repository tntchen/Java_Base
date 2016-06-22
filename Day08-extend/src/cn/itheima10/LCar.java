package cn.itheima10;


//临时征用车辆类
public class LCar extends Car implements GPS {

	@Override
	public void transport() {
		// 重写父类中所有的抽象方法
		System.out.println(getManager() + "使用临时征用车进行运输");
	}
	//构造方法
	public LCar() {
		super();
	}

	public LCar(String id, String brand, String manager) {
		super(id, brand, manager);
	}
	@Override
	public void getLocation() {
		// 重写接口中的抽象方法
		System.out.println("36.0N~120.0E");
	}
	
}
