package cn.itheima.fruit.other;

import cn.itheima.fruit.view.AbstractFruitMngDialog;
import cn.itheima.fruit.view.AbstractMainFrame;
/*
 * 主窗口控制类
 */
public class MainFrameController extends AbstractMainFrame {

	@Override
	public void fruitMng() {
		//点击"进入系统时"会进行该方法调用,重写了GUI界面中的抽象方法
		new FruitMngDialogController(this).setVisible(true);
	}

}
