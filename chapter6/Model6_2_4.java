/**
��װ
*/
public class Model6_2_4{
	public static class Student{		//�˴�������static���Σ����������������޷�������getter������setter����
		private String stuName;			//ѧ������
		private int stuAge;				//ѧ������
		private int stuSex;				//ѧ���Ա�
		private int stuGrade;			//ѧ���꼶

		//���з�����ȡѧ�����ԡ�������stuName
		public String getStuName(){
			return this.stuName;		//����������˽�����ԡ�������stuName
		}
		//���з�����ȡѧ�����ԡ�������stuAge
		public int getStuAge(){
			return this.stuAge;			//����������˽�����ԡ�������stuAge
		}
		//���з�����ȡѧ�����ԡ�������stuSex
		public int getStuSex(){
			return this.stuSex;			//����������˽�����ԡ�������stuSex
		}
		//���з�����ȡѧ�����ԡ�������stuGrade
		public int getStuGrade(){
			return this.stuGrade;		//����������˽�����ԡ�������stuGrade
		}
		//���з�������ѧ�����ԡ�������stuName
		public void setStuName(String name){
			this.stuName = name;		//��������Ϊѧ�����ԡ���������stuName
		}
		//���з�������ѧ�����ԡ�������stuAge
		public void setStuAge(int age){
			this.stuAge = age;			//��������Ϊѧ�����ԡ���������stuAge
		}
		//���з�������ѧ�����ԡ�������stuSex
		public void setStuSex(int sex){
			this.stuSex = sex;			//��������Ϊѧ�����ԡ���������stuSex
		}
		//���з�������ѧ�����ԡ�������stuGrade
		public void setStuGrade(int grade){
			this.stuGrade = grade;		//��������Ϊѧ�����ԡ���������stuGrade
		}

		//�������εķ���
		public void learn(){
			System.out.println(stuName + "������֤������");
		}

		//����д��ҵ�ķ���
		public String doHomework(int hour){
			return "�����Ǳ���ʱ��" + hour + "," + stuName + "����ѧ��ҵ��";
		}
	}


	public static void main(String[] args){
		Student stu = new Student();	//��Student��ʵ����һ��stu����
		stu.setStuName("����");			//����setter����������stu��ֵ
		stu.setStuAge(22);
		stu.setStuSex(1);
		stu.setStuGrade(4);
		stu.learn();					//����learn()����
		String s1 = stu.doHomework(22);
		System.out.println(s1);
	}
}
