package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

public class ColumnListHandlerDemo {
	
	@Test
	public void Method() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "select cname from category";
			Object[] params = {};
			List<String> list = qr.query(sql, new ColumnListHandler<String>(), params);
			System.out.println(list);
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}
