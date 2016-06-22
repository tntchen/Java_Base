package cn.itheima03_JDBCUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * JDBC工具类
 * 1, 连接数据库，获取连接对象
 * 2, 释放资源
 */
public class JDBCUtils01 {
	
	/*
	 * 1, 连接数据库，获取连接对象
	 */
	public static Connection getConnection(){
		//1,注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2，获得连接
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc", "root", "root");
			return connection;
		} catch (ClassNotFoundException e) {
			System.err.println("MySQL注册驱动失败，请检查路径名称");
		} catch (SQLException e){
			System.err.println("连接数据库时，产生了错误，请检查数据库连接地址");
		}
		return null;
	}
	
	/*
	 * 释放资源
	 */
	public static void release (ResultSet resultSet, Statement statement, Connection connection){
		try {
			resultSet.close();
		} catch (SQLException e) {
			System.err.println("结果集对象资源释放失败");
		}
		try {
			statement.close();
		} catch (SQLException e) {
			System.err.println("SQL语句执行者资源释放失败");
		}
		try {
			connection.close();
		} catch (SQLException e) {
			System.err.println("连接对象资源释放失败");
		}
	}
	
}
