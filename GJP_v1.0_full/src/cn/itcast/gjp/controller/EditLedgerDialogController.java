package cn.itcast.gjp.controller;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import cn.itcast.gjp.domain.Ledger;
import cn.itcast.gjp.service.LedgerService;
import cn.itcast.gjp.service.SortService;
import cn.itcast.gjp.view.AbstractOperationLedgerDialog;
/**
 * 编辑账务对话框
 */
public class EditLedgerDialogController extends AbstractOperationLedgerDialog {
	private Ledger tableLedger;
	private LedgerService ledgerService = new LedgerService();
	private SortService sortService = new SortService();
	
	public EditLedgerDialogController(JDialog dialog,Ledger ledger) {
		super(dialog);
		this.tableLedger = ledger;
		
		this.setTitle("编辑账务");
		titleLabel.setText("编辑账务");
		
		parentBox.setSelectedItem(tableLedger.getParent());
		sortBox.setSelectedItem(tableLedger.getSname());
		accountTxt.setText(tableLedger.getAccount());
		moneyTxt.setText(tableLedger.getMoney() + "");
		createtimeTxt.setText(tableLedger.getCreatetime());
		ldescTxt.setText(tableLedger.getLdesc()); 

	}
	/**
	 * 收支下拉框
	 */
	@Override
	public void changeParent() {
		String parent = this.parentBox.getSelectedItem().toString();
		if (parent.equals("-请选择-")) {
			Object[] sortItems = {"-请选择-"};
			sortBox.setModel(new DefaultComboBoxModel(sortItems));
		} else {
			List<Object> nameItems = sortService.querySortNameByParent(parent);
			nameItems.add(0,"-请选择-");
			sortBox.setModel(new DefaultComboBoxModel(nameItems.toArray()));
		}
	}
	/**
	 * 确认
	 */
	@Override
	public void confirm() {
		String parent = parentBox.getSelectedItem().toString();
		if(parent.equals("-请选择-")) {
			JOptionPane.showMessageDialog(this, "\"收/支\"不能为空！");
			return;
		}
		String sname = sortBox.getSelectedItem().toString();
		if(sname.equals("-请选择-")) {
			JOptionPane.showMessageDialog(this, "\"分类\"不能为空！");
			return;
		}
		String account = accountTxt.getText();
		if(account.isEmpty()) {
			JOptionPane.showMessageDialog(this, "\"账户\"不能为空！");
			return;
		}
		double money = 0;
		try {
			money = Double.parseDouble(moneyTxt.getText());
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "\"账户\"不能为空！");
			return;			
		}
		String createtime = createtimeTxt.getText();
		String desc = ldescTxt.getText(); 
		
		tableLedger.setParent(parent);
		tableLedger.setAccount(account);
		tableLedger.setMoney(money);
		tableLedger.setCreatetime(createtime);
		tableLedger.setLdesc(desc); 
		
		int sid = sortService.getSidBySname(sname);
		tableLedger.setSid(sid); 
		ledgerService.editLedger(tableLedger); 
		
		this.dispose(); 

	}

}
