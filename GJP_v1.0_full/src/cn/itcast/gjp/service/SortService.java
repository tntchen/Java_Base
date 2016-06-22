package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.SortDao;
import cn.itcast.gjp.domain.Sort;

/**
 * 财务分类业务层类
 */
public class SortService {
	private SortDao sortDao = new SortDao();
	/**
	 * 查询所有分类数据
	 */
	public List querySortAll() {
		//调用方法
		return sortDao.querySortAll();
	}
	/**
	 * 添加分类
	 */
	public void addSort(Sort sort) {
		sortDao.addSort(sort);
	}
	/**
	 * 编辑分类
	 */
	public void editSort(Sort sort) {
		sortDao.editSort(sort);
	}
	/**
	 * 删除分类
	 */
	public void deleteSort(Sort sort) {
		sortDao.deleteSort(sort);
	}
	/**
	 * 查询所有分类名称
	 */
	public List<Object> querySortNameAll() {
		return sortDao.querySortNameAll();
	}
	/**
	 * 查询指定父类下的子分类名称
	 */
	public List<Object> querySortNameByParent(String parent) {
		return sortDao.querySortNameByParent(parent);
	}
	/**
	 * 获取指定分类名称对应的分类id
	 */
	public int getSidBySname(String sname) {
		return sortDao.getSidBySname(sname);
	}
	/**
	 * 获取指定分类ID所对应的分类名称
	 */
	public String getSnameBySid(int sid) {
		return sortDao.getSnameBySid(sid);
	}
}
