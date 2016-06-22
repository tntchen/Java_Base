package cn.iteheima04_FileSearch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * 文件搜索案例
 */
public abstract class FileSearchFrame extends JFrame {

	// 添加标签
	private JLabel lab1 = new JLabel("目录：");
	// "路径"文本框
	protected JTextField txtPath = new JTextField();
	// 标签
	private JLabel lab2 = new JLabel("关键字：");
	// 关键字文本框
	protected JTextField txtKey = new JTextField();
	// 结果标签
	protected JLabel labResult = new JLabel();
	// 按钮
	private JButton searchBtn = new JButton("搜索");
	// 文本域
	protected JTextArea txtResult = new JTextArea();

	public FileSearchFrame() {
		init();
		addComponent();
	}

	// 初始化窗口
	private void init() {
		setTitle("文件搜索");
		setSize(650, 440);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// 添加组件
	private void addComponent() {

		// 取消布局
		setLayout(null);

		lab1.setBounds(30, 30, 80, 25);
		this.add(lab1);

		txtPath.setBounds(70, 30, 300, 25);
		this.add(txtPath);

		lab2.setBounds(390, 30, 80, 25);
		this.add(lab2);

		txtKey.setBounds(440, 30, 100, 25);
		this.add(txtKey);

		searchBtn.setBounds(570, 30, 60, 25);
		searchBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				search();
				//System.out.println("我要做搜索动作了！");
			}

		});
		this.add(searchBtn);
		// JScrollPane用于为文本域占位
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 70, 600, 300);
		// 搜索结果文本域
		scrollPane.setViewportView(txtResult);
		this.add(scrollPane);

		// 标签
		this.labResult.setBounds(30, 380, 600, 25);
		this.add(labResult);
	}

	public abstract void search();

}
