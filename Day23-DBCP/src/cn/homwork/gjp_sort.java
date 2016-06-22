package cn.homwork;

import java.io.Serializable;

/*
 * gjp_sort表的javabean
 */
public class gjp_sort implements Serializable {
	
	private String sid;
	private String sname;
	private String parent;
	private String sdesc;
	
	public gjp_sort() {
		super();
		
	}
	public gjp_sort(String sid, String sname, String parent, String sdesc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.parent = parent;
		this.sdesc = sdesc;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
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
	@Override
	public String toString() {
		return "gjp_sort [sid=" + sid + ", sname=" + sname + ", parent=" + parent + ", sdesc=" + sdesc + "]";
	}
	public String getSdesc() {
		return sdesc;
	}
	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}
	
	
}
