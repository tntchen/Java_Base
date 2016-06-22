package cn.itheima03;
/*
 * 当子类需要父类的功能,而功能主题子类有自己特有内容时,
 * 可以复写父类中的方法,这样即沿袭了父类的功能,又定义了
 * 子类特有的内容.
 */

class Phone {
	public void sendMessage() {//发短信
		System.out.println("发信息");
	}
	public void call() {
		System.out.println("打电话");
	}
	public void show() {
		System.out.println("来电号码显示");
	}
}

class NewPhone extends Phone {
	//方法覆盖,方法重写
	public void show() {
		//调用父类中的show方法,进行新功能的拓展
		super.show();
		System.out.println("来电人名字");
		System.out.println("来电人头像");
	}
}

public class Test2 {
	public static void main(String[] args) {
		NewPhone phone = new NewPhone();
		phone.sendMessage();
		phone.call();
		phone.show();
	}
}
