package cn.itheima02_GUI;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 事件监听-鼠标,按钮的双击操作
 */
public class JFrameDemo03 {
	public static void main(String[] args) {
		//创建窗体对象
		JFrame frame = new JFrame("My Frame");
		//设置窗体尺寸大小
		frame.setSize(400, 300);
		//设置窗体显示位置
		frame.setLocation(400, 200);
		//设置窗体布局方式
		frame.setLayout(new FlowLayout());
		//设置窗体关闭操作默认
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE	);
		//-------------------------------------
		//创建按钮
		JButton button = new JButton("双击按钮");
		//为按钮添加鼠标监听
		button.addMouseListener(new MouseAdapter() {


			@Override
			public void mouseClicked(MouseEvent e) {
				// 重写鼠标点击方法,判断鼠标双击操作
				super.mouseClicked(e);
				int count = e.getClickCount();
				if (count == 2) {
					System.out.println("鼠标双击了该按钮");
				}
			}
		});
		//把按钮添加到窗体中
		frame.add(button);
		//显示窗体
		frame.setVisible(true);
	}
}
