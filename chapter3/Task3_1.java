/**
�ӿ���̨���������ε����߳���
1���ж��������Ƿ��ܷ񹹳������Σ�
2������ǵ��������Σ����������������ͼ����
3�������ֱ�������Σ������ֱ��������ͼ����
*/

import java.util.Scanner;
class Task3_1{
	public static void main(String[] args){
		double a,b,c = 0;									//�����ε�������
		Scanner input = new Scanner(System.in);
		System.out.print("�����������εĵ�һ���߳���");
		a = input.nextDouble();
		System.out.print("�����������εĵڶ����߳���");
		b = input.nextDouble();
		System.out.print("�����������εĵ������߳���");
		c = input.nextDouble();

		if((a+b)>c && (a-b)<c){								//�ж��Ƿ�Ϊ������
			if(a==b || a==c || b==c){
				System.out.println("���������Ρ�");
			}else if((a*a + b*b)==c*c || (a*a + c*c)==b*b || (b*b + c*c)== a*a){
				System.out.println("ֱ�������ΨS");
			}
		}else{
			System.out.println("�ⲻ��������");
		}
	}
}