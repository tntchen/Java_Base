package cn.itheima05_transportation;
/*
 * 手机类,实现GPS定位接口
 */
public class Phone implements GPS{

	@Override
	public void getlocation() {
		System.out.println("36.0N~120E");
	}
	
}
