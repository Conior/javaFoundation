/**
斐波那契数列的第一个和第二个数分别为1和1，从第三个数开始，每个数等于其前两个数之和。
需求：编写一个程序，用户确定要输出的项数n，控制台输出斐波那契数列的前n个数，每行输出5个数
*/

import java.util.Scanner;
class Task3_3 {
	public static void main(String[] args) {
		int n = 0;					//斐波那契数列前n项
		int result = 1;				//第n项的数据
		int temp1 = 1;				//临时保存第n-1项数据
		int temp2 = 1;				//临时保存第n-2项数据
		int temp = 0;				//临时保存第n项数据

		System.out.print("请输入需要输出的斐波那契数列的项数：");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("斐波那契数列的前" + n +"项为：");
		switch(n){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("1" + "\t" + "1");
				break;
			default:
				System.out.print("1" + "\t" + "1" + "\t");
				for(int i=3;i<=n;i++){
					if(i%5==1){								//每行输出5个数
						System.out.println();
					}
					result = temp1 + temp2;
					System.out.print(result + "\t");

					/*当第n项变为第n-1项时*/
					temp = result;
					temp2 = temp1;		
					temp1 = temp;	
				}
				System.out.println();
				break;
		}
	}
}
