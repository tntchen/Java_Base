package cn.itheima06_computer;
/*
 * 笔记本电脑
 */
public class NoteBook {
	//开机
	public void open() {
		System.out.println("开机");
	}
	//关机
	public void close() {
		System.out.println("关机");
	}
	//运行
	public void run() {
		System.out.println("电脑运行起来了");
	}
	//使用USB设备功能
	public void UseUSB(USB usb) {
		usb.open();
		usb.close();
	}
}
