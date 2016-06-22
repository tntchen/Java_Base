package cn.itheima03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

/*
 * 使用JDBC完成sort表指定数据的删除
 * 
 * 删除条件为 分类ID为's004'的记录
 */
public class DeleteTest {

	/*
	 * 使用JDBC完成sort表指定数据的删除
	 * 1,注册驱动
	 * 2，获得连接
	 * 3,获取SQL语句执行者
	 * 4，执行SQL语句
	 * 5，处理结果集
	 * 6,释放资源
	 */
	@Test
	public void deleteMethod() throws Exception{
		//1,注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2，获得连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc", "root", "root");
		//3,获取SQL语句执行者
		Statement statement = connection.createStatement();
		//4，执行SQL语句
		String sql = "delete from category where cid='s004'";
		int line = statement.executeUpdate(sql);
		//5，处理结果集
		System.out.println("line=" + line);
		//6,释放资源
		statement.close();
		connection.close();
	}
}
