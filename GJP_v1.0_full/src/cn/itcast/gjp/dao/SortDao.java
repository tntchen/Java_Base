package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.gjp.domain.Sort;
import cn.itcast.gjp.tools.JDBCUtils;

/**
 * 财务分类数据层类
 */
public class SortDao {
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public List<Sort> querySortAll() {
		String sql = "select * from gjp_sort";
		Object[] params = {};
		
		try {
			return qr.query(sql, new BeanListHandler<Sort>(Sort.class), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 添加分类
	 */
	public void addSort(Sort sort) {
		String sql = "insert into gjp_sort(sname,parent,sdesc) values(?,?,?)";
		Object[] params = {sort.getSname(),sort.getParent(),sort.getSdesc()};
		
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 编辑分类
	 */
	public void editSort(Sort sort) {
		String sql = "update gjp_sort set sname=?,parent=?,sdesc=? where sid=?";
		Object[] params = {sort.getSname(),sort.getParent(),sort.getSdesc(),sort.getSid()};
		
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 删除分类
	 */
	public void deleteSort(Sort sort) {
		String sql = "delete from gjp_sort where sid =?";
		Object[] params = {sort.getSid()};
		
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 查询所有分类的名称
	 */
	public List<Object> querySortNameAll() {
		String sql = "select sname from gjp_sort";
		Object[] params = {};
		
		try {
			return qr.query(sql, new ColumnListHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 查询指定父分类下的子分类名称
	 */
	public List<Object> querySortNameByParent(String parent) {
		String sql = "select sname from gjp_sort where parent=?";
		Object[] params = {parent};
		
		try {
			return qr.query(sql, new ColumnListHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 获取指定分类ID所对应的分类名称
	 */
	public String getSnameBySid(int sid) {
		String sql = "select sname from gjp_sort where sid=?";
		Object[] params ={sid};
		try {
			return (String) qr.query(sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 获取指定分类名称对应的分类id
	 */
	public int getSidBySname(String sname) {
		String sql = "select sid from gjp_sort where sname = ?";
		Object[] params = {sname};
		try {
			return (Integer) qr.query(sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
