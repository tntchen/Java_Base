package cn.itheima03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

/*
 * 使用JDBC完成sort表指定条件数据的查询
 * 
 * 查询条件为 分类id为's001'的数据
 */
public class SelectTest {
	
	/*
	 * 使用JDBC完成sort表指定条件数据的查询
	 * 1,注册驱动
	 * 2，获得连接
	 * 3,获取SQL语句执行者
	 * 4，执行SQL语句
	 * 5，处理结果集
	 * 6,释放资源
	 */
	@Test
	public void selectMethod() throws Exception{
		//1,注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		
		//2，获得连接
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc", "root", "root");
		//3,获取SQL语句执行者
		Statement statement = connection.createStatement();
		//4，执行SQL语句
		String sql = "SELECT * FROM category WHERE cid='c001'";
		ResultSet resultSet = statement.executeQuery(sql);
		//5，处理结果集
		while(resultSet.next()){
			//获取当前行数据
			//获取分类ID
			String sid = resultSet.getString("cid");
			//获取分类名称
			String sname = resultSet.getString("cname");
			System.out.println(sid+"----"+sname);
		}
		//6,释放资源
		resultSet.close();
		statement.close();
		connection.close();
	}
}
