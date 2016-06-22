package cn.itheima06_computer;

public class Test {
	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();
		//开机
		noteBook.open();
		//运行
		noteBook.run();
		
		//使用USB设备(鼠标)
		//USB u = new Mouse();
		//noteBook.UseUSB(u);//m = new Mouse()
		//noteBook.UseUSB(new Mouse())//匿名对象
		//匿名对象
		noteBook.UseUSB(new Mouse());
		noteBook.UseUSB(new KeyBoard());
		//关机
		noteBook.close();
	}
}
