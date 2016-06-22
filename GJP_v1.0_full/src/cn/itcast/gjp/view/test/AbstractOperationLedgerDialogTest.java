package cn.itcast.gjp.view.test;

import javax.swing.JDialog;

import cn.itcast.gjp.view.AbstractOperationLedgerDialog;

public class AbstractOperationLedgerDialogTest extends
		AbstractOperationLedgerDialog {

	public AbstractOperationLedgerDialogTest(JDialog dialog) {
		super(dialog);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeParent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new AbstractOperationLedgerDialogTest(null).setVisible(true);
	}
}
