package cn.itheima01_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

/**
 * 查询表中数据
 */
public class JDBCTest {
	/*
	 * 方式1
	 */
	@Test
	public void selectMethed01() {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc","root","root");
			Statement stat = conn.createStatement();
			String sql = "select * from category";
			ResultSet resultSet = stat.executeQuery(sql);
			while (resultSet.next()) {
				String cid = resultSet.getString("cid");
				String cname = resultSet.getString("cname");
				System.out.println(cid + "-----" + cname);
			}
			resultSet.close();
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/*
	 * 方式2
	 */
	@Test
	public void selectMethed02() {
		try {
			//加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc","root","root");
			
			//Statement stat = conn.createStatement();
			String sql = "select * from category where cid=?";
			PreparedStatement ppStatement = conn.prepareStatement(sql);
			//String sql = "select * from category";
			//为SQL语句中?占位符数据复制
			 ppStatement.setString(1, "c001");
			
			//ResultSet resultSet = stat.executeQuery(sql);
			ResultSet resultSet = ppStatement.executeQuery();
			
			while (resultSet.next()) {
				String cid = resultSet.getString("cid");
				String cname = resultSet.getString("cname");
				System.out.println(cid + "-----" + cname);
			}
			resultSet.close();
			ppStatement.close();
			conn.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
