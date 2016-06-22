package cn.itheima06;
//专用邮政车
class Ztransportation extends Transportation {

	public Ztransportation() {
		super();
	}

	public Ztransportation(String id, String brand, String manager) {
		super(id, brand, manager);
	}
	//车辆保养
	public void carCare() {
		System.out.println("车辆保养");
	}
}
