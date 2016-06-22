package cn.itheima04;
/*
 * Transportation运输工具类
 * 属性:
 * 		车辆编号id
 * 		品牌型号 brand
 * 		负责人manager
 * 功能:
 * 		setXx() getXx()
 * 		运输功能() Transport()
 * 		保养功能() CarCare() 
 */
public class Transportation {
	//成员变量
	private String id;
	private String brand;
	private String manager;
	//空参数的构造方法
	public Transportation() {
		
	}
	//带有三个参数的构造方法
	public Transportation(String id, String brand, String manager) {
		this.id = id;
		this.brand = brand;
		this.manager = manager;
	}
	//get方法
	public String getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public String getManager() {
		return manager;
	}
	//set方法
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
	public void transport(){
		System.out.println(manager+"使用"+brand+"车辆在运货");
	} 
	//保养功能
	public void CarCare() {
		System.out.println("车辆保养");
	}
	
 
	
	
}
