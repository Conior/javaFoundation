/**
������������һ����������ʾ�������λ��
*/

import java.util.Scanner;
class Task3_2{
	public static void main(String[] args){
		int n = 0;								
		int userIn = 0;								//�û�����
		int count = 0;								//λ��
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ��������");
		userIn = sc.nextInt();
		n = userIn;

		do{
			n = n/10;
			count++;
		}while(n != 0);

		System.out.println(userIn + "��һ��" + count + "λ��");
	}
}