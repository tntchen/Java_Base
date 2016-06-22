package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

public class MapListHandlerDemo {
	
	@Test
	public void Method() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql = "select * from category";
			Object[] params = {};
			
			List<Map<String, Object>> list = qr.query(sql, new MapListHandler(), params);
			for (Map<String, Object> map : list) {
				System.out.println(map);
			}
			
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}
}
