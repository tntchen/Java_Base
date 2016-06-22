package cn.itcast.gjp.domain;

/**
 * 账务小分类
 * 
 * @author cuixifan
 * 
 */
public class Sort {
	private int sid;// id
	private String sname;// 分类名称
	private String parent;// 分类所属大分类名称
	private String sdesc;// 分类说明

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getSdesc() {
		return sdesc;
	}

	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}

	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sname=" + sname + ", parent=" + parent
				+ ", sdesc=" + sdesc + "]";
	}
}
