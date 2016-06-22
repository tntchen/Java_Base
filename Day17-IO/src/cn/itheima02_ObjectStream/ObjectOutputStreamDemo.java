package cn.itheima02_ObjectStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ObjectOutputStream:对象输出流,也称为序列化流
 * 方法:
 * 	writeObject() 完成向流中写入对象方法
 * 需求:把Person对象,写入到流所对应的Person.txt文件中
 * 分析:
 * 1.创建Person对象
 * 2.创建序列化流ObjectOutputStream
 * 3.把对象写入流中
 * 4.关闭流
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Person p = new Person("王菲",35);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.txt"));
		out.writeObject(p);
		out.close();
	}
}
