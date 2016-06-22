/*
 * 定义了一个老师父类,属性包括姓名,年龄,是否会说日语的布尔值,功能为讲课抽象方法
 * 定义一个日语接口
 * 分别定义基础老师类和就业老师类,继承老师类,实现日语接口
 * 并分别重写讲课方法和说日语方法
 * 最后在测试类进行赋值测试,打印出老师的信息和功能
 */
package cn.homework3;
/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//对属性进行赋值进行测试
		BaseTeacher[] t = new BaseTeacher[2];
		t[0] = new BaseTeacher("Bob",23,true);
		t[1] = new BaseTeacher("Tom",27,false);
		
		WorkTeacher[] t1 = new WorkTeacher[2];
		t1[0] = new WorkTeacher("Lily",21,true);
		t1[1] = new WorkTeacher("Lucy",22,false);
		//打印每位基础班老师的信息
		for (BaseTeacher tch : t) {
			System.out.println(tch.getName()+","+tch.getAge());
			tch.teach();
			if (tch.isJP()) {
				tch.Japanese();
			}
		}
		//打印每位就业办老师的信息
		for (WorkTeacher tch1 : t1) {
			System.out.println(tch1.getName()+","+tch1.getAge());
			tch1.teach();
			if (tch1.isJP()) {
				tch1.Japanese();
			}
		}
	}
}
