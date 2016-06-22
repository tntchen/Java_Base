package cn.itheima05_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * 演示文本框的使用
 */
public class JTextFieldDemo {
	public static void main(String[] args) {
		//创建窗体
		JFrame frame = new JFrame("我的窗体");
		//设置窗体的尺寸宽高
		frame.setSize(400, 300);
		//设置窗体在屏幕上显示的位置
		frame.setLocation(400, 200);
		//设置窗体的布局方式
		frame.setLayout(new FlowLayout());
		//设置窗体的默认关闭操作
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//---------------------------------------
		//创建文本框
		final JTextField text = new JTextField(30);
		//添加文本框到窗体
		frame.add(text);
		
		//创建按钮
		JButton btn = new JButton("单击按钮");
		//添加按钮到窗体
		frame.add(btn);
		//--------------------------------------
		//为按钮添加监听
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//为文本框赋值
				//System.out.println("赋值成功了");
				//text.setText("哈哈，我进到文本框了");
				
				//获取文本框中的值
				String result = text.getText();
				System.out.println("获取值成功了 = " + result);
				
			}
		});
		//---------------------------------------
		//显示窗体
		frame.setVisible(true);
	}
}
