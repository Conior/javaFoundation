/**��1+2+3+...+n��ֵ*/
import java.util.Scanner;
class Task2_5{
  public static void main(String[] args){
    int n = 0;					//�û��������
    int sum = 0;				//��ͽ��
    Scanner input = new Scanner(System.in);
    System.out.print("���������һ������");
    n = input.nextInt();

    /*����1+2+3+...+n��ֵ*/
    for(int i=0;i<=n;i++){
      sum = sum + i;
    }
    System.out.println("1+2+3+...+n = " + sum);
  }
}