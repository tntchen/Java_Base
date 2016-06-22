package cn.itheima02_GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 事件监听-按钮
 * 窗体中按钮的点击操作
 */
public class JFrameDemo02 {
	public static void main(String[] args) {
		//创建窗体,设置窗体标题
		JFrame frame = new JFrame();
		
		//设置窗体大小
		frame.setSize(400, 300);
		
		//设置窗体显示位置
		frame.setLocation(400, 200);
		
		//设置窗体的布局方式
		frame.setLayout(new FlowLayout());
		
		//设置窗体关闭操作的默认设置
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//创建按钮
		JButton button = new JButton("kick me ass~");
		
		//为当前按钮添加一个点击事件监听
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//在下面方法中完成惦记按钮动作的操作
				System.out.println("yo,you hurt me");
				System.out.println(e);
			}
		});
		
		
		//把按钮添加到窗体
		frame.add(button);
		
		//窗体显示
		frame.setVisible(true);
		
	}
}
