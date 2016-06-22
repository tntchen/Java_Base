package cn.itheima05;
/*
 * 描述学生和工人两个类,将他们的共性name和age
 * 抽取出来存放在父类中,并提供相应的get和set方法.
 * 同事需要在创建学生和工人对象就必须明确姓名和年龄
 */
public class Test {
	public static void main(String[] args) {
		//创建Student对象
		Student student = new Student("jonah",24);
		student.study();
		System.out.println(student.getName()+","+student.getAge());
		
		//创建工人对象
		Labour labour = new Labour("underwood",54);
		labour.work();
		System.out.println(labour.getName()+"----"+labour.getAge());
	}
}
