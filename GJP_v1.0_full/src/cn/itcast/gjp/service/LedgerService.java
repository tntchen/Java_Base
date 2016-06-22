package cn.itcast.gjp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.itcast.gjp.dao.LedgerDao;
import cn.itcast.gjp.dao.SortDao;
import cn.itcast.gjp.domain.Ledger;
import cn.itcast.gjp.domain.QueryForm;

/**
 * 财务业务层
 */
public class LedgerService {
	private LedgerDao ledgerDao = new LedgerDao();
	private SortDao sortDao = new SortDao();
	
	/**
	 * 多条件查询服务
	 */
	public Map<String, Object> query(QueryForm queryForm) {
		/*
		 * 1.使用QueryForm对象调用LedgerDao#queryLedgerByQueryForm()方法，
		 * 得到所有符合条件的Ledger对象，即List<Ledger>；
		 */
		List<Ledger> ledgerList = ledgerDao.queryLedgerByQueryForm(queryForm);
		/*
		 * 2.循环List<Ledger>对象：
		 * 设计总收入和总支出；
		 * 获取每个Ledger对象的sid，然后调用SortDao#getSnameBySid()方法获取对应sanme，
		 * 并设置给Ledger对象的sname属性；
		 */
		double inMoney = 0;
		double payMoney = 0;
		for (Ledger ledger : ledgerList) {
			ledger.setSname(sortDao.getSnameBySid(ledger.getSid()));
			if (ledger.getParent().equals("收入")) {
				inMoney += ledger.getMoney();
			} else if (ledger.getParent().equals("支出")) {
				payMoney += ledger.getMoney();
			}
		}
		/*
		 * 3.创建Map对象，把List<Ledger>，以及总支出和总收入保存到Map中，在Map中的key分别为：
		 * ledgerList：对应List<Ledger>；
		 * in：对应总收入；
		 * pay：对应总支出；
		 */
		Map<String, Object> datas = new HashMap<String, Object>();
		datas.put("ledgerList", ledgerList);
		datas.put("in",	inMoney);
		datas.put("pay", payMoney);
		
		return datas;
	}
	/**
	 * 添加账务
	 */
	public void addLedger(Ledger ledger) {
		ledgerDao.addLedger(ledger);
	}
	/**
	 * 编辑账务
	 */
	public void editLedger(Ledger tableLedger) {
		ledgerDao.editLedger(tableLedger);
	}
	/**
	 * 删除账务
	 */
	public void deleteLedger(Ledger ledger) {
		ledgerDao.deleteLedger(ledger);
	}
	/**
	 * 每种支出分类的汇总
	 */
	public Map<String, Double> querySumMoneyBySort(String parent) {
		List<Object[]> objArrayList = ledgerDao.querySumMoneyBySort(parent);
		Map<String, Double> sumMoneyMap = new HashMap<>();
		for (Object[] objArray : objArrayList) {
			int sid = (int) objArray[0];
			double sumMoney = (double) objArray[1];
			
			String sname = sortDao.getSnameBySid(sid);
			sumMoneyMap.put(sname, sumMoney);
		}
		return sumMoneyMap;
	}
	/**
	 * 年度总支出
	 */
	public double queryTotalMoneyByParent(String parent) {
		return ledgerDao.getTotalMoney(parent);
	}
	/**
	 * 通过分类id获取该分类下的财务记录个数
	 */
	public int getLedgerCountBySid(int sid) {
		return ledgerDao.getLedgerCountBySid(sid);
	}
}
