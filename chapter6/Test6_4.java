/**
类的简单应用
需求：
按照良好封装的要求，完成Test6_3的程序
*/

import java.util.Scanner;
class Test6_4{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

		Teacher [] teacher = new Teacher [2];			//创建长度为2的数组保存教师对象
		//循环录入2个老师的信息
		for(int i=0;i<teacher.length;i++){
			System.out.println("创建并输入第" + (i+1) + "个老师的基本信息：");
			teacher[i] = creatTeacher();	
		}

		Student [] student = new Student [4];			//创建长度为4的数组保存学生对象
		//循环录入4个学生的信息
		for(int j=0;j<student.length;j++){
			System.out.println("请输入第" + (j+1) + "个学生信息：");
			student[j] = creatStudent();	
		}
		
		//调用第一个老师讲课的方法
		teacher[0].teach();

		//依次调用所有学生听课的方法
		for(int j=0;j<student.length;j++){
			student[j].learn();
		}

		//依次调用所有学生做作业的方法
		for(int j=0;j<student.length;j++){
			String s = student[j].doHomework(20);
			System.out.println(s);
		}

		//依次调用老师批改所有学生的作业的方法
		for(int j=0;j<student.length;j++){
			teacher[1].checkHomework(student[j]);
		}
		
	}
	//创建老师对象并赋值
	public static Teacher creatTeacher(){
		Teacher tea = new Teacher();			////要添加对象属性，必须先new一个对象
	
		System.out.print("请输入老师姓名：");
		tea.setTeaName(sc.next()); 
		System.out.print("请输入老师专业：");
		tea.setProfession(sc.next());
		System.out.print("请输入老师所讲授的课程：");
		tea.setCourse(sc.next());
		System.out.print("请输入老师的教龄：");
		tea.setTeaYear(sc.nextInt());
		return tea;
	}


	//创建学生对象并赋值
	public static Student creatStudent(){
		Student stu = new Student();		//要添加对象属性，必须先new一个对象
	
		System.out.print("请输入学生姓名：");
		stu.setStuName(sc.next());
		System.out.print("请输入学生年龄：");
		stu.setStuAge(sc.nextInt());
		System.out.print("请输入学生性别（1代表男，2代表女）：");
		stu.setStuSex(sc.nextInt());
		System.out.print("请输入学生年级：");
		stu.setStuGrade(sc.nextInt());
		return stu;
	}
}


//学生类
class Student{
	private String stuName;		//学生姓名
	private int stuAge;			//学生年龄
	private int stuSex;			//学生性别
	private int stuGrade;		//学生年级
	
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
	public void setStuSex(int sex){
		this.stuSex = sex;
	}

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}


	//定义听课方法
	public void learn(){
		System.out.println(stuName + "正在认真听课！");
	}

	//定义写作业方法
	public String doHomework(int hour){
		return "现在是北京时间" + hour +"点，" + stuName + "正在写作业！";
	}
}


//教师类
class Teacher{
	private String teaName;			//教师姓名
	private String profession;		//教师专业
	private String course;			//教师教授课程
	private int teaYear;			//教师教龄

	public String getTeaName(){
		return this.teaName;
	}
	public void setTeaName(String name){
		this.teaName = name;
	}

	public String getProfession(){
		return this.profession;
	}
	public void setProfession(String pro){
		this.profession = pro;
	}

	public String getCourse(){
		return this.course;
	}
	public void setCourse(String cou){
		this.course = cou;
	}

	public int getTeaYear(){
		return this.teaYear;
	}
	public void setTeaYear(int year){
		this.teaYear = year;
	}

	//定义教师讲课的方法
	public void teach(){
		System.out.println(teaName + "老师正在幸苦讲" + profession + "课程！");
	}

	//定义教师检查作业的方法
	public void checkHomework(Student student){
		String s1 = student.getStuName();			//通过get方法获取stuName属性，并赋值给s1
		System.out.println("讲授：" + profession + "课程的老师：" + teaName + "已经批改完：" + s1 + "的作业！");
	}
}

