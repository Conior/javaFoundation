/**
����ʮ����������ʮ�����еĵڶ���ֵ
*/

import java.util.Scanner;
class Daily4_8{
	public static void main(String[] args){
		double [] arr = new double [10];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ʮ������");
		
		//����������ֱ��������鵱��
		for(i=0;i<10;i++){
			arr[i] = sc.nextDouble();
		}
		
		//����ð������ķ��������ֽ�������
		for(i=1;i<10;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j]){
					double temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
				}
			}
		}

		System.out.println("���Ǹ���������ĵڶ��������ǣ�" + arr[1]);
	}
}