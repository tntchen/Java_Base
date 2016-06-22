package cn.itheima02_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/*
 * 数据库驱动注册
 */
public class JDBCTest {
	public static void main(String[] args) {
		try {
			//1.注册驱动
			//硬编码注册,驱动被注册两次,并不推荐使用
			//DriverManager.registerDriver(new Driver());
			/*
			 * 加载MySql的Driver类到内存,MySql的Driver类在自己的静态内存代码块
			 * 实现注册驱动的操作
			 */
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取链接
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day22_jdbc","root","root");
			//3.获取语句执行
			Statement stat = con.createStatement();
			//执行SQL语句
			String sql = "SELECT * FROM category";
			ResultSet resultSet = stat.executeQuery(sql);
			//处理结果集合
			//boolean flag = resultSet.next();
			//System.out.println(flag);
			while (resultSet.next()) {
				//获取当前行分类id
				String cid = resultSet.getString("cid");
				//获取当前行分类名称
				String cname = resultSet.getString("cname");
				System.out.println(cid + "-------"+ cname);
			}
			//释放资源,后拿到的先关闭,先拿到的后关闭
			resultSet.close();
			stat.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
