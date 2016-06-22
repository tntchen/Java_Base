package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

public class ScalarHandlerDemo {
	
	@Test
	public void Method() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql ="select count(*) from category";
			Object[] params = {};
			Object counts = qr.query(sql, new ScalarHandler<Object>(), params);
			System.out.println(counts);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
	}
}
