/**
������������һ���������������ֵ����˷���
*/
import java.util.Scanner;
class Test3_8{
  public static void main(String[] args){
    int firNum = 0;				//��һ������
    int userNum = 0;				//�û��������
    int secNum = 0;				//�ڶ�������
    System.out.print("������һ��������");
    Scanner input = new Scanner(System.in);
    userNum = input.nextInt();
    System.out.println("��" + userNum + "�ĳ˷���Ϊ��");

    for(firNum=0,secNum=userNum;firNum<=userNum;firNum++,secNum--){
      System.out.println(firNum + " * " + secNum + " = " + firNum*secNum);
    }
  }
}