/**
����
�����ַ������ַ������ֵĴ��������û��ֱ������ַ��������ַ�����������ַ������ֵĴ���
*/

import java.util.Scanner;
class Test5_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;						//ͳ�����ַ����ڸ��ַ����г��ֵĴ���
		int start = 0;						//������ʼ���±�λ��
		System.out.print("������һ���ַ�����");
		String s1 = sc.next();
		System.out.print("������Ҫ���ҵ��ַ�����");
		String s2 = sc.next();
		while(s1.indexOf(s2,start)>=0 && start<s1.length()){		//���ַ�����������λ��Ҫ����0��������������λ��ҪС�ڸ��ַ����ĳ���
			count++;
			start = s1.indexOf(s2,start) + s2.length();				//����һ��������λ�ö�λ����һ���������֮���λ��
		}
		System.out.println(s2 + " �� " + s1 + " �г��ֵĴ���Ϊ��" + count);
	}
}