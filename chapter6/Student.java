/**
��Ķ���


ע�⣺�������Ϊû��mian()����������ֻ�ܱ��룬��������
*/

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