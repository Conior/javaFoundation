/**
�涨һ�����˹���ʱ��һ��160Сʱ��ÿСʱ����5Ԫ���Ӱ�Ļ���ÿСʱ����4Ԫ�����̼���˹���һ���µĹ��ʣ�����ʱ���ɼ������롣
*/

import java.util.Scanner;
class Task2_2{
  public static void main(String[] args){
    int salary = 5;				//ÿСʱ����
    double engSalary = 0;			//ʵ����н
    int ruleSalary = 160*5;			//�涨ʱ��Ӧ�õ���н
    double ruleTime = 160;			//�涨����ʱ��
    double workTime = 0;			//ʵ�ʹ���ʱ��
    Scanner input = new Scanner(System.in);

    System.out.print("�����빤��ʱ�䣺");
    workTime = input.nextDouble();
    
    /*���㹤��*/
    if(workTime<ruleTime){
      System.out.println("�Ͷ���������٣�");
    }else if(workTime == ruleTime){
      System.out.println("����µĹ���Ϊ"+ ruleSalary +"Ԫ��");
    }else{
      engSalary = ruleSalary + (workTime - ruleTime)*(5+4);
      System.out.println("����µĹ���Ϊ"+ engSalary +"Ԫ��");
    }
  }
}