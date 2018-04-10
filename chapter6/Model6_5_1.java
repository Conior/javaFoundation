/**
构造方法
*/
public class Model6_5_1{
	public static void main(String[] args){
		//使用带参的构造方法，
		Student1 WangYun = new Student1("王云",22,1,4);
		WangYun.learn();
		String s1 = WangYun.doHomework(22);
		System.out.println(s1);
	}
}

class Student1{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//属性封装
	public String getStuName(){
		return this.stuName;
	}
	public void setStuName(String name){
		this.stuName = name;
	}

	public int getStuAge(){
		return this.stuAge;
	}
	public void setStuAge(int age){
		this.stuAge = age;
	}

	public int getStuSex(){
		return this.stuSex;
	}
	//因为想要设定性别不可修改，所以不设置性别的setter方法

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//构造方法，用户初始化对象的成员变量
	public Student1(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//学习方法
	public void learn(){
		System.out.println(stuName + "正在认真学习！");
	}

	public String doHomework(int hour){
		return "现在是北京时间" + hour + "," + stuName + "正在写作业！";
	}
}