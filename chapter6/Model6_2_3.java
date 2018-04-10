/**
类的创建和使用
*/
class Model6_2_3{
	public static void main(String[] args){
		Student WangYun = new Student();
		//未赋值时候
		System.out.println("未赋值前的学生姓名为：" + WangYun.stuName);
		System.out.println("未赋值前的学生年龄为：" + WangYun.stuAge);
		System.out.println("未赋值前的学生性别为：" + WangYun.stuSex);
		System.out.println("未赋值前的学生年级为：" + WangYun.stuGrade);

		//给对象的属性赋值
		WangYun.stuName = "王云";
		WangYun.stuAge = 22;
		WangYun.stuSex = 1;
		WangYun.stuGrade = 4;
		System.out.println("赋值后的学生姓名为：" + WangYun.stuName);
		System.out.println("赋值后的学生年龄为：" + WangYun.stuAge);
		System.out.println("赋值后的学生性别为：" + WangYun.stuSex);
		System.out.println("赋值后的学生年级为：" + WangYun.stuGrade);
	}
}