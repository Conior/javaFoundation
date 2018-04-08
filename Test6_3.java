/**
类的简单应用
需求：
1、在程序开始运行时，需要在控制台依次输入所有老师和学生的基本信息
2、在控制台输入完毕这些老师和学生的基本信息后，调用第一个老师讲课的方法，在控制台输出“***（该老师的姓名）老师正在幸苦讲***（该老师所受课程）课程”的信息
3、依次调用所有学生听课的方法，在控制台输出“***（该学生姓名）学生正在认真听课！”的信息
4、依次调用所有学生写作业的方法，在控制台输出“现在是北京时间：***（时间）点，***（该学生姓名）正在写作业！”的信息
5、调用老师批改作业的方法，依次批改所有学生的作业，在控制台输出“讲授***（该老师所受课程）课程的老师***（该老师姓名）已经批改完毕：***（该学生姓名）的作业！”
*/

import java.util.Scanner;
class Test6_3{
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
		tea.teaName = sc.next(); 
		System.out.print("请输入老师专业：");
		tea.profession = sc.next();
		System.out.print("请输入老师所讲授的课程：");
		tea.course = sc.next();
		System.out.print("请输入老师的教龄：");
		tea.teaYear = sc.nextInt();
		return tea;
	}


	//创建学生对象并赋值
	public static Student creatStudent(){
		Student stu = new Student();		//要添加对象属性，必须先new一个对象
	
		System.out.print("请输入学生姓名：");
		stu.stuName = sc.next();
		System.out.print("请输入学生年龄：");
		stu.stuAge = sc.nextInt();
		System.out.print("请输入学生性别（1代表男，2代表女）：");
		stu.stuSex = sc.nextInt();
		System.out.print("请输入学生年级：");
		stu.stuGrade = sc.nextInt();
		return stu;
	}
}


//学生类
class Student{
	String stuName;		//学生姓名
	int stuAge;			//学生年龄
	int stuSex;			//学生性别
	int stuGrade;		//学生年级
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
	String teaName;			//教师姓名
	String profession;		//教师专业
	String course;			//教师教授课程
	int teaYear;			//教师教龄
	//定义教师讲课的方法
	public void teach(){
		System.out.println(teaName + "老师正在幸苦讲" + profession + "课程！");
	}

	//定义教师检查作业的方法
	public void checkHomework(Student student){
		System.out.println("讲授：" + profession + "课程的老师：" + teaName + "已经批改完：" + student.stuName + "的作业！");
	}
}

