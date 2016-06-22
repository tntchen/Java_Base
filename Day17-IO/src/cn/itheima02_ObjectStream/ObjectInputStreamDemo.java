package cn.itheima02_ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * ObjectInputStream 对象输入流,称为反序列化流
 * 方法:
 * readObject() 从流中读取对象
 * 需求:从Person.txt所对应的反序列化流中读取,Person对象
 * 分析:
 * 1.创建ObjectInputStream反序列化流
 * 2.读取流中对象
 * 3.显示对象内容
 * 4.关闭流
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.txt"));
		Object obj 	= in.readObject();
		System.out.println(obj);
		in.close();
	}
}
