/**
forѭ��
����
1�����1~1000֮�����������ĺ�
2�����10��java����ʦ��Ϣ��������Ҫ�ֱ������10������ʦ�ĵ�н�����������н����6k�ĸ�н��Ա�����Լ���Щ��н��Ա�ĵ�нƽ��ֵ
*/

import java.util.Scanner; 
class Model3_6_4{
  public static void main(String[] args){

    int sum = 0;							//������
    for(int i=1;i<=1000;i=i+2){
      sum += i; 
    }
    System.out.println("1~1000֮�����������ĺ�Ϊ��" + sum);
    System.out.println();


    double basSalary = 0;						//java����ʦ��н
    int i = 0;								//java����ʦ���
    int count = 0;							//��н����
    double higSalary = 0;						//��н��Ա��н��
    Scanner input = new Scanner(System.in);

    for(i=0;i<10;i++){
      System.out.print("�������"+ (i+1) +"��java����ʦ�ĵ�н��");
      basSalary = input.nextDouble();
      if(basSalary>=6000){
        count = count + 1;						//ͳ�Ƹ�н����
	higSalary += basSalary;						//ͳ�Ƹ�н��Ա��н�ܺ�
      } 
    }

    System.out.println("��н����6k�ĸ�н��Ա����Ϊ��" + (count/10.0)*100 + "%");
    System.out.println("��Щ��н��Ա�ĵ�нƽ��ֵΪ��" + higSalary/count);	    
  }
}