package cn.itheima01_LoginRegister;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 登录页面
 */
public abstract class AbstractLoginFrame extends JFrame {

	public JLabel userNameLabel = new JLabel("用户名"); // 用户名标签
	public JTextField userNameField = new JTextField(); // 用户名文本框

	public JLabel passwordLabel = new JLabel("密码"); // 密码标签
	public JPasswordField passwordField = new JPasswordField(); // 密码文本框

	public JLabel verifyCodeLabel = new JLabel("验证码");// 验证码标签
	public JTextField codeField = new JTextField(); // 验证码文本框

	public String code; // 正确验证码
	public JLabel codeLabel = new JLabel();// 验证码值显示标签

	public JButton registBtn = new JButton("注\t册");// 注册按钮
	public JButton loginBtn = new JButton("登\t录");// 登录按钮

	/**
	 * 构造方法
	 */
	public AbstractLoginFrame() {
		init(); // 初始化窗口
		addComponent(); // 添加组件
		addlistener(); // 事件加载
	}

	// 初始化窗口
	private void init() {
		this.setTitle("登录");
		this.setSize(400, 300);
		// 去除布局
		this.setLayout(null);
		// 可以使用windowListener的windowClosing方法做事件监听，调用System的exit方法终止程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		code = getCodes(); // 生成验证码为验证码变量赋值
		codeLabel.setText(code); // 使用验证码值为验证码Lable赋值
	}

	// 添加组件
	private void addComponent() {
		// 用户名文本框
		userNameLabel.setBounds(100, 40, 60, 25);
		userNameField.setBounds(160, 40, 120, 25);
		this.add(userNameLabel);
		this.add(userNameField);

		// 密码文本框
		passwordLabel.setBounds(100, 70, 60, 25);
		passwordField.setBounds(160, 70, 120, 25);
		this.add(passwordLabel);
		this.add(passwordField);

		// 验证码
		verifyCodeLabel.setBounds(100, 100, 60, 25);
		codeField.setBounds(160, 100, 120, 25);
		codeLabel.setBounds(300, 100, 60, 25);
		codeLabel.setOpaque(true); // 设置label可设置背景色
		codeLabel.setBackground(new Color(200, 200, 200));
		this.add(verifyCodeLabel);
		this.add(codeField);
		this.add(codeLabel);

		// 注册按钮
		registBtn.setBounds(100, 150, 80, 25);
		this.add(registBtn);
		// 登录按钮
		loginBtn.setBounds(200, 150, 80, 25);
		this.add(loginBtn);
	}

	// 加入事件监听
	public void addlistener() {
		// 为文本框添加监听器
		userNameField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userNameField.setText("");
			}
		});

		// 为文本框添加监听器
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordField.setText("");
			}
		});

		// 为文本框添加监听器
		codeField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				codeField.setText("");
			}
		});

		// 为验证码Label添加监听
		codeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 再次生成随机字符串
				code = getCodes();
				// 将再次生成的随机验证码放到对应的label中
				codeLabel.setText(code);
			}
		});

		// 为登录按钮添加监听
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 点击登录按钮，调用登录方法
				String userName = userNameField.getText();
				String passWd = passwordField.getText();
				String codesInput = codeField.getText();
				String codesLabel = codeLabel.getText();
				login(userName, passWd, codesInput, codesLabel);
			}
		});

		// 为注册按钮添加监听
		registBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 显示注册界面
				new RegistFrameController().setVisible(true);
			}
		});

	}
	
	// 登录动作 方法
	public abstract void login(String userName, String passWd, String codesInput, String codesLabel) ;
	// 生成验证码
	public abstract String getCodes() ;
}
