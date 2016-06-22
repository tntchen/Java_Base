package cn.itheima05_RunTimeException;

class NoAgeException extends RuntimeException {
	//之所以定义构造函数,是看到Java中的异常描述类中有提供对问题对象的初始化方法
	public NoAgeException() {
		super();
	}

	public NoAgeException(String message) {
		super(message);
		// 如果自定义异常需要异常信息,可以通过调用父类带有字符参数的构造函数即可
	}	
}
