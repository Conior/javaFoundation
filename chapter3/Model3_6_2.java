/**
whileѭ��
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
class Model3_6_2{
  public static void main(String[] args){
    int userSel = -1;					//�û�����Ĳ���
    boolean state = true;				//״̬

    while(state){
      System.out.println("1.��������");
      System.out.println("2.�������");
      System.out.println("3.�˳�����");
      System.out.print("��ѡ��������루ֻ������1��2��3����");
      Scanner input = new Scanner(System.in);
      userSel = input.nextInt();

      switch(userSel){
        case 1:
	        System.out.println("ִ��1.��������ģ��");
	        System.out.println("******************");
		System.out.println("******************");
	        break;
        case 2:
	        System.out.println("ִ��2.�������ģ��");
		System.out.println("******************");
		System.out.println("******************");
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
}