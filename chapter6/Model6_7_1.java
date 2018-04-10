/**
对象初始化过程
*/

public class Model6_7_1{
	public static void main(String[] args){
		Student3 temp = new Student3();							//新建一个名为temp的对象
		System.out.println(temp.getStuName() + "正在读大学" + temp.getStuGrade() + "年级！");		//调用对象属性
		Student3 leiJ = new Student3("雷静",21,2,3);			//新建一个leiJ对象，并用构造方法初始化该对象
		System.out.println(leiJ.getStuName() + "正在读大学" + leiJ.getStuGrade() + "年级！");
	}
}

class Student3{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//封装私有属性
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

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//初始化块初始化
	{
		System.out.println("使用初始化块初始化！");
		this.stuName = "王云";
		this.stuAge = 22;
		this.stuSex = 1;
		this.stuGrade = 4;
	}

	//无参构造方法初始化
	public Student3(){
		System.out.println("使用无参构造方法初始化！");
	}

	//构造方法，从初始化对象的成员变量
	public Student3(String name,int age,int sex,int grade){
		System.out.println("使用有参数的构造方法初始化！");
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

}