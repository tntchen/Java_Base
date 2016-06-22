package cn.itheima.fruit.other;

import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import cn.itheima.fruit.view.AbstractFruitMngDialog;

public class FruitMngDialogController extends AbstractFruitMngDialog {

	public static ArrayList<FruitItem> dataList = new ArrayList<FruitItem>();

	static {
		// 录入信息
		FruitItem item1 = new FruitItem("9527", "山东大枣", 28, "斤");
		FruitItem item2 = new FruitItem("8888", "山东苹果", 18, "斤");
		FruitItem item3 = new FruitItem("6666", "山东凤梨", 6.8, "个");
		// 将水果信息添加到datalist
		dataList.add(item1);
		dataList.add(item2);
		dataList.add(item3);
	}

	// 构造方法
	public FruitMngDialogController(Frame owner) {
		super(owner);
		setTableData(dataList);// 调用setTableData方法将数据放入表格内
	}

	@Override
	public void addFruitItem(String addNumber, String addName, String addPrice, String addUnit) {
		// 点击添加水果按钮时调用本方法
		// 遍历所有数据与新添加的数据编号比对
		for (int i = 0; i < dataList.size(); i++) {
			FruitItem item = dataList.get(i);
			// 获取水果编号
			String number = item.getNumber();
			// 基本数据类型进行值比较使用==,引用数据类型进行值比较使用equals();
			if (number.equals(addNumber)) {
				// 如果相同,弹出错误提示,直接结束方法
				JOptionPane.showMessageDialog(this, "新水果编号已存在,不能实现新水果的添加");
				return;
			}
		}
		// 说明当前新水果编号在集合不重复,可以添加新水果
		// 封装新水果信息(需要把水果价格从字符串类型转换到double数据类型)Double.prarseDouble()
		if (addPrice.equals("")) {
			addPrice = "0.0";
		}
		FruitItem newItem = new FruitItem(addNumber, addName, Double.parseDouble(addPrice), addUnit);
		// 新水果添加到集合
		dataList.add(newItem);
		// 更新表格数据
		setTableData(dataList);
	}

	@Override
	public void updateFruitItem(String updateNumber, String updateName, String updatePrice, String updateUnit) {
		// 修改水果时的方法
		for (int i = 0; i < dataList.size(); i++) {
			FruitItem item = dataList.get(i);
			// 如果存在相同编号数据则可以更新
			if (updateNumber.equals(item.getNumber())) {
				if (updatePrice.equals("")) {
					updatePrice = "0.0";
				}
				//将数据封装
				FruitItem newItem = new FruitItem(updateNumber, updateName, Double.parseDouble(updatePrice), updateUnit);
				//新水果添加到集合
				dataList.set(i, newItem);
				//更新表格数据
				setTableData(dataList);
				return;
			}
		}
		//如果不存在相同编号数据,则返回弹窗错误提示
		JOptionPane.showMessageDialog(this, "没有这个编号的水果,请检查数据!");
	}

	@Override
	public void deleteFruitItem(String delNumber) {
		// 删除水果时调用的方法
		for (int i = 0; i < dataList.size(); i++) {
			FruitItem item = dataList.get(i);
			//如果编号相同就可以删除
			if (delNumber.equals(item.getNumber())) {
				dataList.remove(item);
				setTableData(dataList);
				return;
			}
		}
		//不存在数据报错
		JOptionPane.showMessageDialog(this, "没有这个编号的水果,请检查数据");
	}

}
