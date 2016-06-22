package cn.itheima02_GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 第一个GUI案例,窗体
 */
public class JFrameDemo01 {
	public static void main(String[] args) {
		//创建一个窗体
		JFrame frame = new JFrame("My Frame");
		//给窗口设置宽高
		frame.setSize(400, 300);
		//设置窗体在屏幕上显示的位置
		frame.setLocation(400, 200);
		//设置窗体关闭的默认操作
		frame.setDefaultCloseOperation(3);
		//设置窗体的布局方式
		frame.setLayout(new FlowLayout());//流式布局
		
		//创建按钮
		JButton button = new JButton("Button");
		//按钮添加到窗体内
		frame.add(button);	
		
		//显示窗体
		frame.setVisible(true);
	}
}
