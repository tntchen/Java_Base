package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.Category;
import cn.itheima04_updateMethod.DBCPUtils;

public class BeanListHandlerDemo {
	
	@Test
	public void method() {
		 try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			 String sql = "select * from category";
			 Object[] params = {};
			 
			 List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class), params);
			 for (Category category : list) {
				System.out.println(category);
			}
		 } catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
