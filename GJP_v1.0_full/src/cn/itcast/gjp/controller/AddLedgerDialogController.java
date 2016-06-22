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
 * 添加账务对话框
 */
public class AddLedgerDialogController extends AbstractOperationLedgerDialog {
	private LedgerService ledgerService = new LedgerService();
	private SortService sortService = new SortService();
	
	public AddLedgerDialogController(JDialog dialog) {
		super(dialog);
		//修改标题
		this.setTitle("添加账务");
		titleLabel.setText("添加账务");
		
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
	 * 确认按钮
	 */
	@Override
	public void confirm() {
		String parent = parentBox.getSelectedItem().toString();
		if (parent.equals("-请选择-")) {
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
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "\"账户\"不能为空！");
			return;
		}
		String createtime = createtimeTxt.getText();
		String desc = ldescTxt.getText(); 
		Ledger ledger = new Ledger();
		ledger.setParent(parent);
		ledger.setAccount(account);
		ledger.setMoney(money);
		ledger.setCreatetime(createtime);
		ledger.setLdesc(desc); 
		int sid = sortService.getSidBySname(sname);
		ledger.setSid(sid) ;
		ledgerService.addLedger(ledger) ;
		this.dispose() ;

	}

}
