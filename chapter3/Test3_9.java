/**
�޸�ϵͳ�����û�����ĳ��������0��ʱ��ִ�и�ģ��Ĺ��ܣ�ִ����Ϻ󣬼�����������档���û�����0�����˳�����
*/

import java.util.Scanner;
class Test3_9{
  public static void main(String[] args){
    int choose = -1;					//����ѡ��
    double engSalary = 0.0;				//java����ʦ��н
    double basSalary = 3000;				//java����ʦ��н
    int comResult = 0;					//�¹��������
    double workDay = 0;					//ʵ�ʹ�������
    double insurance = 3000 * 0.105;			//��Ӧ�۱�����
    boolean state = true;				//״̬    

    Scanner input = new Scanner(System.in);

    /*������ѡ��*/
    do{
      System.out.println("-------------------------------");
      System.out.print("|      ");
      System.out.print("java����ʦ����ϵͳ");
      System.out.println("      |");
      System.out.println("-------------------------------");
      System.out.println("1.����java����ʦ����");
      System.out.println("2.ɾ��ָ��java����ʦ����");
      System.out.println("3.��ѯjava����ʦ����");
      System.out.println("4.�޸�java����ʦ����");
      System.out.println("5.����java����ʦ��н");
      System.out.println("6.��������ӵĹ���ʦ����");
      System.out.println("7.��java����ʦ��Ϣ����1�������2��������");
      System.out.println("8.�������java����ʦ��Ϣ");
      System.out.println("9.�������java����ʦ����");
      System.out.println("10.��ӡjava����ʦ�����ݱ���");
      System.out.println("11.���ļ�����java����ʦ����");
      System.out.println("0.�������༭����ʦ��Ϣ����ʾ���棩");
      System.out.print("����������ѡ��");
      choose = input.nextInt();

      /*�û�ѡ��*/
      switch(choose){
        case 1:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 2:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 3:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 4:
               System.out.println("��ģ�鹦��δʵ��");
               break;

        /*����java����ʦ��н*/
        case 5:
 	       System.out.print("������java����ʦ��н��");
      	       basSalary = input.nextDouble();
	       System.out.print("������java����ʦ����ɷ�������СֵΪ0�����ֵΪ150����");
 	       comResult = input.nextInt();
	       System.out.print("������java����ʦʵ�ʹ���������");
	       workDay = input.nextDouble();
	       System.out.print("������java����ʦ��Ӧ�۱�������");
	       insurance = input.nextDouble();
	       engSalary = basSalary + basSalary*0.25*comResult/100 + workDay*15 - insurance;	//����java����ʦ��н
	       System.out.println("java����ʦ��нΪ��" + engSalary);
	       break;

        case 6:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 7:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 8:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 9:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 10:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 11:
               System.out.println("��ģ�鹦��δʵ��");
               break;
        case 0:
               System.out.println("���������");
	       state = false;					//�ı�״̬
               break;
      }
    }while(state);
  }
}
    
