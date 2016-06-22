package cn.itheima06_stringbuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		//创建一个字符串缓冲区对象,用于存储数据
		StringBuffer sb = new StringBuffer();
		//添加数据,不断的添加数据后,要对缓冲器的最后的数据进行操作,必须转成字符串才可以
		//sb.append(true).append("itcast").append(123456);
		
		sb.append("haha");//添加字符串
		sb.insert(2, "it");//在指定位置插入
		sb.delete(1, 4);
		sb.replace(1, 4, "cast");
		
		System.out.println(sb.toString());
	}
}
