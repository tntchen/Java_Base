package cn.itheima06_computer;

public class Mouse implements USB {
	//连接方法
	public void open() {
		System.out.println("鼠标已连接");
	}
	
	public void click() {
		System.err.println("点击鼠标了");
	}
	
	public void close() {
		System.out.println("鼠标已移除");
	}
}
