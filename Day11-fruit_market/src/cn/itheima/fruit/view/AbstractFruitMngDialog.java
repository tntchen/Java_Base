package cn.itheima.fruit.view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import cn.itheima.fruit.other.FruitItem;

/*
 * 管理员界面
 */
public abstract class AbstractFruitMngDialog extends JDialog {

	/*
	 * 组件
	 */
	// 定义界面使用到的组件作为成员变量
	private JLabel tableLabel = new JLabel("水果列表");// 水果列表标题
	private JScrollPane tablePane = new JScrollPane();// 滚动视口
	protected JTable table = new JTable(); // 水果列表

	private JLabel numberLabel = new JLabel("    水果编号");// 编号标题
	private JLabel nameLabel = new JLabel("    水果名称");// 名称标题
	private JLabel priceLabel = new JLabel("    水果单价");// 单价标题
	private JLabel unitLabel = new JLabel("    计价单位");// 计价单位标题
	// 添加功能组件
	protected JTextField addNumberText = new JTextField(6);// 添加编号文本框
	protected JTextField addNameText = new JTextField(6);// 添加名称文本框
	protected JTextField addPriceText = new JTextField(6);// 添加单价文本框
	protected JTextField addUnitText = new JTextField(6);// 添加计价单位文本框
	private JButton addBtn = new JButton("添加水果");// 添加按钮
	// 修改功能组件
	protected JTextField updateNumberText = new JTextField(6);// 修改编号文本框
	protected JTextField updateNameText = new JTextField(6);// 修改名称文本框
	protected JTextField updatePriceText = new JTextField(6);// 修改单价文本框
	protected JTextField updateUnitText = new JTextField(6);// 修改计价单位文本框
	private JButton updateBtn = new JButton("修改水果");// 修改按钮
	// 删除功能组件
	protected JTextField delNumberText = new JTextField(6);// 添加编号文本
	private JButton delBtn = new JButton("删除水果");// 删除按钮

	// 构造方法
	public AbstractFruitMngDialog(Frame owner) {
		this.init();// 初始化操作
		this.addComponent();// 添加组件
		this.addListener();// 添加监听器
	}

	// 初始化操作
	private void init() {
		this.setTitle("超市货物管理!");// 标题
		this.setSize(600, 400);// 窗体大小与位置
		GUITools.center(this);// 设置窗口在屏幕上的位置
		this.setResizable(false);// 窗体大小固定
	}

	// 添加组件
	private void addComponent() {

		// 取消布局
		this.setLayout(null);

		// 表格标题
		tableLabel.setBounds(265, 20, 70, 25);
		this.add(tableLabel);

		// 表格
		table.getTableHeader().setReorderingAllowed(false); // 列不能移动
		table.getTableHeader().setResizingAllowed(false); // 不可拉动表格
		table.setEnabled(false); // 不可更改数据
		tablePane.setBounds(50, 50, 500, 200);
		tablePane.setViewportView(table); // 视口装入表格
		this.add(tablePane);

		// 字段标题
		numberLabel.setBounds(50, 250, 70, 25);
		nameLabel.setBounds(150, 250, 70, 25);
		priceLabel.setBounds(250, 250, 70, 25);
		unitLabel.setBounds(350, 250, 70, 25);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(priceLabel);
		this.add(unitLabel);

		// 增加组件
		addNumberText.setBounds(50, 280, 80, 25);
		addNameText.setBounds(150, 280, 80, 25);
		addPriceText.setBounds(250, 280, 80, 25);
		addUnitText.setBounds(350, 280, 80, 25);
		this.add(addNumberText);
		this.add(addNameText);
		this.add(addPriceText);
		this.add(addUnitText);
		addBtn.setBounds(460, 280, 90, 25);
		this.add(addBtn);

		// 修改组件
		updateNumberText.setBounds(50, 310, 80, 25);
		updateNameText.setBounds(150, 310, 80, 25);
		updatePriceText.setBounds(250, 310, 80, 25);
		updateUnitText.setBounds(350, 310, 80, 25);
		this.add(updateNumberText);
		this.add(updateNameText);
		this.add(updatePriceText);
		this.add(updateUnitText);
		updateBtn.setBounds(460, 310, 90, 25);
		this.add(updateBtn);

		// 删除组件
		delNumberText.setBounds(50, 340, 80, 25);
		this.add(delNumberText);
		delBtn.setBounds(460, 340, 90, 25);
		this.add(delBtn);
	}

	// 添加监听器
	private void addListener() {

		// 添加按钮监听
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取用户数据
				String addNumber = addNumberText.getText();
				String addName = addNameText.getText();
				String addPrice = addPriceText.getText();
				String addUnit = addUnitText.getText();
				// 调用添加方法
				addFruitItem(addNumber, addName, addPrice, addUnit);
			}
		});
		// 修改按钮监听
		updateBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取用户数据
				String updateNumber = updateNumberText.getText();
				String updateName = updateNameText.getText();
				String updatePrice = updatePriceText.getText();
				String updateUnit = updateUnitText.getText();
				// 调用修改方法
				updateFruitItem(updateNumber, updateName, updatePrice, updateUnit);
			}
		});
		// 删除按钮监听
		delBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取用户数据
				String delNumber = delNumberText.getText();
				// 调用删除方法
				deleteFruitItem(delNumber);
			}
		});
	}

	public void setTableData(ArrayList<FruitItem> list) {
		// 定义表格头
		String[] thead = { "水果编号", "水果名称", "水果单价", "计价单位" };
		// 根据FruitItem的model与集合数据定义JTable的数据二维数组
		String[][] tbody = new String[list.size()][4];
		// 依次获取集合中每一个水果
		for (int i = 0; i < list.size(); i++) {
			// 获取当前遍历到的水果
			FruitItem fruitItem = list.get(i);
			// 依次拿出该水果的各维度信息
			tbody[i][0] = fruitItem.getNumber();
			tbody[i][1] = fruitItem.getName();
			tbody[i][2] = fruitItem.getPrice() + "";
			tbody[i][3] = fruitItem.getUnit();
		}
		// 为表格赋值
		TableModel data = new DefaultTableModel(tbody, thead);
		table.setModel(data);
	}

	// 抽象添加方法，用于完成添加逻辑
	public abstract void addFruitItem(String addNumber, String addName, String addPrice, String addUnit);

	// 抽象修改方法，用于完成修改逻辑
	public abstract void updateFruitItem(String updateNumber, String updateName, String updatePrice, String updateUnit);

	// 抽象删除方法，用于完成删除逻辑
	public abstract void deleteFruitItem(String delNumber);
}
