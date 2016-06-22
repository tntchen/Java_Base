package cn.homwork;
/*
 * 使用连接池来获取数据库连接对象，并使用DBUitls工具类查询gjp_sort表中parent=
 * “支出”的所有sname集合，并将查询的结果打印到控制台上
 */

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import org.junit.Test;

public class homework1 {
	
	@Test
	public void method() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());
			String sql = "select sname from gjp_sort where parent =? ";
			Object[] params = {"支出"};
			List<Object[]> list = qr.query(sql, new ArrayListHandler(), params);
			
			for (Object[] objects : list) {
				System.out.println(Arrays.toString(objects));
			}
						
		} catch (SQLException e) {		
			throw new RuntimeException(e);
		}
	}
}
