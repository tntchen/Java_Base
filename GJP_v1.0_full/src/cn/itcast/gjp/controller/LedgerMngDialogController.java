package cn.itcast.gjp.controller;

import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cn.itcast.gjp.domain.Ledger;
import cn.itcast.gjp.domain.QueryForm;
import cn.itcast.gjp.service.LedgerService;
import cn.itcast.gjp.service.SortService;
import cn.itcast.gjp.view.AbstractLedgerMngDialog;
/**
 * 账务管理界面控制类
 */
public class LedgerMngDialogController extends AbstractLedgerMngDialog {
	private SortService sortService = new SortService();
	private LedgerService ledgerService = new LedgerService();
	
	public LedgerMngDialogController(JFrame frame) {
		super(frame);
		
	}
	
	/**
	 * 点击"添加"按钮时调用本方法
	 */
	@Override
	public void addLedger() {
		new AddLedgerDialogController(this).setVisible(true);
	}
	/**
	 * 点击"编辑"按钮时调用本方法
	 */
	@Override
	public void editLedger() {
		int row = ledgerDataTable.getSelectedRow();
		if (row < 0) {
			JOptionPane.showMessageDialog(null, "请选择要编辑的账务数据!");
			return;
		}
		Ledger ledger = this.getLedgerByTableRow(row);
		if (ledger == null) {
			JOptionPane.showMessageDialog(null, "您选择的是空格,请重新选择!");
			return;
		}
		new EditLedgerDialogController(this, ledger).setVisible(true);
		this.queryLedger();
	}
	/**
	 * 点击"删除"按钮时调用本方法
	 */
	@Override
	public void deleteLedger() {
		int row = ledgerDataTable.getSelectedRow();
		if (row < 0) {
			JOptionPane.showMessageDialog(null, "请选择要编辑的账务数据!");
			return;
		}
		Ledger ledger = this.getLedgerByTableRow(row);
		if (ledger == null) {
			JOptionPane.showMessageDialog(null, "您选择的是空格,请重新选择!");
			return;
		}
		
		int m = JOptionPane.showConfirmDialog(null, "您是否真要删除该账务数据");
		if (m == JOptionPane.OK_OPTION) {
			ledgerService.deleteLedger(ledger);
			this.queryLedger();
		}
	}
	/**
	 * 点击"查询"按钮时调用本方法
	 */
	@Override
	public void queryLedger() {
		//1.获取表单数据封装到QueryForm对象中
		QueryForm queryForm = new QueryForm();
		queryForm.setBegin(beginDateTxt.getText());
		queryForm.setEnd(endDateTxt.getText());
		queryForm.setParent(parentBox.getSelectedItem().toString());
		queryForm.setSname(sortBox.getSelectedItem().toString());
		//2.使用QueryForm对象调用LedgerService#query()方法，获取Map对象
		Map<String, Object> datas = ledgerService.query(queryForm);
		//3.把Map中数据显示到界面上
		List<Ledger> ledgerList = (List<Ledger>) datas.get("ledgerList");
		this.setTableModel(ledgerList);
		Double inMoneyTotal = (Double) datas.get("in");
		inMoneyTotalLabel.setText("总收入:" + inMoneyTotal);
		Double payMoneyTotal = (Double) datas.get("pay");
		payMoneyTotalLabel.setText("总支出:" + payMoneyTotal);
	}
	/**
	 * 点击"收\支"下拉框时调用本方法
	 */
	@Override
	public void parentChange() {
		//获取用户选择的收支情况
		String parent = this.parentBox.getSelectedItem().toString();
		//判断用户选择哪一种收支情况
		if (parent.equals("-请选择-")) {
			Object[] sortItems = {"-请选择-"};
			sortBox.setModel(new DefaultComboBoxModel(sortItems));
		} else if (parent.equals("收入/支出")) {
			List<Object> sortItems = sortService.querySortNameAll();
			sortItems.add(0, "-请选择-");
			sortBox.setModel(new DefaultComboBoxModel(sortItems.toArray()));
		} else {
			List<Object> sortItems = sortService.querySortNameByParent(parent);
			sortItems.add(0, "-请选择-");
			sortBox.setModel(new DefaultComboBoxModel(sortItems.toArray()));
		}
	}
	/**
	 * 点击"收支比重统计"按钮时调用本方法
	 */
	@Override
	public void pie() {
		new ShapeDialogController(this).setVisible(true);
	}

}
