/**
�����������������������е����ֵ��
*/

import java.util.Scanner;
class Daily4_6_1{
	public static void main(String[] args){
		double [] num = new double [3];					//�������鱣��������
		Scanner sc = new Scanner(System.in);
		System.out.print("��������������");
		/*ѭ������������*/
		for(int i=0;i<3;i++){							
			num[i] = sc.nextDouble();
		}
		double max = num[0];
		/*ѭ���Ƚ��������Ĵ�С*/
		for(int i =0;i<3;i++){
			if(num[i]>max){
				max = num[i];
			}
		}
		System.out.println("�����������������ǣ�" + max);
	}
}