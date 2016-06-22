package cn.homwork;
/*
 * 使用连接池来获取数据库连接对象，并使用DBUitls工具类，书写一个工具类，工具类
 * 中包含1个查询方法，1个更新方法，查询方法根据传递的实参sname完成对应的parent
 * 查询，更新方法根据传递的实参sid完成对应的sname
 */

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class homework2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出查询sname:");
		String sname = sc.nextLine();
		homework2 h = new homework2();
		h.method1(sname);
		System.out.println("请输入要更改的sid:");
		String sid = sc.nextLine();
		System.out.println("请输入要更改的sname:");
		String sname1 = sc.nextLine();
		h.method2(sid,sname1);
	}
		
	public void method1(String sname) {
		//查询方法
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());
			String sql = "select sname,parent from gjp_sort where sname=?";
			Object[] params = {sname};
			gjp_sort sort = qr.query(sql, new BeanHandler<gjp_sort>(gjp_sort.class), params);
			System.out.println(sort.getSname()+"-"+sort.getParent());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void method2(String sid,String sname) {
		try {
			QueryRunner qr = new QueryRunner(DBCPUtils.getDataSource());
			String sql = "update gjp_sort set sname=? where sid=?";
			Object[] params = {sname,sid};
			
			int update = qr.update(sql, params);
			System.out.println(update);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
