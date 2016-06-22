package cn.itheima01;

/*
 * 完成Person类创建对象的测试
 */
public class PersonTest {
	public static void main(String[] args) {
		//创建对象
		Person p = new Person();
		//赋值
		/*p.name = "人妖";
		p.age = -20;*/
		
		//成员变量私有后,创建的p对象需要通过public修饰的方法访问
		p.setAge(-20);
		
		p.show();
	}
}
