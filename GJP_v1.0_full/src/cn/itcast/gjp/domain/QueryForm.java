package cn.itcast.gjp.domain;

/**
 * 查询账务条件类
 * 
 * @author cuixifan
 * 
 */
public class QueryForm {
	private String begin;// 开始时间
	private String end;// 结束时间
	private String parent;//父分类
	private String sname;// 子分类

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
