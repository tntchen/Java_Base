package cn.itcast.gjp.view.test;

import javax.swing.JFrame;

import cn.itcast.gjp.view.AbstractSortMngDialog;

public class AbstractSortMngDialogTest extends AbstractSortMngDialog {
	public AbstractSortMngDialogTest(JFrame frame) {
		super(frame);
	}

	@Override
	public void addSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editSort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSort() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new AbstractSortMngDialogTest(null).setVisible(true);
	}
}
