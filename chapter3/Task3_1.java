/**
从控制台输入三角形的三边长：
1、判断着三边是否能否构成三角形；
2、如果是等腰三角形，则输出等腰三角形图案；
3、如果是直角三角形，则输出直角三角形图案；
*/

import java.util.Scanner;
class Task3_1{
	public static void main(String[] args){
		double a,b,c = 0;									//三角形的三条边
		Scanner input = new Scanner(System.in);
		System.out.print("请输入三角形的第一条边长：");
		a = input.nextDouble();
		System.out.print("请输入三角形的第二条边长：");
		b = input.nextDouble();
		System.out.print("请输入三角形的第三条边长：");
		c = input.nextDouble();

		if((a+b)>c && (a-b)<c){								//判断是否为三角形
			if(a==b || a==c || b==c){
				System.out.println("等腰三角形△");
			}else if((a*a + b*b)==c*c || (a*a + c*c)==b*b || (b*b + c*c)== a*a){
				System.out.println("直角三角形⊿");
			}
		}else{
			System.out.println("这不是三角形");
		}
	}
}