import java.util.Scanner;				//导入util包
//算术运算符
class Model2_11 
{
	public static void main(String[] args) 
	{
		int i1 = 10, i2 = 20;
		int i = (i2++);    //先赋值再自增
		System.out.print("i=" + i +" ");
		System.out.println("i2=" + i2);

		i = (++i2);   //先自增再赋值
		System.out.print("i=" + i + " ");
		System.out.println("i2=" + i2);

		i = (i1--);    //先赋值再自减
		System.out.print("i=" + i + " ");
		System.out.println("i1=" + i1 + " ");

		i = (--i1);    //先自减再赋值
		System.out.print("i=" + i + " ");
		System.out.println("i1=" + i1 + " ");


		System.out.println("10 % 3 =" + 10 % 3);
		System.out.println("20 % 3 =" + 20 % 3);


		int rst = (21 % 5) > 3 ? 1 : 0 ;
		System.out.println("21÷5的余数大于3吗？" + rst);





//		计算工程师月薪		
//		月薪=底薪+月实际绩效+月餐补-月保险		
//		月实际绩效=月绩效基数（底薪×25%）×月工作完成数/100		
//		月餐补=月实际工作天数×15
		double engSalary = 0.0;						//工程师月薪
		int basSalary = 3000;						//底薪
		int comResult = 100;						//月工作完成数（最小为0，最大为150）
		double workDay = 22;						//实际工作天数
		double insurance = 3000 * 0.105;			//月应扣保险数

		Scanner input = new Scanner(System.in);		//从控制台获取输入对象
		System.out.println("请输入java工程师的底薪：");
		basSalary = input.nextInt();				//从控制台获取输入————底薪，赋值给basSalary
		System.out.println("请输入java工程师月工作完成份数（最小为0，最大为150）：");
		comResult = input.nextInt();				//从控制台获取输入————月工作完成数，赋值给conResult
		System.out.println("请输入java工程师月实际工作天数：");
		workDay = input.nextInt();					//从控制台获取输入————月工作天数，赋值给workDay
		System.out.println("请输入java工程师月应扣保险数：");
		insurance = input.nextDouble();				//从控制台获取输入————月应扣保险数，赋值给insurance

		engSalary = basSalary + basSalary * 0.25 * comResult / 100 + workDay * 15 - insurance ;
		System.out.println("java工程师的月薪为：" + engSalary);


	} 
}
