/**
����һ���������������Ϊ0���������ʯͷ�����������Ϊ1,����������������������Ϊ2������������������Ϊ����������������󡱡�
*/

import java.util.Scanner;
class Daily4_4_1{
	public static void main(String[] args){
		int userIn = -1;			//�û��������
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		userIn = sc.nextInt();
		switch(userIn){
			case 0:
				System.out.println("ʯͷ");
				break;
			case 1:
				System.out.println("����");
				break;
			case 2:
				System.out.println("��");
				break;
			default :
				System.out.println("����");
				break;
		}
	}
}