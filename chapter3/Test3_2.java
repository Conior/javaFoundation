/**������֣����ݻ����ٿ���̨�����Ҫ���͵���Ʒ*/
import java.util.Scanner;
class Test3_2{
  public static void main(String[] args){
    int x = 0;					//�û�����
    Scanner input = new Scanner(System.in);
    System.out.println("���������Ļ��֣�");
    x = input.nextInt();

    /*�жϻ�������*/
    if(x<5000){
      System.out.println("����ڿ��֣�����һ�źؿ���");
    }else if((x>=50000)&&(x<=10000)){
      System.out.println("����ڿ��֣�����һ�����ӣ�");
    }else if((x>=10000)&&(x<30000)){
      System.out.println("����ڿ��֣�����һ�ײ;ߣ�");
    }else{
      System.out.println("����ڿ��֣�����һ�׾������ʴ�����");
    }
  }
}