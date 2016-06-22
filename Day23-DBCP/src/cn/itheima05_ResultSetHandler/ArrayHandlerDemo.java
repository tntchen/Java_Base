package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.Arrays;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

/*
 * ArrayHandler
 * 将结果集中的第一条记录封装到一个Object[]数组中，数组中的每一个元素就是这条记
 * 录中的每一个字段的值
 */
public class ArrayHandlerDemo {
	@Test
	public void ArrayHandlerMethod() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql = "select * from category";
			Object[] params = {};
			
			Object[] objs = qr.query(sql, new ArrayHandler(), params);
			System.out.println(Arrays.toString(objs));
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
