/**
���췽����ʹ��
*/

public class Model6_5_2{
	public static void main(String[] args){
		//ʹ�ò�ͬ�����Ĺ��췽������wangYun��liuJT��nanTH����ѧ������
		Student2 wangYun = new Student2("����",22,1,4);
		Student2 liuJT = new Student2("������",21,2);
		Student2 nanTH = new Student2("���컪",1);

		wangYun.learn();
		String s1 = wangYun.doHomework(22);
		System.out.println(s1);

		liuJT.learn();
		System.out.println(liuJT.getStuName() + "�ڶ���ѧ" + liuJT.getStuGrade() + "�꼶");

		System.out.println(nanTH.doHomework(21));
	}
}

class Student2{
	private String stuName;
	private int stuAge;
	private int stuSex;
	private int stuGrade;

	//��װ
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
	//�������޸��Ա�����ȡ���Ա��setter����

	public int getStuGrade(){
		return this.stuGrade;
	}
	public void setStuGrade(int grade){
		this.stuGrade = grade;
	}

	//���췽��,�û���ʼ����������
	public Student2(String name,int age,int sex,int grade){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = grade;
	}

	//���췽�����û���ʼ���������ԣ������꼶�������꼶Ĭ��ֵΪ4��
	public Student2(String name,int age,int sex){
		this.stuName = name;
		this.stuAge = age;
		this.stuSex = sex;
		this.stuGrade = 4;
	}

	//���췽�����û���ʼ���������ԣ��������䡢�꼶����������Ĭ��22���꼶Ĭ��4��
	public Student2(String name,int sex){
		this.stuName = name;
		this.stuAge = 22;
		this.stuSex = sex;
		this.stuGrade = 4;
	}

	//ѧϰ����
	public void learn(){
		System.out.println(stuName + "��������ѧϰ��");
	}

	//д��ҵ����
	public String doHomework(int hour){
		return "�����Ǳ���ʱ��" + hour + "," + stuName + "����д��ҵ��";
	}
}
