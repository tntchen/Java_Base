package cn.homework3;

//定义一个人的父类,属性包括姓名,工号,工作内容
abstract class Person {
	private String name;//姓名
	private int id;//工号
	private String salary;//薪水
	private String jobcontent;//工作内容
	//构造方法
	public Person() {
		super();
	}
	public Person(String name, int id, String salary, String jobcontent) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.jobcontent = jobcontent;
	}
	//set/get方法
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getSalary() {
		return salary;
	}
	public String getJobcontent() {
		return jobcontent;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setJobcontent(String jobcontent) {
		this.jobcontent = jobcontent;
	}	
}

//定义程序员子类
class Programmer extends Person {
	//构造方法
	public Programmer() {
		super();
	}
	public Programmer(String name, int id, String salary, String jobcontent) {
		super(name, id, salary, jobcontent);
	}
	//打印程序员的相关信息
	public void printInfo() {
		System.out.print("姓名:" + getName());
		System.out.print(",工号:" + getId());
		System.out.print(",薪水:" + getSalary());
		System.out.println(",工作内容:" + getJobcontent());
	}	
}

//定义项目经理子类
class Manager extends Person {
	private int Bonus;//定义奖金
	//set/get
	public int getBonus() {
		return Bonus;
	}
	public void setBonus(int bonus) {
		Bonus = bonus;
	}
	//构造方法
	public Manager() {
		super();
	}
	public Manager(String name, int id, String salary, String jobcontent,int bonus) {
		super(name, id, salary, jobcontent);
		this.setBonus(bonus);
	}
	//打印项目经理相关信息
	public void printInfo() {
		System.out.print("姓名:" + getName());
		System.out.print(",工号:" + getId());
		System.out.print(",薪水:" + getSalary());
		System.out.print(",工作内容:" + getJobcontent());
		System.out.println(",奖金:" + getBonus());
	}	
}