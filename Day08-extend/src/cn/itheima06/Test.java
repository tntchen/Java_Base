package cn.itheima06;
/*
 * 需求分析:
 * 运输车辆:
 * 	属性:车辆编号/品牌型号/负责人
 * 	功能:运输功能/属性赋值,获取值
 * 		其中运输车辆类分为临时征用车/专用邮政车(有
 * 		特殊需求是保养功能)
 */
public class Test {
	public static void main(String[] args) {
		//创建临时
		LTransportation l = new LTransportation("京A55555","奔驰GLK","黄晓明");
		l.transpot();
		
		//创建专用
		Ztransportation z = new Ztransportation("京B66666","陆虎揽胜","AngelaBaby");
		z.transpot();
		z.carCare();
	}
}
