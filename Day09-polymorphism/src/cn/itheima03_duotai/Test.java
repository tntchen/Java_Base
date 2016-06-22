package cn.itheima03_duotai;
/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//多态的方式创建对象
		毕姥爷 b = new 毕老师();
		
		//b要钓鱼
		b.钓鱼();
		//b要讲课
		b.讲课();
		
		//b要看电影
		//向下转型
		毕老师 teacher = (毕老师) b;
		teacher.看电影();
	}
}
