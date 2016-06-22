package cn.homework3;
/*
 * 测试验证码生成方法
 */
public class CodeText {
	public static void main(String[] args) {
		Code c = new Code();
		String code = c.getCode();
		System.out.println("生成的验证码为:" + code);
	}
}
