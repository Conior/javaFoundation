/**
给定圆的半径r，求圆的面积。
输入格式
输入包含一个整数r，表示圆的半径。
输出格式
输出一行，包含一个实数，表示圆的面积。
说明：在本题中，输入是一个整数，但是输出是一个实数。
实数输出的问题如果没有特别说明，舍入都是按四舍五入进行。
*/

import java.util.Scanner;
class Daily4_5_1{
	public static void main(String[] args){
		int r = 0;					//圆的半径
		double s = 0;				//圆的面积
		Scanner sc = new Scanner(System.in);
	
		System.out.print("请输入圆的半径r(1<=r<=10000)：");
		r = sc.nextInt();
		if((r<1) || (r>10000)){
			System.out.println("请输入正确的半径！");
		}else{
			s = 3.14 * r *r;
			System.out.println("半径为" + r + "的圆的面积是：" + s);
		}
	}
}