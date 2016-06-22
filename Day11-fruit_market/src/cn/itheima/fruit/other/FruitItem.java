package cn.itheima.fruit.other;
/*
 * 自定义水果类型
 */
public class FruitItem {
	//属性
	private String number;//水果编号
	private String name;//水果名称
	private double price;//水果单价
	private String unit;//水果计价单位
	
	//构造方法
	public FruitItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FruitItem(String number, String name, double price, String unit) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.unit = unit;
	}
	
	//set/get
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getUnit() {
		return unit;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
