package cn.itheima01_Properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * 需求:使用Properties集合,完成把集合内容存储到IO流对应文件中的操作
 * 
 * 分析:
 * 1.创建Properties集合
 * 2.添加元素到集合
 * 3.创建流
 * 4.把集合中的数据存储到流所对应的文件中
 * 5.关闭流
 * 
 * 方法:
 * public void store(OutputStream out,String comments)throws IOException 以适合使用 load(InputStream) 方法，将此 Properties 表中的属性列表（键和元素对）写入输出流
 * public void store(Writer writer,String comments)throws IOException  以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符
 */
public class PropertiesDemo02 {
	public static void main(String[] args) throws IOException {
		//创建对象
		Properties prop = new Properties();
		//添加元素到集合
		prop.setProperty("周迅", "张学友");
		prop.setProperty("孙俪", "邓超");
		prop.setProperty("杨幂", "刘恺威");
		//创建流
		FileWriter out = new FileWriter("prop.properties");
		//把集合中的数据存储到流所对应的文件中
		prop.store(out, "save data");
		//关闭流
		out.close();
	}
}
