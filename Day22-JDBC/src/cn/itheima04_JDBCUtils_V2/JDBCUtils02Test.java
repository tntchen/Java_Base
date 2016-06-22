package cn.itheima04_JDBCUtils_V2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;


/*
 * JDBCUtils01工具类中的方法
 */
public class JDBCUtils02Test {
	
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
		
		//通过JDBCUtils工具类，获取数据库的连接对象
		Connection connection = JDBCUtils02.getConnection();
		
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
