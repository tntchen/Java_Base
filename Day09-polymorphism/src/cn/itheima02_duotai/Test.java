package cn.itheima02_duotai;
/*
 * 测试类
 */
public class Test {
	public static void main(String[] args) {
		//创建一个狗  多态
		Animal a = new Dog(); // 把子类转换成父类的方式用， 向上转型
		//调用动物吃东西的方法
		a.eat();
		
		/*
		 * 调用狗中的看家方法
		 * 当前的a为父类Animal类型，Animal中没有看家的方法,
		 * 所以，我们要把父类Animal类型转换成 子类的Dog类型
		 */
		Dog dog = (Dog)a;
		dog.lookHome();
		System.out.println("-----------------");
		
		//创建一只猫 多态
		Animal a2 = new Cat(); //向上转换：把子类类型 转换成 父类类型
		a2.eat();
		
		/*
		 * 假设，我们不知道a2是具体哪种动物，就可能会把a2当做狗的对象
		 * 调用狗种的看家功能 
		 * Dog dog2 = (Dog)a2; 发现该行会出现ClassCastException 类型转换异常
		 * 出现该异常的原因是，把一只猫转换成一只狗，这是不行的
		 * 那么，现在出现问题，我需要在转换之前，判断下当前的动物是否为狗，是狗的情况下，转换成狗
		 * dog2.lookHome();
		 */
		
		// 判断当前对象 是否为 Dog的类型对象
		if(a2 instanceof Dog) {
			//把a2动物 转换成狗
			Dog d = (Dog)a2;
			d.lookHome();
		} else {
			//a2 不是一只狗
			System.out.println("对不起，a2不是一条狗");
		}
		
	}
}
