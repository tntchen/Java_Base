package cn.itheima02;
/*
 * 需求:比较两个学生的年龄是否相等
 */
class Student {
	//成员变量
	private String name;
	private int age;
	//构造方法,为名字与年龄初始化赋值
	public Student(String name,int age) {
		// 把局部变量name,age复制给成员this.name和this.age
		this.name = name;
		this.age = age;
	}
	//名字赋值方法
	public void setName(String name) {
		this.name = name;
	}
	//获取名字赋值方法
	private String getName() {
		return name;
	}
	//年龄赋值方法
	public void setAge(int age) {
		this.age = age;
	}
	//获取年龄赋值方法
	private int getAge() {
		return age;
	}
	/*
	 * 比较两个学生年龄是否相等
	 */
	public boolean equalsAge(Student s) {
		//return s1.age == s2.age;
		//s1代表本人,this代表的也是本人
		//s2代表指定的学生,也就是参数中的s
		return this.age == s.age;
	}
	
}
public class StudentDemo {
	public static void main(String[] args) {
		//创建2名学生
		Student s1 = new Student("刘德华", 33);
		Student s2 = new Student("张学友", 33);
		
		//比较两个学生的年龄是否相等
		//s1.age == s2.age;
		
		//return s1.age == s2.age;
		//s1代表本人,this代表的也是本人
		//s2代表指定的学生,也就是参数中的s
		boolean flag = s1.equalsAge(s2);
		System.out.println("flag="+flag);
	}
}
