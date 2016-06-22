package cn.itheima06;
//运输车辆类
public class Transportation {
	private String id;
	private String brand;
	private String manager;
	//构造方法
	public Transportation() {
		super();
	}
	public Transportation(String id, String brand, String manager) {
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
	//运输方法
	public void transpot() {
		System.out.println("运输员"+manager+",正在使用"+id+brand+"运输货物");
	}
}
