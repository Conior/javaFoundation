/**
��ļ�Ӧ��
����
1���ڳ���ʼ����ʱ����Ҫ�ڿ���̨��������������ʦ��ѧ���Ļ�����Ϣ
2���ڿ���̨���������Щ��ʦ��ѧ���Ļ�����Ϣ�󣬵��õ�һ����ʦ���εķ������ڿ���̨�����***������ʦ����������ʦ�����ҿི***������ʦ���ܿγ̣��γ̡�����Ϣ
3�����ε�������ѧ�����εķ������ڿ���̨�����***����ѧ��������ѧ�������������Σ�������Ϣ
4�����ε�������ѧ��д��ҵ�ķ������ڿ���̨����������Ǳ���ʱ�䣺***��ʱ�䣩�㣬***����ѧ������������д��ҵ��������Ϣ
5��������ʦ������ҵ�ķ�����������������ѧ������ҵ���ڿ���̨���������***������ʦ���ܿγ̣��γ̵���ʦ***������ʦ�������Ѿ�������ϣ�***����ѧ������������ҵ����
*/

import java.util.Scanner;
class Aaa{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		Teacher tea = new Teacher();
		Student stu = new Student();

		
		Teacher [] teacher = new Teacher [2];			//��������Ϊ2�����鱣���ʦ����
		//ѭ��¼��2����ʦ����Ϣ
		for(int i=0;i<teacher.length;i++){
			teacher[i] = tea;
			System.out.println("�����������" + (i+1) + "����ʦ�Ļ�����Ϣ��");
			System.out.print("��������ʦ������");
			tea.teaName = sc.next(); 
			System.out.print("��������ʦרҵ��");
			tea.profession = sc.next();
			System.out.print("��������ʦ�����ڵĿγ̣�");
			tea.course = sc.next();
			System.out.print("��������ʦ�Ľ��䣺");
			tea.teaYear = sc.nextInt();
			
		}

		Student [] student = new Student [4];			//��������Ϊ4�����鱣��ѧ������
		//ѭ��¼��4��ѧ������Ϣ
		for(int j=0;j<student.length;j++){
			student[j] = stu;
			System.out.println("�������" + (j+1) + "��ѧ����Ϣ��");
			System.out.print("������ѧ��������");
			stu.stuName = sc.next();
			System.out.print("������ѧ�����䣺");
			stu.stuAge = sc.nextInt();
			System.out.print("������ѧ���Ա�1�����У�2����Ů����");
			stu.stuSex = sc.nextInt();
			System.out.print("������ѧ���꼶��");
			stu.stuGrade = sc.nextInt();
			
		}
		
		//���õ�һ����ʦ���εķ���
		teacher[0].teach();

		//���ε�������ѧ�����εķ���
		for(int j=0;j<student.length;j++){
			student[j].learn();
		}

		//���ε�������ѧ������ҵ�ķ���
		for(int j=0;j<student.length;j++){
			student[j].doHomework(20);
		}

		//���ε�����ʦ��������ѧ������ҵ�ķ���
		for(int j=0;j<student.length;j++){
			teacher[1].checkHomework(student[j]);
		}
		
	}		
}


//ѧ����
class Student{
	String stuName;		//ѧ������
	int stuAge;			//ѧ������
	int stuSex;			//ѧ���Ա�
	int stuGrade;		//ѧ���꼶
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
	String teaName;
	String profession;
	String course;
	int teaYear;
	//�����ʦ���εķ���
	public void teach(){
		System.out.println(teaName + "��ʦ�����ҿི" + profession + "�γ̣�");
	}

	//�����ʦ�����ҵ�ķ���
	public void checkHomework(Student student){
		System.out.println("���ڣ�" + profession + "�γ̵���ʦ��" + teaName + "�Ѿ������꣺" + student.stuName + "����ҵ��");
	}
}