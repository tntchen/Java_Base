package cn.itheima03;

public class Test {

	public static void main(String[] args) {
		//测试运输工具类,创建对象,调用方法
		Transportation t1 = new Transportation("京A00000","保时捷911","奥巴马");
		//调用运输功能
		t1.transport();
		//调用保养功能
		t1.CarCare();
		
		//创建对象
		Transportation t2 = new Transportation();
		t2.setId("京A12123");
		t2.setBrand("红旗110");
		t2.setManager("金三胖");
		//调用运输功能
		t2.transport();
		//调用保养功能
		t2.CarCare();
		
	}

}
