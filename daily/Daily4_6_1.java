/**
输入三个数，求这三个数中的最大值。
*/

import java.util.Scanner;
class Daily4_6_1{
	public static void main(String[] args){
		double [] num = new double [3];					//创建数组保存三个数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入三个数：");
		/*循环输入三个数*/
		for(int i=0;i<3;i++){							
			num[i] = sc.nextDouble();
		}
		double max = num[0];
		/*循环比较三个数的大小*/
		for(int i =0;i<3;i++){
			if(num[i]>max){
				max = num[i];
			}
		}
		System.out.println("这三个数中最大的数是：" + max);
	}
}