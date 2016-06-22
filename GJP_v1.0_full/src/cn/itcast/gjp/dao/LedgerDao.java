package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.itcast.gjp.domain.Ledger;
import cn.itcast.gjp.domain.QueryForm;
import cn.itcast.gjp.domain.Sort;
import cn.itcast.gjp.tools.DateUtils;
import cn.itcast.gjp.tools.JDBCUtils;

/**
 * 财务数据层
 */
public class LedgerDao {
	//获取数据库连接池
	private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	private SortDao sortDao = new SortDao();
	
	/**
	 * 多条件查询
	 */
	public List<Ledger> queryLedgerByQueryForm(QueryForm queryForm) {
		/*
		 * 1.给出基本查询语句，以及参数值列表；
		 * 给出基本的查询语句：“SELECT * FROM gjp_ledger”；
		 * 创建参数值列表：List<Object> params
		 */
		StringBuilder sql = new StringBuilder("SELECT * FROM gjp_ledger WHERE 1=1 ");
		List<Object> params = new ArrayList<Object>();
		/*
		 * 2.判断QueryForm中每个属性是否存在，确定是否转换成条件子句；
		 * 开始时间和结束时间是否存在，如果存在就添加这个条件子句；
		 * 参数值添加开始时间与结束时间
		 * 3.当确定添加条件子句后，要追加对应的参数值到参数值列表中；
		 * SQL语句中有几个“?”，就要提供几个值，所以我们需要在向params中添加对应的参数值
		 */
		if (queryForm.getBegin() != null && !queryForm.getBegin().isEmpty() &&
				queryForm.getEnd() != null && !queryForm.getEnd().isEmpty()) {
			sql.append("AND createtime BETWEEN ? AND ? ");
			params.add(queryForm.getBegin());
			params.add(queryForm.getEnd());
		}
		if (queryForm.getParent() != null) {
			if (queryForm.getParent().equals("收入") || queryForm.getParent().equals("支出")) {
				sql.append("AND parent=? ");
				params.add(queryForm.getParent());
			}
		}
		if (queryForm.getSname() != null && !queryForm.getSname().equals("-请选择-")) {
			int sid = sortDao.getSidBySname(queryForm.getSname());
			sql.append("AND sid=? ");
			params.add(sid);
		}
		try {
			return qr.query(sql.toString(), new BeanListHandler<Ledger>(Ledger.class), params.toArray());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 添加账务
	 */
	public void addLedger(Ledger ledger) {
		String sql = "INSERT INTO gjp_ledger(parent,sid,account,money,createtime,ldesc) VALUES(?,?,?,?,?,?)";
		Object[] params = {ledger.getParent(),ledger.getSid(),ledger.getAccount(),
				ledger.getMoney(),ledger.getCreatetime(),ledger.getLdesc()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 编辑账务
	 */
	public void editLedger(Ledger ledger) {
		String sql = "update gjp_ledger set parent=?,sid=?,account=?,money=?,createtime=?,ldesc=? where lid=?";
		Object[] params = {ledger.getParent(),ledger.getSid(),ledger.getAccount(),
				ledger.getMoney(),ledger.getCreatetime(),ledger.getLdesc(),ledger.getLid()};	
		try {
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 删除账务
	 */
	public void deleteLedger(Ledger ledger) {
		String sql = "delete from gjp_ledger where lid=?";
		Object[] params = {ledger.getLid()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 每种支出分类的汇总
	 */
	public List<Object[]> querySumMoneyBySort(String parent) {
		String sql = "select sid,sum(money) total from gjp_ledger" +
				" where createtime like ? and parent=?" + " group by sid";
		Object[] params = {DateUtils.getYear() + "%",parent};
		try {
			return qr.query(sql, new ArrayListHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 年度总支出
	 */
	public double getTotalMoney(String parent) {
		String sql = "select sum(money) total from gjp_ledger" +
				" where createtime like ? and parent=?";
		Object[] params = {DateUtils.getYear() + "%", parent};
		try {
			return (double) qr.query(sql, new ScalarHandler(), params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 通过分类id获取该分类下的财务记录个数
	 */
	public int getLedgerCountBySid(int sid) {
		String sql = "select count(*) from gjp_ledger where sid=?";
		Object[] params = {sid};
		try {
			long aLong  = (long) qr.query(sql, new ScalarHandler(), params);
			return (int) aLong;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
