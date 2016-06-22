package cn.itheima06_RunTimeException;
/*
 * 描述电脑对象
 */
class NoteBook {
	private int state = 2;
	public void run() throws LanPingException,MaoYanException {
		System.out.println("笔记本电脑运行");
		if (state == 1) {
			throw new LanPingException("电脑蓝屏了");
		}
		if (state == 2) {
			throw new MaoYanException("电脑冒烟了");
		}
	}
	public void reset() {
		state = 0;
		System.out.println("电脑重启");
	}
}
