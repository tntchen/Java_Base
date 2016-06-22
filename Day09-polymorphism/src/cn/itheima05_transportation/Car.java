package cn.itheima05_transportation;
/*
 * 运输工具类(抽象)
 */
public abstract class Car {
	//成员变量
	private String id;
	private String brand;
	private String manager;
	//构造方法
	public Car() {
		super();
	}
	public Car(String id, String brand, String manager) {
		super();
		this.id = id;
		this.brand = brand;
		this.manager = manager;
	}
	//get/set方法
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
	//运输方法
	public abstract void transport();
}
