package cn.itcast.gjp.app;

import cn.itcast.gjp.controller.MainFrameController;

public class MainApp {
	public static void main(String[] args) {
		/**
		 * 启动主界面
		 * 1.创建MainFrameController对象
		 * 2.显示窗口
		 */
		new MainFrameController().setVisible(true);
	}
}
