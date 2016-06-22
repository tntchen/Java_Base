package cn.itcast.gjp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JDialog;

import cn.itcast.gjp.service.LedgerService;
import cn.itcast.gjp.tools.JFreeChartUtils;
import cn.itcast.gjp.view.AbstractShapeDialog;
/**
 * 饼型图操作
 */
public class ShapeDialogController extends AbstractShapeDialog {
	private LedgerService ledgerService = new LedgerService();
	
	public ShapeDialogController(JDialog dialog) {
		super(dialog);
		initDialog();
	}
	/**
	 * 加载饼形图图片路径
	 */
	@Override
	public List<String> getImagePaths() {
		Map<String, Double> zcSumMoneyMap = ledgerService.querySumMoneyBySort("支出");
		double zcTotalMoney = ledgerService.queryTotalMoneyByParent("支出");
		String zcTitle = "支出占比图(" + zcTotalMoney + "元)(年)" ;
		String zcPath = "jfreechart_img/zc.jpg" ;
		JFreeChartUtils.pie(zcTitle, zcSumMoneyMap, zcTotalMoney, zcPath); 
		
		Map<String, Double> srSumMoneyMap = ledgerService.querySumMoneyBySort("收入") ;
		double srTotalMoney = ledgerService.queryTotalMoneyByParent("收入") ;
		String srTitle = "收入占比图(" + srTotalMoney + "元)(年)" ;
		String srPath = "jfreechart_img/sr.jpg"; 
		JFreeChartUtils.pie(srTitle, srSumMoneyMap, srTotalMoney, srPath) ;
		
		List<String> paths = new ArrayList<String>();
		paths.add(zcPath);
		paths.add(srPath);
		return paths; 

	}

}
