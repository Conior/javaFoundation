/*
String�������ַ�����Ƚ��ַ���
*/
class Model5_1_2{
	public static void main(String[] args){
		//1.�����ַ���
		//ʹ�á�+�������ַ�������
		System.out.println("ʹ��'+'�����ַ������ӣ�");
		String s1 = "����";
		s1 = s1 + "����ʦ��";
		System.out.println(s1);

		//ʹ��String public concat(String str) ��������
		System.out.println("ʹ��String public concat(String str) ��������");
		String s2 = "����";
		s2 = s2.concat("����ʦ��");
		System.out.println(s2);



		//2.�Ƚ��ַ���
		String s3 = "java����";
		String s4 = "java����";
		System.out.println(s3==s4);					//ture
		System.out.println(s3.equals(s4));			//true

		String s5 = new String("java����");
		String s6 = new String("java����");
		System.out.println(s5==s6);					//false
		System.out.println(s5.equals(s6));			//true

		System.out.println(s3==s5);					//false
		System.out.println(s3.equals(s5));			//true
	}
}