package cn.itheima01_Properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * 需求:从属性集文件中取出数据,保存到集合中
 * 分析:
 * 1.创建集合
 * 2.创建流对象
 * 3.把流所对应文件中的数据读取到集合中
 * 4.关闭流
 * 5.显示集合中的数据
 * 方法:
 * public void load(InputStream inStream) throws IOException 从输入流中读取属性列表（键和元素对）。
 * public void load(Reader reader) throws IOException   按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
 */
public class PropertiesDemo03 {
	public static void main(String[] args) throws IOException {
		//创建集合
		Properties prop = new Properties();
		//创建流对象
		FileReader in = new FileReader("prop.properties");
		//把流所对应文件中的数据读取到集合中
		prop.load(in);
		in.close();
		//显示集合中的数据
		System.out.println(prop);
	}
}
