/**
String�ೣ�÷���
*/

class Model5_2_1{
	public static void main(String[] args){
		String s1 = "blue bridge";
		String s2 = "Blue Bridge";
		String s3 = "����ѧ������ѧjava";
		String s4 = "20140801������Resume.docx";
		String s5 = "   20140801������Resume.docx    ";
		String s7 = "���������죬�ܿ��ģ�������";
		int salary = 16789;

		System.out.println(s1.charAt(1));					//����s1�е�2���ַ������Ϊl
		System.out.println(s1.length());					//����s1�ĳ��ȣ����Ϊ11
		System.out.println(s1.indexOf("bridge"));			//����bridge��s1�е�λ�ã����Ϊ5����0��ʼ��
		System.out.println(s2.indexOf("bridge"));			//����bridge��s2�е�λ�ã���Ϊû�У����Խ��Ϊ-1

		System.out.println(s1.equals(s2));					//�Ƚ�s1��s2�����Ϊfalse
		System.out.println(s1.equalsIgnoreCase(s2));		//���Դ�Сд�Ƚ�s1��s2�����Ϊture

		System.out.println(s3.replace("��","��"));			//��s3�еġ��ҡ��滻Ϊ���㡱


		System.out.println(s4.startsWith("2014"));			//�ж�s4�ǲ����ԡ�2014����ͷ�����Ϊtrue
		System.out.println(s4.endsWith("docx"));			//�ж�s4�ǲ����ԡ�docx����β�����Ϊture
		System.out.println(s4.endsWith("doc"));				//�ж�s4�ǲ����ԡ�doc����β�������false
		System.out.println(s4.toUpperCase());				//��s4����ĸתΪ��д
		System.out.println(s4.toLowerCase());				//��s4תΪСд
		System.out.println(s4.substring(8));				//��s4�ĵ�9���ַ���ʼ����β��ȡ�ַ�
		System.out.println(s4.substring(8,11));				//��s4�ĵ�9���ַ���ʼ����12��������ȡ�ַ�

		System.out.println(s5.trim());						//����s5�ַ���ǰ�����еĿո�


		System.out.println("��нΪ" + salary);
		String s6 = String.valueOf(salary);					//��������������ת��Ϊ�ַ�������
		System.out.println("��нΪ" + s6.length() + "λ��");

		String [] s8 = s7.split("��");						//��s8���������ָ�ָ�󱣴���������
		System.out.println(s7 + "�ָ��Ϊ��");
//		System.out.println(s8);								//split()����ֻ�ܱ���Ϊ����
		for(int i=0;i<s8.length;i++){
			System.out.println(s8[i]);
		}
	}
}