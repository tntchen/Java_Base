package cn.itcast.gjp.view.test;

import javax.swing.JDialog;

import cn.itcast.gjp.view.AbstractOperationSortDialog;

public class AbstractOperationSortDialogTest extends
		AbstractOperationSortDialog {

	public AbstractOperationSortDialogTest(JDialog dialog) {
		super(dialog);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void confirm() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new AbstractOperationSortDialogTest(null).setVisible(true);
	}
}
