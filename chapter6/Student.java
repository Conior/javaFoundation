/**
类的定义


注意：这个类因为没有mian()方法，所以只能编译，不能运行
*/

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