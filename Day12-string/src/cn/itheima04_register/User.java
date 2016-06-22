package cn.itheima04_register;

import java.util.Date;

/*
 * 用户
 */
public class User {

	private String userName; // 用户名
	private String password; // 密码
	private Date birthday; // 生日

	public User() {
	}

	public User(String userName, String password, Date birthday) {
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", birthday=" + birthday + "]";
	}
	
}
