package cn.homework2;
/*
 * 创建测试类，在测试类中分别调用Student类的吃饭睡觉和学习方法
 */
public  class Test {
	public static void main(String[] args) {
		/*Student s = new Student("Jonah");
		//调用吃饭方法
		s.eat();
		//调用睡觉方法
		s.sleep();
		//调用学习方法.向上转型
		s.study();*/
		//向下转型
		Person p = new Student("Jonah");
		p.eat();
		p.sleep();
		Student s = (Student) p;
		s.study();
	}
}
