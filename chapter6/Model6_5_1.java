/**
���췽��
*/
public class Model6_5_1{
	public static void main(String[] args){
		//ʹ�ô��εĹ��췽����
		Student1 WangYun = new Student1("����",22,1,4);
		WangYun.learn();
		String s1 = WangYun.doHomework(22);
		System.out.println(s1);
	}
}

class Student1{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//���Է�װ
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
	//��Ϊ��Ҫ�趨�Ա𲻿��޸ģ����Բ������Ա��setter����

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//���췽�����û���ʼ������ĳ�Ա����
	public Student1(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//ѧϰ����
	public void learn(){
		System.out.println(stuName + "��������ѧϰ��");
	}

	public String doHomework(int hour){
		return "�����Ǳ���ʱ��" + hour + "," + stuName + "����д��ҵ��";
	}
}