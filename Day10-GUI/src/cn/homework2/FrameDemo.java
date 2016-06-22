package cn.homework2;
/*
 * 要求点击按钮时在控制台输出“好开心”
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		//设置关闭
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//设置按钮
		JButton button = new JButton("ckick on me!");
		//设置按钮颜色
		button.setBackground(new Color(62, 171, 230));
		//把按钮添加到窗体
		this.add(button);
		//为按钮添加事件监听
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("好开心");
			}
		});
	}
}
