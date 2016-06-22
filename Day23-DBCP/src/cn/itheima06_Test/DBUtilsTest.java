package cn.itheima06_Test;
/*
 * ResultSetHandler结果集使用练习
 */

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import cn.itheima04_updateMethod.Category;
import cn.itheima04_updateMethod.DBCPUtils;

public class DBUtilsTest {
	
	@Test
	public void Method1() {
		//通过id查询分类表得到对应信息
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			
			String sql = "select * from category where cid=?";
			Object[] params = {"c003"};
			 
			Category category = qr.query(sql, new BeanHandler<Category>(Category.class), params);
			System.out.println(category);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
	
	@Test
	public void Method2() {
		//查询分类表中所有分类对象
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "select * from category";
			Object[] params = {};
			List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class), params);
			for (Category category : list) {
				System.out.println(category);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void Method3() {
		//查询分类表中所有分类对象
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "select count(*) from category";
			Object[] params = {};
			
			Object counts = qr.query(sql, new ScalarHandler<Object>(), params);
			System.out.println(counts);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
