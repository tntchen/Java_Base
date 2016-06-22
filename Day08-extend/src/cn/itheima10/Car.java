package cn.itheima10;
//运输工具类
public abstract class Car {
	private String id;
	private String brand;
	private String manager;
	//构造方法
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String id, String brand, String manager) {
		super();
		this.id = id;
		this.brand = brand;
		this.manager = manager;
	}
	//set/get
	public String getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public String getManager() {
		return manager;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	//运输功能
	public abstract void transport();
}
