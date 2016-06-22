package cn.itheima02_login;

import java.util.Date;

/*
 * 用户
 */
public class User {

	private String userName; // 用户名
	private String password; // 密码

	public User() {
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
