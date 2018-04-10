/**
输入十个数，求这十个数中的第二大值
*/

import java.util.Scanner;
class Daily4_8{
	public static void main(String[] args){
		double [] arr = new double [10];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入十个数：");
		
		//将输入的数字保存在数组当中
		for(i=0;i<10;i++){
			arr[i] = sc.nextDouble();
		}
		
		//采用冒泡排序的方法对数字进行排序
		for(i=1;i<10;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
				}
			}
		}

		System.out.println("这是个数字里面的第二大数字是：" + arr[1]);
	}
}