package cn.itheima04_JDBCUtils_V2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*
 * JDBC鐨勫伐鍏风被锛岄噰鐢╬roperties閰嶇疆鏂囦欢鏂瑰紡瀹炵幇
 * 
 * 1, 鍒涘缓 閰嶇疆鏂囦欢  db.properties锛�缂栧啓閰嶇疆鏂囦欢鍐呭
 * 2, 鍔犺浇(璇诲彇) 閰嶇疆鏂囦欢 鐨勫唴瀹�
 */
public class JDBCUtils02 {

	public static String DRIVER = null;//椹卞姩
	public static String URL = null; //JDBC鐨勮繛鎺ヨ矾寰�
	public static String USER = null; //鐢ㄦ埛鍚�
	public static String PASSWORD = null; //瀵嗙爜
	
	//閫氳繃闈欐�浠ｇ爜鍧楋紝瀹屾垚閰嶇疆鏂囦欢鍐呭鐨勮鍙栵紝缁欓潤鎬佸彉閲忚祴鍊�
	static {
		try {
			//1,鍒涘缓Properties闆嗗悎
			Properties prop = new Properties();
			//2,璇诲彇閰嶇疆鏂囦欢  db.properties鐨勬暟鎹埌 闆嗗悎涓�
			prop.load(new FileInputStream("db.properties"));
			//3,鑾峰彇闆嗗悎涓殑鏁版嵁锛岃祴鍊肩粰闈欐�鍙橀噺
			DRIVER = prop.getProperty("jdbc.driver");
			URL = prop.getProperty("jdbc.url");
			USER = prop.getProperty("jdbc.user");
			PASSWORD = prop.getProperty("jdbc.password");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 杩斿洖杩炴帴瀵硅薄
	 */
	public static Connection getConnection(){
		try {
			Class.forName(DRIVER);
			//2锛岃幏寰楄繛鎺�
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			return connection;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
}
