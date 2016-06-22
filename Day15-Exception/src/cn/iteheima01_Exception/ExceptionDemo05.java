package cn.iteheima01_Exception;
/*
 * 异常的声明和捕获
 */
class Demo {
	public void show(int x) throws Exception {
		if (x > 0) {
			//抛出异常,在方法上生命异常,让调用者知道
			throw new Exception("产生异常了");
		} else {
			System.out.println("x="+x);
		}
	}
}

public class ExceptionDemo05 {
	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		/*
		 * 调用的show方法为带有异常声明的方法,调用这种方法时
		 * 必须要对异常进行处理:
		 * 1.继续抛出异常,在方法上使用throws异常进行抛出
		 * 2.捕获异常try{...}catch(异常名 对象名){...}
		 */
		d.show(10);
		/*try {
			d.show(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("找到了异常");
		}*/
	}
}
