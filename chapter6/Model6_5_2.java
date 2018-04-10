/**
构造方法的使用
*/

public class Model6_5_2{
	public static void main(String[] args){
		//使用不同参数的构造方法创建wangYun，liuJT，nanTH三个学生对象
		Student2 wangYun = new Student2("王云",22,1,4);
		Student2 liuJT = new Student2("刘静涛",21,2);
		Student2 nanTH = new Student2("南天华",1);

		wangYun.learn();
		String s1 = wangYun.doHomework(22);
		System.out.println(s1);

		liuJT.learn();
		System.out.println(liuJT.getStuName() + "在读大学" + liuJT.getStuGrade() + "年级");

		System.out.println(nanTH.doHomework(21));
	}
}

class Student2{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//封装
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
	//不允许修改性别，所以取消性别的setter方法

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//构造方法,用户初始化对象属性
	public Student2(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//构造方法，用户初始化对象属性（不含年级参数，年级默认值为4）
	public Student2(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}

	//构造方法，用户初始化对象属性（不带年龄、年级参数，年龄默认22，年级默认4）
	public Student2(String name,int sex){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = 4;
	}

	//学习方法
	public void learn(){
		System.out.println(stuName + "正在认真学习！");
	}

	//写作业方法
	public String doHomework(int hour){
		return "现在是北京时间" + hour + "," + stuName + "正在写作业！";
	}
}
