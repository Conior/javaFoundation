/**
  switch�����ϰ
  ����ѧ����������ҵ���ۣ�ֻ������1��2��3��4�������������ۺ󣬿���̨�������������Ӧ�Ľ�����
*/
import java.util.Scanner;
class Model3_4_1{
  public static void main(String[] args){
    int score1 = 0;			//����ͬѧ��������ҵ����
    int score2 = 0;			//����ͬѧ��������ҵ����
    Scanner input = new Scanner(System.in);

    /*����switch����ж�*/
    /*����ͬѧ�Ľ���*/
    System.out.println("����������ͬѧ��������ҵ�ɼ����ۣ�ֻ������1��2��3��4����");
    score1 = input.nextInt();
    switch(score1){
      case 1:
            System.out.println("�������ȥ��կ�����Σ�");
      	    break;
      case 2:
            System.out.println("����һ�����ν�գ�");
 	    break;
      case 3:
	    System.out.println("������������Ҫ����Ŭ����");
   	    break;
      case 4:
	    System.out.println("�������ϴ��һ�ܣ�");
	    break;
      default:
	    System.out.println("����������������룡");
	    break;
    }

    System.out.println();

    /*����ͬѧ��������ҵ����*/
    System.out.println("����������ͬѧ��������ҵ�ɼ����ۣ���������1��2��3��4����");
    score2 = input.nextInt();
    switch(score2){
      case 1 :
      case 2:
           System.out.println("�������ȥ��կ�����Σ�");
   	   break;
      case 3:
      case 4:
	   System.out.println("������������Ҫ����Ŭ����");
      	   break;
      default:
	   System.out.println("����������������룡");
	   break;
    } 
  }
}