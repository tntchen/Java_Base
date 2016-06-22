package cn.itheima04_register;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.text.DateFormatter;

public class RegistFrameController extends AbstractRegistFrame {
	/*
	 * 1.创建一个ArrayList<User>对象用来存储用户信息
	 * 2.判断输入的用户名和一存储的用户信息是否一致
	 * 		2.1循环集合,得到每一个User对象
	 * 		2.2使用当前的用户名与输入的用户名比较
	 * 			相同:提示,用户名已存在,结束方法
	 * 		2.3遍历集合结束后,也没有相同的用户名,该用户名已注册
	 * 			相同:完成用户注册功能,成功
	 * 			不同:弹框,提示二次密码输入不一致,请重新输入,结束方法
	 */
	public static ArrayList<User> userList = new ArrayList<>();
	static {
		User u1 = new User("刘德华","123456",new Date());
		User u2 = new User("张学友","123",new Date());
		userList.add(u1);
		userList.add(u2);
	}
	@Override
	public void regist(String userName, String password, String rePassword, String birthday) {
		for (int i = 0; i < userList.size(); i++) {
			//循环集合,得到每一个User对象
			User u = userList.get(i);
			//使用当前的用户名与输入的用户名比较
			if (userName.equals(u.getUserName())) {
				//相同:提示,用户名已存在,结束方法
				JOptionPane.showMessageDialog(this, "用户名已存在");
				return;
			}
		}
		//2.3遍历集合结束后,也没有相同的用户名,该用户名已注册
		if (password.equals(rePassword)) {
			//相同:完成用户注册功能,成功
			//吧字符日期转换成日期对象
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			try {
				date = df.parse(birthday);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//创建User
			User user = new User(userName, password, date);
			//添加User对象到集合
			userList.add(user);
			JOptionPane.showMessageDialog(this, "注册成功");
			System.out.println(userList);
		} else {
			JOptionPane.showMessageDialog(this, "二次密码输入不一致，请重新输入");
		}
	}
	
	
}
