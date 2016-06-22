package cn.itcast.gjp.view.test;

import javax.swing.JFrame;

import cn.itcast.gjp.view.AbstractLedgerMngDialog;

public class AbstractLedgerMngDialogTest extends AbstractLedgerMngDialog {

	public AbstractLedgerMngDialogTest(JFrame frame) {
		super(frame);
	}
	
	@Override
	public void addLedger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editLedger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteLedger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void queryLedger() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parentChange() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pie() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new AbstractLedgerMngDialogTest(null).setVisible(true);
	}
}
