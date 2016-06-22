package cn.itheima.fruit.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 主界面
 */
public abstract class AbstractMainFrame extends JFrame {
	static {
    	try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 成员变量
	 */
	private JLabel titleLabel = new JLabel(new ImageIcon("FruitStore.jpg"));// 图片标签
	private JButton btn = new JButton("进入系统");// 进入系统按钮

	/*
	 * 构造方法
	 */
	public AbstractMainFrame() {
		// 1, 窗体初始化操作
		this.init();
		// 2, 添加组件到窗体
		this.addComponent();
		// 3, 为组件添加监听
		this.addListener();
	}

	/*
	 * 1, 窗体初始化操作
	 */
	private void init() {
		this.setTitle("水果超市欢迎您!");// 设置窗体标题
		this.setSize(600, 400);// 设置窗体尺寸宽高
		GUITools.center(this);// 设置窗口在屏幕居中显示
		this.setResizable(false);// 设置窗体大小固定不可变
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体关闭默认操作
	}

	/*
	 * 2, 添加组件到窗体
	 */
	private void addComponent() {
		// 窗体本身没有设置布局，使用默认的Border布局
		// 向窗体北区中放入标题图片
		this.add(this.titleLabel, BorderLayout.NORTH);

		// 创建面板，用于存放按钮
		JPanel btnPanel = new JPanel();
		// 为面板取消默认的布局，让我们自定义组件位置与尺寸
		btnPanel.setLayout(null);
		// 设置按钮位置与尺寸大小
		btn.setBounds(240, 20, 120, 50);
		//创建字体对象
		Font font = new Font("华文彩云", Font.BOLD, 20);
		//设置按钮文字的字体
		btn.setFont(font);
		// 向面板中添加按钮
		btnPanel.add(btn);
		// 向窗体中添加面板
		this.add(btnPanel);
	}

	/*
	 * 3, 为组件添加监听
	 */
	public void addListener() {
		// 为按钮添加监听器
		btn.addActionListener(new ActionListener() {
			// 当用户点击"进入系统"按钮时，触发的方法
			@Override
			public void actionPerformed(ActionEvent e) {
				// 显示管理员界面
				fruitMng();
			}
		});
	}

	// 定义抽象方法,点击"进入系统"按钮时调用
	public abstract void fruitMng();
}
