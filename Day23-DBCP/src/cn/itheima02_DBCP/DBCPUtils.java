package cn.itheima02_DBCP;
/*
 * 创建DBCP连接池工具类
 * 作用:配置DBCP连接至,提供获取连接池中连接对象的方法
 */

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCPUtils {
	//创建连接池
	/*
	 * DataSource java提供的与连接池连接的接口规范,我们通过DBCP中的DataSourced
	 * 接口实现类,来完成连接池的创建
	 */
	private static BasicDataSource dataSource = new BasicDataSource();
	
	public static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/day22_jdbc";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	
	//通过静态代码块完成datasource对象的信息配置
	static {
		//指定驱动名称
		dataSource.setDriverClassName(DRIVER_CLASS_NAME);
		//指定当前数据库url
		dataSource.setUrl(URL);
		//指定数据哭用户名和密码
		dataSource.setUsername(USER_NAME);
		dataSource.setPassword(PASSWORD);
	}
	
	/*
	 * 提供获取连接池中连接的方法
	 */
	public static Connection getDataDource() {
		
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
