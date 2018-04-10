/**
��ļ�Ӧ��
����
�������÷�װ��Ҫ�����Test6_3�ĳ���
*/

import java.util.Scanner;
class Test6_4{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){

		Teacher [] teacher = new Teacher [2];			//��������Ϊ2�����鱣���ʦ����
		//ѭ��¼��2����ʦ����Ϣ
		for(int i=0;i<teacher.length;i++){
			System.out.println("�����������" + (i+1) + "����ʦ�Ļ�����Ϣ��");
			teacher[i] = creatTeacher();	
		}

		Student [] student = new Student [4];			//��������Ϊ4�����鱣��ѧ������
		//ѭ��¼��4��ѧ������Ϣ
		for(int j=0;j<student.length;j++){
			System.out.println("�������" + (j+1) + "��ѧ����Ϣ��");
			student[j] = creatStudent();	
		}
		
		//���õ�һ����ʦ���εķ���
		teacher[0].teach();

		//���ε�������ѧ�����εķ���
		for(int j=0;j<student.length;j++){
			student[j].learn();
		}

		//���ε�������ѧ������ҵ�ķ���
		for(int j=0;j<student.length;j++){
			String s = student[j].doHomework(20);
			System.out.println(s);
		}

		//���ε�����ʦ��������ѧ������ҵ�ķ���
		for(int j=0;j<student.length;j++){
			teacher[1].checkHomework(student[j]);
		}
		
	}
	//������ʦ���󲢸�ֵ
	public static Teacher creatTeacher(){
		Teacher tea = new Teacher();			////Ҫ��Ӷ������ԣ�������newһ������
	
		System.out.print("��������ʦ������");
		tea.setTeaName(sc.next()); 
		System.out.print("��������ʦרҵ��");
		tea.setProfession(sc.next());
		System.out.print("��������ʦ�����ڵĿγ̣�");
		tea.setCourse(sc.next());
		System.out.print("��������ʦ�Ľ��䣺");
		tea.setTeaYear(sc.nextInt());
		return tea;
	}


	//����ѧ�����󲢸�ֵ
	public static Student creatStudent(){
		Student stu = new Student();		//Ҫ��Ӷ������ԣ�������newһ������
	
		System.out.print("������ѧ��������");
		stu.setStuName(sc.next());
		System.out.print("������ѧ�����䣺");
		stu.setStuAge(sc.nextInt());
		System.out.print("������ѧ���Ա�1�����У�2����Ů����");
		stu.setStuSex(sc.nextInt());
		System.out.print("������ѧ���꼶��");
		stu.setStuGrade(sc.nextInt());
		return stu;
	}
}


//ѧ����
class Student{
	private String stuName;		//ѧ������
	private int stuAge;			//ѧ������
	private int stuSex;			//ѧ���Ա�
	private int stuGrade;		//ѧ���꼶
	
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
	public void setStuSex(int sex){
		this.stuSex = sex;
	}

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}


	//�������η���
	public void learn(){
		System.out.println(stuName + "�����������Σ�");
	}

	//����д��ҵ����
	public String doHomework(int hour){
		return "�����Ǳ���ʱ��" + hour +"�㣬" + stuName + "����д��ҵ��";
	}
}


//��ʦ��
class Teacher{
	private String teaName;			//��ʦ����
	private String profession;		//��ʦרҵ
	private String course;			//��ʦ���ڿγ�
	private int teaYear;			//��ʦ����

	public String getTeaName(){
		return this.teaName;
	}
	public void setTeaName(String name){
		this.teaName = name;
	}

	public String getProfession(){
		return this.profession;
	}
	public void setProfession(String pro){
		this.profession = pro;
	}

	public String getCourse(){
		return this.course;
	}
	public void setCourse(String cou){
		this.course = cou;
	}

	public int getTeaYear(){
		return this.teaYear;
	}
	public void setTeaYear(int year){
		this.teaYear = year;
	}

	//�����ʦ���εķ���
	public void teach(){
		System.out.println(teaName + "��ʦ�����ҿི" + profession + "�γ̣�");
	}

	//�����ʦ�����ҵ�ķ���
	public void checkHomework(Student student){
		String s1 = student.getStuName();			//ͨ��get������ȡstuName���ԣ�����ֵ��s1
		System.out.println("���ڣ�" + profession + "�γ̵���ʦ��" + teaName + "�Ѿ������꣺" + s1 + "����ҵ��");
	}
}

