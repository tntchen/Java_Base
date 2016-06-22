package cn.itheima06_RunTimeException;

public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t = new Teacher("毕老师");
		try {
			t.prelect();
		} catch (NoPlanException e) {
			System.out.println(e.toString());
			System.out.println("换老师");
		}
		System.out.println("Hello World!");
	}
}
