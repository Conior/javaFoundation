/**
��Ĵ�����ʹ��
*/
class Model6_2_3{
	public static void main(String[] args){
		Student WangYun = new Student();
		//δ��ֵʱ��
		System.out.println("δ��ֵǰ��ѧ������Ϊ��" + WangYun.stuName);
		System.out.println("δ��ֵǰ��ѧ������Ϊ��" + WangYun.stuAge);
		System.out.println("δ��ֵǰ��ѧ���Ա�Ϊ��" + WangYun.stuSex);
		System.out.println("δ��ֵǰ��ѧ���꼶Ϊ��" + WangYun.stuGrade);

		//����������Ը�ֵ
		WangYun.stuName = "����";
		WangYun.stuAge = 22;
		WangYun.stuSex = 1;
		WangYun.stuGrade = 4;
		System.out.println("��ֵ���ѧ������Ϊ��" + WangYun.stuName);
		System.out.println("��ֵ���ѧ������Ϊ��" + WangYun.stuAge);
		System.out.println("��ֵ���ѧ���Ա�Ϊ��" + WangYun.stuSex);
		System.out.println("��ֵ���ѧ���꼶Ϊ��" + WangYun.stuGrade);
	}
}