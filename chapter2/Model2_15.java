import java.util.Scanner;
//表达式的运算顺序
class  Model2_15
{
	public static void main(String[] args) 
	{
		double stuNum = -1;
		double appleNum = 0;
		double stuApple = -1;

		Scanner input = new Scanner(System.in);
		System.out.println("请输入苹果数量：");
		appleNum = input.nextDouble();
		System.out.println("请输入小朋友数量：");
		stuNum = input.nextDouble();
		stuApple = appleNum / stuNum;
		System.out.println("每个小朋友可以分到的苹果数：" + stuApple);
	}
}
