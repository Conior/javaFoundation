/**
需求：输入任意一个整数，显示这个数的位数
*/

import java.util.Scanner;
class Task3_2{
	public static void main(String[] args){
		int n = 0;								
		int userIn = 0;								//用户输入
		int count = 0;								//位数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		userIn = sc.nextInt();
		n = userIn;

		do{
			n = n/10;
			count++;
		}while(n != 0);

		System.out.println(userIn + "是一个" + count + "位数");
	}
}