package cn.itheima.fruit.view;

import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.JFrame;

/*
 * GUI工具类，提供窗口居中的方法，以及一些其他设置窗体的方法
 */
public class GUITools {
	//创建Java提供的GUI工具对象
	static Toolkit kit = Toolkit.getDefaultToolkit();
	
	//将指定组件屏幕居中
	public static void center(Component c) {
		
		int x = (kit.getScreenSize().width - c.getWidth()) / 2;
		int y = (kit.getScreenSize().height - c.getHeight()) / 2;
		c.setLocation(x, y);
	}
	
}
