/**
��������
*/

class Student4{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//��˽�����Է�װ
	public String getStuName(){
		return this.stuName;
	}
	public void setStuName(String name){
		this.stuName = name;
	}

	public int getStuSex(){
		return this.stuSex;
	}

	public int getStuAge(){
		return this.stuAge;
	}
	public void setStuAge(int age){
		this.stuAge = age;
	}

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//���췽�����û���ʼ�����������
	public Student4(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//���췽�����û���ʼ�����������
	public Student4(String name,int sex,int grade){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//�޲����Ĺ��췽��
	public Student4(){
	
	}

	//�������أ�����learn()����
	//����name,age,sex,gradeֵ������
	public void learn(String name,int age,int sex,int grade){
		String str = (sex==1)?"��":"Ů";
		System.out.println("����" + grade + str + "ͬѧ" + name + "����ѧϰ��");
	}

	//�������أ�����learn()����
	//����name,age,sexֵ,�꼶Ĭ��Ϊ4��������
	public void learn(String name,int age,int sex){
		learn(name,age,sex,4);
	}

	//�������أ�����learn()����
	//����name��sexֵ������Ĭ��Ϊ22���꼶Ĭ��4��������
	public void learn(String name,int sex){
		learn(name,22,sex,4);
	}
	
	//�������أ�����learn()����
	//�޲η������أ�ʹ�ó�Ա������Ϊ�����
	public void learn(){
		learn(this.stuName,this.stuAge,this.stuSex,this.stuGrade);
	}
}

public class Model6_8_1{
	public static void main(String[] args){
		Student4 stu = new Student4("����",22,1,3);
		stu.learn("�׾�",21,2,3);
		stu.learn("��˼",23,2);
		stu.learn("�Ż�",1);
		stu.learn();

	}
}