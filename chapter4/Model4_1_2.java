/**
������ʹ��
����
1.��������
2.�������
3.�˳�����
��ѡ��������루ֻ������1��2��3��
˵����
���û�����1ʱ��ִ��ģ��1�Ĺ��ܣ�ִ����Ϻ󣬼�����������棻
���û�����2ʱ��ִ��ģ��2�Ĺ��ܣ�ִ����Ϻ󣬼�����������棻
���û�����3ʱ�����˳�����
*/

import java.util.Scanner;
class Model4_1_2{
	static int userSel = -1;					//�û�����Ĳ���

	public static void main(String[] args){
		boolean state = true;					//״̬

		while(state){
			userSel = showMenu();
			switch(userSel){
				case 1:
					inputData();
					break;
				case 2:
					outData();
					break;
				case 3:
					System.out.println("��������");
					state = false;				//�޸�״̬����������ִ��ѭ��
					break;
				default:
					System.out.println("���벻��ȷ��");
			}
			System.out.println();
		} 
	}

	/*���������*/
	public static int showMenu(){
		System.out.println("1.��������");
		System.out.println("2.�������");
		System.out.println("3.�˳�����");
		System.out.print("��ѡ��������루ֻ������1��2��3����");
		Scanner input = new Scanner(System.in);
		userSel = input.nextInt();
		return userSel;
	}

	/*ģ��1  �������ݹ���*/
	public static void inputData(){
		System.out.println("ִ��1.��������ģ��");
		System.out.println("******************");
		System.out.println("******************");
	}

	/*ģ��2  ������ݹ���*/
	public static void outData(){
		System.out.println("ִ��2.�������ģ��");
		System.out.println("******************");
		System.out.println("******************");
	}

}