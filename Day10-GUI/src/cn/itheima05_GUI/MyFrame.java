 package cn.itheima05_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

abstract class MyFrame extends JFrame {
	//创建按钮
	JButton button = new JButton("click on me");
	//构造方法
	public MyFrame() {
		//1.窗体相关信息初始化
		init();
		//2.添加组件到窗体
		addComponent();
		//3.为组件添加事件监听
	}
	
	private void init() {
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
	
	private void addComponent() {
		
		//把按钮添加到窗体
		this.add(button);
	}
	
	private void addListener() {
		//为按钮添加事件监听
		button.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				method();
			}
		});
	}
	
	public abstract void method();
}
