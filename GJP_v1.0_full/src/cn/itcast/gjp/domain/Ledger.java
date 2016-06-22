package cn.itcast.gjp.domain;


/**
 * 账务类
 * 
 * @author cuixifan
 * 
 */
public class Ledger {
	private int lid;// id
	private String parent;// 所属大分类
	private int sid;// 所属小分类id
	private String sname;// 分类名称
	private String account;// 账户名称
	private double money;// 金额
	private String createtime;// 创建时间
	private String ldesc;// 说明

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getLdesc() {
		return ldesc;
	}

	public void setLdesc(String ldesc) {
		this.ldesc = ldesc;
	}

	@Override
	public String toString() {
		return "Ledger [lid=" + lid + ", parent=" + parent + ", sid=" + sid
				+ ", sname=" + sname + ", account=" + account + ", money="
				+ money + ", createtime=" + createtime + ", ldesc=" + ldesc
				+ "]";
	}
}
