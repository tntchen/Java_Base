package cn.homework1;
//定义一个son类实现Mother和Father接口
public class Son implements Mother,Father {

	@Override
	public void show() {
		//重写show抽象方法
		System.out.println("show方法已运行");
	}

	@Override
	public void show2() {
		//重写show2抽象方法
		System.out.println("show2方法已运行");
	}	
}
