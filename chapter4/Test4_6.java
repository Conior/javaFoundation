/**
��ά����
ʹ�ö�ά�����ӡ���������
������ǵ�������
	1��ÿһ�еĵ�һ�к�ÿһ�е����һ�е���ֵ��Ϊ1
	2����i�е�j�е���ֵ��i-1��j-1�е���ֵ��i-1��j�е���ֵ֮��
*/

import java.util.Scanner;
class Test4_6{
	public static void main(String[] args){
		int n = 0;										//�����������
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ�����������ǵ�������");
		n = sc.nextInt();
		int [][] triangle = new int [n][n];				//����n��n�еĶ�ά���鱣��������Ǹ�����ֵ
		triangle [0][0] = 1;							//��ʼ����һ�е�һ�е���ֵ

		/*ѭ�������n�е�n�е���ֵ*/
		for(int i=1;i<n;i++){
			triangle [i][0] = 1;						//���е�һ�е���ֵ
			triangle [i][i] = 1;						//�������һ�е���ֵ
			for(int j=1;j<i;j++){	
				triangle [i][j] = triangle[i-1][j-1] + triangle[i-1][j];		//�Ե�i�е�j�е���ֵ���㲢����
			}
		}
		
		/*ѭ��������и�����ֵ*/
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}
}