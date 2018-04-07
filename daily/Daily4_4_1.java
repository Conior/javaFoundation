/**
输入一个整数，如果此数为0，则输出“石头”；如果次数为1,则输出“剪刀”；如果此数为2，则输出“布”；如果为其它，则输出“错误”。
*/

import java.util.Scanner;
class Daily4_4_1{
	public static void main(String[] args){
		int userIn = -1;			//用户输入的数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		userIn = sc.nextInt();
		switch(userIn){
			case 0:
				System.out.println("石头");
				break;
			case 1:
				System.out.println("剪刀");
				break;
			case 2:
				System.out.println("布");
				break;
			default :
				System.out.println("错误");
				break;
		}
	}
}