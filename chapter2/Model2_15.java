import java.util.Scanner;
//���ʽ������˳��
class  Model2_15
{
	public static void main(String[] args) 
	{
		double stuNum = -1;
		double appleNum = 0;
		double stuApple = -1;

		Scanner input = new Scanner(System.in);
		System.out.println("������ƻ��������");
		appleNum = input.nextDouble();
		System.out.println("������С����������");
		stuNum = input.nextDouble();
		stuApple = appleNum / stuNum;
		System.out.println("ÿ��С���ѿ��Էֵ���ƻ������" + stuApple);
	}
}
