package cn.homwork;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*
 * 创建DBCP连接池工具类
 */
public class DBCPUtils {
	//创建连接池
	private static BasicDataSource dataSource = new BasicDataSource();
	
	public static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/gjp";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	
	//通过静态代码块完成dataSource对象信息配置
	static {
		dataSource.setDriverClassName(DRIVER_CLASS_NAME);
		dataSource.setUrl(URL);
		dataSource.setUsername(USER_NAME);
		dataSource.setPassword(PASSWORD);
	}
	
	public static DataSource getDataSource() {
		return dataSource;
	}
}
