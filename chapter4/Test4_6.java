/**
二维数组
使用二维数组打印出杨辉三角
杨辉三角的特征：
	1、每一行的第一列和每一行的最后一列的数值均为1
	2、第i行第j列的数值是i-1行j-1列的数值与i-1行j列的数值之和
*/

import java.util.Scanner;
class Test4_6{
	public static void main(String[] args){
		int n = 0;										//杨辉三角行数
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要输出的杨辉三角的行数：");
		n = sc.nextInt();
		int [][] triangle = new int [n][n];				//创建n行n列的二维数组保存杨辉三角各项数值
		triangle [0][0] = 1;							//初始化第一行第一列的数值

		/*循环保存第n行第n列的数值*/
		for(int i=1;i<n;i++){
			triangle [i][0] = 1;						//各行第一列的数值
			triangle [i][i] = 1;						//各行最后一列的数值
			for(int j=1;j<i;j++){	
				triangle [i][j] = triangle[i-1][j-1] + triangle[i-1][j];		//对第i行第j列的数值计算并保存
			}
		}
		
		/*循环输出各行各列数值*/
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}
}