package cn.itheima01_LoginRegister;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 注册页面
 */
public abstract class AbstractRegistFrame extends JFrame {

	public JLabel registLabel1 = new JLabel("用户注册"); // 注册标签1
	public JLabel registLabel2 = new JLabel("传智播客.黑马程序员"); // 注册标签2
	public JLabel userNameLabel = new JLabel("用户名"); // 用户名标签
	public JTextField userNameField = new JTextField(); // 用户名文本框

	public JLabel passwordLabel = new JLabel("密码"); // 密码标签
	public JPasswordField passwordField = new JPasswordField(); // 密码文本框

	public JLabel rePasswordLabel = new JLabel("重复密码"); // 重复密码标签
	public JPasswordField rePasswordField = new JPasswordField(); // 重复密码文本框

	public JLabel birthdayLabel = new JLabel("出生日期"); // 生日标签

	public JComboBox<String> yearField = new JComboBox<String>(); // 年份选择框
	public JComboBox<String> monthField = new JComboBox<String>(); // 月份选择框
	public JComboBox<String> dayField = new JComboBox<String>(); // 日期选择框

	public JButton registBtn = new JButton("注\t册");// 注册按钮
	public JButton resetBtn = new JButton("重\t置");// 重置按钮

	public AbstractRegistFrame(Frame owner) {
		init(); // 初始化窗口
		addComponent(); // 添加组件
		addlistener(); // 事件加载
	}

	public AbstractRegistFrame() {
		init(); // 初始化窗口
		addComponent(); // 添加组件
		addlistener(); // 事件加载
	}

	// 初始化窗口
	private void init() {
		setTitle("注册");
		setSize(600, 360);
		// 去除布局
		setLayout(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void addComponent() {
		

		// 添加注册标题
		registLabel1.setFont(new Font("楷体", Font.BOLD, 20));
		registLabel1.setBounds(220, 20, 100, 30);
		this.add(registLabel1);
		registLabel2.setBounds(185, 50, 200, 20);
		this.add(registLabel2);

		// 用户名文本框
		userNameLabel.setBounds(100, 80, 60, 25);
		userNameField.setBounds(160, 80, 120, 25);
		this.add(userNameLabel);
		this.add(userNameField);

		// 密码文本框
		passwordLabel.setBounds(100, 110, 60, 25);
		passwordField.setBounds(160, 110, 120, 25);
		this.add(passwordLabel);
		this.add(passwordField);

		// 密码文本框
		rePasswordLabel.setBounds(290, 110, 60, 25);
		rePasswordField.setBounds(350, 110, 120, 25);
		this.add(rePasswordLabel);
		this.add(rePasswordField);

		// 生日
		birthdayLabel.setBounds(100, 140, 60, 25);

		yearField.setBounds(160, 140, 60, 25);
		monthField.setBounds(220, 140, 60, 25);
		dayField.setBounds(280, 140, 60, 25);

		Calendar now = Calendar.getInstance();
		int nowYear = now.get(Calendar.YEAR);

		for (int i = 1900; i <= nowYear; i++) {
			yearField.addItem(i + "");
		}
		for (int i = 1; i <= 12; i++) {
			monthField.addItem(i + "");
		}
		for (int i = 1; i <= 31; i++) {
			dayField.addItem(i + "");
		}

		this.add(birthdayLabel);
		this.add(yearField);
		this.add(monthField);
		this.add(dayField);

		// 注册按钮
		registBtn.setBounds(160, 240, 80, 25);
		this.add(registBtn);

		// 重置按钮
		resetBtn.setBounds(260, 240, 80, 25);
		this.add(resetBtn);
	}

	// 添加监听器(事件加载)
	public void addlistener() {

		// 表单重置
		resetBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				userNameField.setText("");
				passwordField.setText("");
				rePasswordField.setText("");

				yearField.setSelectedItem(1900);
				monthField.setSelectedItem(1);
				dayField.setSelectedItem(1);

				userNameField.requestFocus();
			}
		});

		registBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// 获取用户输入的注册信息
				String userName = userNameField.getText();
				char[] passwordArray = passwordField.getPassword();
				String password = new String(passwordArray);
				char[] repasswordArray = rePasswordField.getPassword();
				String rePassword = new String(repasswordArray);

				// 获取下拉菜单年月日
				String year = (String) yearField.getSelectedItem();
				String month = (String) monthField.getSelectedItem();
				String day = (String) dayField.getSelectedItem();
				String birthday = year + "-" + month + "-" + day;

				// 使用用户输入的注册信息调用regist方法完成注册
				regist(userName, password, rePassword, birthday);
			}
		});
	}

	// 注册方法
	public abstract void regist(String userName, String password, String rePassword, String birthday);

}
