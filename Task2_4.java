/**
����С���Ŀ��Գɼ�����ʾ������
�ɼ���100�֣��ְָ���������
�ɼ�����90�֣����������MP4
90��>�ɼ�>=60�֣���������򱾲ο���
�ɼ�<60�֣�ʲô������
*/
import java.util.Scanner;
class Task2_4{
  public static void main(String[] args){
    double score = 0;				//С���ɼ�
    System.out.print("������С���ĳɼ���");
    Scanner input = new Scanner (System.in);
    score = input.nextDouble();
    
    /*�ж�С��Ӧ����*/
    if(score == 100){
      System.out.println("�ְָ���һ�����г���");
    }else if(score>=90){
      System.out.println("�������һ��MP4��");
    }else if(score>=60 && score<90){
      System.out.println("�������һ���ο��飡");
    }else{
      System.out.println("ʲô������");
    }
  }
}