package cn.itcast.gjp.controller;

import cn.itcast.gjp.view.AbstractMainFrame;
/**
 * 主界面控制类
 */
public class MainFrameController extends AbstractMainFrame {
	
	/**
	 * 点击"账务管理"按钮时调用本方法
	 */
	@Override
	public void ledgerMng() {
		new LedgerMngDialogController(this).setVisible(true);
	}
	
	/**
	 * 点击"分类管理"时调用本方法
	 */
	@Override
	public void sortMng() {
		new SortMngDialogController(this).setVisible(true);
	}

}
