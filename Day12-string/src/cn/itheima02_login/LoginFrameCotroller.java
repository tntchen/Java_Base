package cn.itheima02_login;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

/*
 * 事件监听功能的实现类
 */
public class LoginFrameCotroller extends AbstractLoginFrame {
	/*
	 * 登陆方法
	 * 1.创建一个集合用来存放用户信息,添加用户到集合
	 * 2.判断验证码输入是否与给定的一致
	 * 		相同:执行下一步
	 * 		不同:弹出提示验证码输入错误
	 * 3.判断输入的用户信息与储存的是否一致
	 * 
	 */
	
	// 1.创建一个集合用来存放用户信息,添加用户到集合
	public static ArrayList<User> userList = new ArrayList<User>();
	static {
		User u1 = new User("Bob","123456");
		User u2 = new User("Tom","654321");
		userList.add(u1);
		userList.add(u2);
	}
	
	@Override
	public void login(String userName, String passWd, String codesInput, String codesLabel) {
		//2.判断验证码输入是否与给定的一致
		if (codesInput.equals(codesLabel)) {
			//相同,与每一个User对象的信息进行用户名密码比较
			for (int i = 0; i < userList.size(); i++) {
				//得到每一个user对象
				User user = userList.get(i);
				//比较
				if (userName.equals(user.getUserName()) && passWd.equals(user.getPassword())) {
					JOptionPane.showMessageDialog(this, "登陆成功");
					return;
				}
			}
			JOptionPane.showMessageDialog(this, "用户名或密码不正确");
		} else {
			//不同
			JOptionPane.showMessageDialog(this, "验证码输入有误");
		}
	}
	
	/*
	 * 返回一个随机生成的验证码方法:
	 * 1.定义一个字符串,存储验证码
	 * 2.随机生成四个字符添加到字符串中
	 * 2.1明确生成验证码需要使用到的字符(A-Z,a-z,0-9)
	 * 2.2随机的在上述范围内选取四个字符,把每个字符添加到字符串中
	 */
	@Override
	public String getCodes() {
		// 1.定义一个字符串,存储验证码
		String code = "";
		//2.随机生成四个字符添加到字符串中
		//2.1明确生成验证码需要使用到的字符(A-Z,a-z,0-9)
		char[] chs = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
				,'p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4'
				,'5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K'
				,'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		for (int i = 0; i < 4; i++) {
			//获取数组中随机字符
			Random r = new Random();
			//获取到随机字符的位置
			int index = r.nextInt(chs.length);
			//获取随机字符
			char ch = chs[index];
			//把每个字符添加到存储验证码的字符串
			code += ch;
		}
		return code;
	}

}
