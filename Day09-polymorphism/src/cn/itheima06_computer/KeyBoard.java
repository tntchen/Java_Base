package cn.itheima06_computer;

public class KeyBoard implements USB {
	public void open() {
		System.out.println("键盘已连接");
	}
	
	public void close() {
		System.out.println("键盘已移除");
	}
}
