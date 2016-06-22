package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

public class MapHandlerDemo {
	
	@Test
	public void Method() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql = "select * from category";
			Object[] params = {};
			
			Map<String, Object> map = qr.query(sql, new MapHandler(), params);
			Set<String> keys = map.keySet();
			for (String key : keys) {
				Object value = map.get(key);
				System.out.println(key + "--" + value);
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
