/**
do...whileѭ��
�������û�������ȷ�ĳ�������֮�󣬲ſ���ִ������Ĵ��룬����������û����룬֪��������ȷΪֹ
*/

import java.util.Scanner;
class Model3_6_3{
  public static void main(String[] args){
    String userPass = "";				//�û���������
    final String PASSWORD = "123456";			//��ȷ����
    Scanner input = new Scanner(System.in);

    do{
      System.out.print("��������ȷ�����룺");
      userPass = input.nextLine();
    }while(!userPass.equals(PASSWORD));			// ==�����Ƚ�����ֵ�����ұȽϴ洢��ַ��equalsֻ�Ƚ�����ֵ

    System.out.println("������ȷ�������ִ�У�");
  }
}