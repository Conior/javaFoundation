/**
封装
*/
public class Model6_2_4{
	public static class Student{		//此处必须用static修饰，否则在主程序中无法调用其getter方法和setter方法
		private String stuName;			//学生姓名
		private int stuAge;				//学生年龄
		private int stuSex;				//学生性别
		private int stuGrade;			//学生年级

		//共有方法获取学生属性————stuName
		public String getStuName(){
			return this.stuName;		//返回这个类的私有属性————stuName
		}
		//共有方法获取学生属性————stuAge
		public int getStuAge(){
			return this.stuAge;			//返回这个类的私有属性————stuAge
		}
		//共有方法获取学生属性————stuSex
		public int getStuSex(){
			return this.stuSex;			//返回这个类的私有属性————stuSex
		}
		//共有方法获取学生属性————stuGrade
		public int getStuGrade(){
			return this.stuGrade;		//返回这个类的私有属性————stuGrade
		}
		//共有方法设置学生属性————stuName
		public void setStuName(String name){
			this.stuName = name;		//参数设置为学生属性—————stuName
		}
		//共有方法设置学生属性————stuAge
		public void setStuAge(int age){
			this.stuAge = age;			//参数设置为学生属性—————stuAge
		}
		//共有方法设置学生属性————stuSex
		public void setStuSex(int sex){
			this.stuSex = sex;			//参数设置为学生属性—————stuSex
		}
		//共有方法设置学生属性————stuGrade
		public void setStuGrade(int grade){
			this.stuGrade = grade;		//参数设置为学生属性—————stuGrade
		}

		//定义听课的方法
		public void learn(){
			System.out.println(stuName + "正在认证听讲！");
		}

		//定义写作业的方法
		public String doHomework(int hour){
			return "现在是北京时间" + hour + "," + stuName + "正在学作业！";
		}
	}


	public static void main(String[] args){
		Student stu = new Student();	//对Student类实例化一个stu对象
		stu.setStuName("王云");			//调用setter方法给对象stu赋值
		stu.setStuAge(22);
		stu.setStuSex(1);
		stu.setStuGrade(4);
		stu.learn();					//调用learn()方法
		String s1 = stu.doHomework(22);
		System.out.println(s1);
	}
}
