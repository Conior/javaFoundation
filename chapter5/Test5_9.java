/**
java API
1���ж�һ���ַ����Ƿ�Ϊ��
2�����ַ���ת��Ϊһ���µ��ַ�����
3�����ֵ�˳��˳��Ƚ������ַ���
*/

class Test5_9{
	public static void main(String[] args){
		//1.�ж�һ���ַ����Ƿ�Ϊ��
		String s1 = "";
		if(s1.isEmpty()){
			System.out.println("����һ���յ��ַ�����");
		}

		//2.���ַ���ת��Ϊһ���µ��ַ�����
		String s2 = "������������,�㻹����������";
		System.out.println("ԭ�ַ���Ϊ��" + s2);
		char [] s3 = s2.toCharArray();
		System.out.print("ת��Ϊ�ַ�����֮��,����ĳ���Ϊ��");
		System.out.println(s3.length);


		/*
		3.���ֵ�˳��˳��Ƚ������ַ���
		��ȽϹ����ǣ�
			�ó��ַ����ĵ�һ���ַ�������ĵ�һ���ַ����бȽϣ�������߲��ȣ��ȽϽ������������ߵ�ascii����ַ����ĵ�һ���ַ���ȥ�����ĵ�һ���ַ���ascii��ֵ
			��������ַ����ĳ��Ȳ�ͬ������һ���ַ�������һ���ַ�����ǰ��N���ַ���ȣ���ô����������ط��������ַ�������֮��
		*/
		String s4 = "abcd";
		String s5 = "abce";
		String s6 = "Abc";
		String s7 = "abcdefg";
		System.out.println(s4.compareTo(s5));			//����-1
		System.out.println(s4.compareTo(s6));			//����32
		System.out.println(s7.compareTo(s4));			//����3
		System.out.println(s7.compareTo(s5));			//����-1
	}
}