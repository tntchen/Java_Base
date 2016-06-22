package cn.homework1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

/*
 * 实现窗体关闭操作
 */
class FrameDemo extends JFrame {
	//构造方法
	public FrameDemo() {
		//设置标题
		this.setTitle("My Frame");
		//设置窗体宽高
		this.setSize(400, 300);
		//设置显示位置
		this.setLocation(300, 200);
		//设置布局
		this.setLayout(new FlowLayout());
		//设置默认关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
