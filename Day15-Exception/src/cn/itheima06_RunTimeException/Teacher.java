package cn.itheima06_RunTimeException;
/*
 * 描述老师
 */
class Teacher {
	private String name;
	private NoteBook book;
	public Teacher(String name) {
		super();
		this.name = name;
		book = new NoteBook();
	}
	//讲课
	public void prelect() throws NoPlanException {
		/*
		 * 调用到了声明异常的方法,在这里是捕获?还是声明?
		 * 有具体的捕获处理方式?有,那就捕获,没有那么声明
		 * 可以处理重启就可以,重启是电脑功能
		 */
		try {
			book.run();
		} catch (LanPingException e) {
			System.out.println(e.toString());//异常的名称+异常的信息
			e.printStackTrace();
			book.reset();
		} catch (MaoYanException e) {
			System.out.println(e.toString());
			test();
			//冒烟问题没解决,继续声明throws出去
			//throw e;
			throw new NoPlanException(e.getMessage()+",课时停止");//异常转换
		}
		System.out.println(name+"...讲课");
	}
	//留练习 
	public void test() {
		System.out.println("做练习");
	}
}
