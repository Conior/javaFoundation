/**
�����ʼ������
*/

public class Model6_7_1{
	public static void main(String[] args){
		Student3 temp = new Student3();							//�½�һ����Ϊtemp�Ķ���
		System.out.println(temp.getStuName() + "���ڶ���ѧ" + temp.getStuGrade() + "�꼶��");		//���ö�������
		Student3 leiJ = new Student3("�׾�",21,2,3);			//�½�һ��leiJ���󣬲��ù��췽����ʼ���ö���
		System.out.println(leiJ.getStuName() + "���ڶ���ѧ" + leiJ.getStuGrade() + "�꼶��");
	}
}

class Student3{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//��װ˽������
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

	//��ʼ�����ʼ��
	{
		System.out.println("ʹ�ó�ʼ�����ʼ����");
		this.stuName = "����";
		this.stuAge = 22;
		this.stuSex = 1;
		this.stuGrade = 4;
	}

	//�޲ι��췽����ʼ��
	public Student3(){
		System.out.println("ʹ���޲ι��췽����ʼ����");
	}

	//���췽�����ӳ�ʼ������ĳ�Ա����
	public Student3(String name,int age,int sex,int grade){
		System.out.println("ʹ���в����Ĺ��췽����ʼ����");
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

}