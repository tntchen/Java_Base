package cn.itcast.gjp.controller;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import cn.itcast.gjp.domain.Sort;
import cn.itcast.gjp.service.LedgerService;
import cn.itcast.gjp.service.SortService;
import cn.itcast.gjp.view.AbstractSortMngDialog;
/**
 * 分类管理界面控制类
 */
public class SortMngDialogController extends AbstractSortMngDialog {
	
	private SortService sortService = new SortService();
	private LedgerService ledgerService = new LedgerService();
	
	public SortMngDialogController(JFrame frame) {
		super(frame);
		/**
		 * 1.调用sortService#querySortAll() 获取分类数据
		 * 2.显示分类数据到表格中 setTableModel(List<Sort>)
		 */
		List sortList = sortService.querySortAll();
		setTableModel(sortList);
	}
	/**
	 * 添加按钮
	 */
	@Override
	public void addSort() {
		new AddSortDialogController(this).setVisible(true);
		
		List sortList = sortService.querySortAll();
		this.setTableModel(sortList);
	}
	/**
	 * 编辑按钮
	 */
	@Override
	public void editSort() {
		//获取用户选择表格行号
		int row = this .sortDataTable.getSelectedRow();
		//判断行号是否小于0,小于0说明用户未选择
		if (row < 0) {
			JOptionPane.showMessageDialog(this, "请选择要编辑的分类!");
			return;
		}
		//通过表格行号获取表格中该行数据封装到Sort对象中
		Sort sort = this.getSortByTableRow(row);
		//判断获取的Sort对象是否为空
		if (sort == null) {
			JOptionPane.showMessageDialog(this, "您选择的是空行");
			return;
		}
		
		new EditSortDialogController(this,sort).setVisible(true);
		
		List sortList = sortService.querySortAll();
		this.setTableModel(sortList);
	}
	/**
	 * 删除按钮
	 */
	@Override
	public void deleteSort() {
		int row = this.sortDataTable.getSelectedRow() ;
		if (row < 0) {
			JOptionPane.showMessageDialog(this, "请选择要删除的分类!");
			return;
		} 
		Sort sort = this.getSortByTableRow(row);
		if (sort == null) {
			JOptionPane.showMessageDialog(this, "您选择的是空行");
			return;
		}
		
		int m = JOptionPane.showConfirmDialog(this, "您是否确定删除该记录");
		if (m == JOptionPane.OK_OPTION) {
			int cnt = ledgerService.getLedgerCountBySid(sort.getSid()); 
			if(cnt > 0 ) {
				JOptionPane.showMessageDialog(this, "该分类下还存在账务记录，不能删除！");
				return;
			}
			sortService.deleteSort(sort);
			List sortList = sortService.querySortAll();
			this.setTableModel(sortList);
		}		
	}
}
