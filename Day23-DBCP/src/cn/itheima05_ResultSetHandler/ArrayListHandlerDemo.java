package cn.itheima05_ResultSetHandler;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.DBCPUtils;

/*
 * ArrayHandler
 * 将结果集中的第一条记录封装到一个Object[]数组中，数组中的每一个元素就是这条记
 * 录中的每一个字段的值
 */
public class ArrayListHandlerDemo {
	@Test
	public void ArrayHandlerMethod() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql = "select * from category";
			Object[] params = {};
			
			List<Object[]> list = qr.query(sql, new ArrayListHandler(), params);
			for (Object[] objects : list) {
				System.out.println(Arrays.toString(objects));
			}
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}
}
