/**
方法重载
*/

class Student4{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//对私有属性封装
	public String getStuName(){
		return this.stuName;
	}
	public void setStuName(String name){
		this.stuName = name;
	}

	public int getStuSex(){
		return this.stuSex;
	}

	public int getStuAge(){
		return this.stuAge;
	}
	public void setStuAge(int age){
		this.stuAge = age;
	}

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//构造方法，用户初始化对象的属性
	public Student4(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//构造方法，用户初始化对象的属性
	public Student4(String name,int sex,int grade){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//无参数的构造方法
	public Student4(){
	
	}

	//方法重载，重载learn()方法
	//传入name,age,sex,grade值输出结果
	public void learn(String name,int age,int sex,int grade){
		String str = (sex==1)?"男":"女";
		System.out.println("读大" + grade + str + "同学" + name + "正在学习！");
	}

	//方法重载，重载learn()方法
	//传入name,age,sex值,年级默认为4，输出结果
	public void learn(String name,int age,int sex){
		learn(name,age,sex,4);
	}

	//方法重载，重载learn()方法
	//传入name，sex值，年龄默认为22，年级默认4，输出结果
	public void learn(String name,int sex){
		learn(name,22,sex,4);
	}
	
	//方法重载，重载learn()方法
	//无参方法重载，使用成员变量作为其参数
	public void learn(){
		learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
	}
}

public class Model6_8_1{
	public static void main(String[] args){
		Student4 stu = new Student4("王云",22,1,3);
		stu.learn("雷静",21,2,3);
		stu.learn("陈思",23,2);
		stu.learn("张华",1);
		stu.learn();

	}
}