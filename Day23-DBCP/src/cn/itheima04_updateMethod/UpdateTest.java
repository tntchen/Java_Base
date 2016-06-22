package cn.itheima04_updateMethod;
/*
 * 使用DBUtils工具中QueryRunner对象的update方法,实现增删改操作
 */

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import com.mysql.fabric.xmlrpc.base.Params;

public class UpdateTest {
	/*
	 * 增加
	 */
	@Test
	public void insertMethod() {
		
		try {
			//创建QueryRunner对象
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			//执行SQL语句
			String sql = "insert into category values(?,?)";
			Object[] params = {"c006","奢侈品"};
			int update = qr.update(sql, params);
			//看结果
			System.out.println(update);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/*
	 * 修改 
	 */
	@Test
	public void updateMethod() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "update category set cname=? where cid=?";
			Object[] params = {"奢侈品","c006"};
			qr.update(sql, params);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/*
	 * 删除
	 */
	@Test
	public void deleteMethod() {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataDource());
			String sql = "delete from category where cid=?";
			Object[] params = {"c006"};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
