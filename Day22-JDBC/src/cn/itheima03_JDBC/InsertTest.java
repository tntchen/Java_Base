package cn.itheima03_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.Test;

/*
 * 使用JDBC完成数据插入到sort表中  
 * 
 * 记录：s004,食品
 */
public class InsertTest {
	
	/*
	 * 使用JDBC完成数据插入到sort表中  
	 * 1,注册驱动
	 * 2，获得连接
	 * 3,获取SQL语句执行者
	 * 4，执行SQL语句
	 * 5，处理结果集
	 * 6,释放资源
	 */
	@Test
	public void insertMethod(){
		
		try {
			//1,注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2，获得连接
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc", "root", "root");
			//3,获取SQL语句执行者
			Statement statement = connection.createStatement();
			//4，执行SQL语句
			String sql = "insert into category values('c004','食品')";
			int line = statement.executeUpdate(sql);//用来完成插入、更新、删除
			//5，处理结果集
			System.out.println("line="+line);
			//6,释放资源
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
