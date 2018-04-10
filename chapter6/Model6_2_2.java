/**
类的创建和使用
*/

public class Model6_2_2{
	public static void main(String[] args){
		Student WangYun = new Student();
		WangYun.stuName = "王云";
		WangYun.stuAge = 22;
		WangYun.stuSex = 1;				//1代表男，2代表女
		WangYun.stuGrade = 4;
		WangYun.learn();
		String strString = WangYun.doHomework(22);
		System.out.println(strString);
	}
}