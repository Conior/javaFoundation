/**
�ж�һ����λ���Ƿ���ˮ�ɻ���,�����,���YES,�������,���NO��
˵��:ˮ�ɻ�����һ������ÿ�����ֵ������͵������������,����153����һ��ˮ�ɻ���111+555+333=153��
*/
import java.util.Scanner;
class Task2_3{
  public static void main(String[] args){
    int num = 0;			//������������  
    int bai = 0;			//�����λ��
    int shi = 0;			//����ʮλ��
    int ge = 0;				//�����λ��
    int result = 0;  			//ˮ�ɻ���

    Scanner input=new Scanner(System.in);  
    System.out.print("������һ��3λ������");  
    num = input.nextInt();

    /*�ж�������ǲ�����λ��*/
    if(num>=100 && num<=999){
      bai = num / 100;  //456  
      shi = num % 100 /10;  
      ge = num %10;  
      result = bai*bai*bai + shi*shi*shi + ge*ge*ge;  
      if(result == num){  
        System.out.println(num+"��ˮ�ɻ���");  
      }else{  
        System.out.println(num+"����ˮ�ɻ���");       
      }  
    }else{
      System.out.println("��������ȷ����λ����");
    } 
  }
}