package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.Category;
import cn.itheima04_updateMethod.DBCPUtils;

public class BeanHandlerDemo {
	@Test
	public void ArrayHandlerMethod() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "select * from category";
			Object[] params = {};
			
			Category category = qr.query(sql, new BeanHandler<Category>(Category.class), params);
			System.out.println(category);
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
