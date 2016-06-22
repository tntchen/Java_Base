package cn.itcast.gjp.controller;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import cn.itcast.gjp.domain.Sort;
import cn.itcast.gjp.service.SortService;
import cn.itcast.gjp.view.AbstractOperationSortDialog;
/**
 * 添加分类对话框
 */
public class AddSortDialogController extends AbstractOperationSortDialog {

	private SortService sortService = new SortService();
	public AddSortDialogController(JDialog dialog) {
		super(dialog);
		/*
		 * 1.设置窗口标题
		 * 2.设置标题标签
		 */
		this.setTitle("添加分类");
		this.titleLabel.setText("添加分类");
	}
	/**
	 * 确认按钮
	 */
	@Override
	public void confirm() {
		/**
		 * 1获取表单数据；
		 * 2对表单数据进行校验；
		 * 3把表单数据封装到Sort对象中；
		 * 4调用sortService#addSort()方法完成添加操作；
		 * 5关闭对话框。
		 */
		String parent = this.parentBox.getSelectedItem().toString();
		String sname = this.snameTxt.getText();
		String sdesc = this.sdescArea.getText();
		
		if (parent.equals("-请选择-") || sname.isEmpty() ||sdesc.isEmpty()) {
			JOptionPane.showMessageDialog(this, "请认真填写各项数据!");
			return;
		}
		
		Sort sort = new Sort();
		sort.setParent(parent);
		sort.setSname(sname);
		sort.setSdesc(sdesc);
		
		sortService.addSort(sort);
		
		this.dispose();
		JOptionPane.showMessageDialog(this, "添加成功!");
	}

}
