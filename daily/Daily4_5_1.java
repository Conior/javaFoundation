/**
����Բ�İ뾶r����Բ�������
�����ʽ
�������һ������r����ʾԲ�İ뾶��
�����ʽ
���һ�У�����һ��ʵ������ʾԲ�������
˵�����ڱ����У�������һ�����������������һ��ʵ����
ʵ��������������û���ر�˵�������붼�ǰ�����������С�
*/

import java.util.Scanner;
class Daily4_5_1{
	public static void main(String[] args){
		int r = 0;					//Բ�İ뾶
		double s = 0;				//Բ�����
		Scanner sc = new Scanner(System.in);
	
		System.out.print("������Բ�İ뾶r(1<=r<=10000)��");
		r = sc.nextInt();
		if((r<1) || (r>10000)){
			System.out.println("��������ȷ�İ뾶��");
		}else{
			s = 3.14 * r *r;
			System.out.println("�뾶Ϊ" + r + "��Բ������ǣ�" + s);
		}
	}
}