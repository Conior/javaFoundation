/**
��Ĵ�����ʹ��
*/

public class Model6_2_2{
	public static void main(String[] args){
		Student WangYun = new Student();
		WangYun.stuName = "����";
		WangYun.stuAge = 22;
		WangYun.stuSex = 1;				//1�����У�2����Ů
		WangYun.stuGrade = 4;
		WangYun.learn();
		String strString = WangYun.doHomework(22);
		System.out.println(strString);
	}
}