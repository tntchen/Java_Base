package cn.itcast.gjp.controller;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import cn.itcast.gjp.domain.Sort;
import cn.itcast.gjp.service.SortService;
import cn.itcast.gjp.view.AbstractOperationSortDialog;
/**
 * 编辑分类对话框
 */
public class EditSortDialogController extends AbstractOperationSortDialog {
	private Sort sort;
	private SortService sortService = new SortService();
	
	public EditSortDialogController(JDialog dialog,Sort sort) {
		super(dialog);
		this.sort = sort;
		
		//标题
		this.setTitle("编辑分类");
		this.titleLabel.setText("编辑分类");
		//把Sort的属性值显示在EditSortController表单组件上
		this.parentBox.setSelectedItem(sort.getParent());
		this.snameTxt.setText(sort.getSname());
		this.sdescArea.setText(sdescArea.getText());
	}

	@Override
	public void confirm() {
		//获取用户表单数据
		String parent = this.parentBox.getSelectedItem().toString();
		String sname = this.snameTxt.getText();
		String sdesc = this.sdescArea.getText();
		//对数据进行校验
		if (parent.equals("-请选择-") || sname.isEmpty() || sdesc.isEmpty()) {
			JOptionPane.showMessageDialog(this, "请认真填写各项数据!");
			return;
		}
		sort.setParent(parent);
		sort.setSname(sname);
		sort.setSdesc(sdesc);
		
		sortService.editSort(sort);
		
		this.dispose();
		JOptionPane.showMessageDialog(this, "编辑成功!");
	}

}
