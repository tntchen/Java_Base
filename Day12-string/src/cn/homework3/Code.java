package cn.homework3;

import java.util.Random;

public class Code {
	public String getCode() {
		//定义一个字符串,存储验证码
		String code = "";
		//随机生成四个字符添加到字符串中
		//明确生成验证码需要使用到的字符(A-Z,a-z,0-9)
		char[] chs = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
				,'p','q','r','s','t','u','v','w','x','y','z','0','A','B','C','D',
				'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T',
				'U','V','W','X','Y','Z'};
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
