/**�Ӽ����������������������û��ش���Ŀ�ĺͣ�������̣�ȡ��Ľ������ͳ���û���ȷ�ش�ĸ���*/
import java.util.Scanner;
class Task2_1{
  public static void main(String[] args){
    int a = 0;					//�����һ������
    int b = 0;					//����ڶ�������
    int c = 0;					//�����û��ش���ȷ�ĸ���
    int sum = 0;				//�����������ֵı�׼��
    int difference = 0;				//�����������ֵı�׼��
    int product = 0;				//�����������ֵı�׼��
    double quotient = 0;			//�����������ֵı�׼��
    int remainder = 0;				//�����������ֵı�׼ȡ��
    int admSum = 0;				//�����û�����ĺ�
    int admDif = 0;				//�����û�����Ĳ�
    int admPro = 0;				//�����û�����Ļ�
    double admQuo = 0;				//�����û��������
    int admRem = 0;				//�����û������ȡ��

    Scanner input = new Scanner(System.in);

    /*�û����������*/
    System.out.print("����������a��");
    a = input.nextInt();
    System.out.print("����������b��");
    b = input.nextInt();
    System.out.print("������a+b�ĺͣ�");
    admSum = input.nextInt();
    System.out.print("������a-b�Ĳ");
    admDif = input.nextInt();
    System.out.print("������a��b�Ļ���");
    admPro = input.nextInt();
    System.out.print("������a��b���̣�");
    admQuo = input.nextDouble();
    System.out.print("������a��b��������");
    admRem = input.nextInt();

    /*�����׼��*/
    sum = a+b;
    difference = a-b;
    product = a*b;
    quotient = a/b;
    remainder =a%b;

    /*����֤*/
    if(admSum == sum){c++;}
    if(admDif == difference){c++;}
    if(admPro == product){c++;}
    if(admQuo == quotient){c++;}
    if(admRem == remainder){c++;}

    /*ͳ��������*/
    System.out.println("������" + c + "����Ŀ��");
  }
}