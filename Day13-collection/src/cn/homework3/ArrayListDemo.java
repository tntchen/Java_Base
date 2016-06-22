package cn.homework3;

import java.util.ArrayList;
import java.util.List;

/*
 *  编写程序要求存储3个学生对象到ArrayList集合中，其中学生
 *  Student类只有一个私有的name属性。
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		//创建学生类的ArrayList格式对象
		List<Student> stu = new ArrayList<>();
		//添加三个学生到集合中
		stu.add(new Student("Bob"));
		stu.add(new Student("Tom"));
		stu.add(new Student("Jack"));
		
		System.out.println("输出集合成员:");
		//foreach输出list成员
		for (Student student : stu) {
			System.out.println(student);
		}
	}
}
