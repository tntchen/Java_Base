package cn.itheima03_JavaBean;

import java.io.Serializable;

/*
 * 分类Javabean
 * 作用:用啦死实现Java与数据库表category对应
 */
public class Category implements Serializable {
	
	private String cid;
	private String cname;
	public Category() {
		super();
		
	}
	public Category(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
