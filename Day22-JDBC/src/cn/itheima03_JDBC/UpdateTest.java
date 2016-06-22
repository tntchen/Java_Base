package cn.itheima03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

/*
 * 使用JDBC完成sort表指定数据的更新
 * 
 * 把条件为分类id为's003'的记录的分类名称，改为 '书籍'
 */
public class UpdateTest {
	
	/*
	 * 使用JDBC完成sort表指定数据的更新 
	 * 1,注册驱动
	 * 2，获得连接
	 * 3,获取SQL语句执行者
	 * 4，执行SQL语句
	 * 5，处理结果集
	 * 6,释放资源
	 */
	@Test
	public void updateMethod() throws Exception{
		//1,注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2，获得连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc", "root", "root");
		//3,获取SQL语句执行者
		Statement statement = connection.createStatement();
		//4，执行SQL语句
		String sql = "update category set sname='书籍' where cid='s003'";
		int line = statement.executeUpdate(sql);
		//5，处理结果集
		System.out.println("line ="+ line);
		//6,释放资源
		statement.close();
		connection.close();
		
	}
}
