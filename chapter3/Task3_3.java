/**
쳲��������еĵ�һ���͵ڶ������ֱ�Ϊ1��1���ӵ���������ʼ��ÿ����������ǰ������֮�͡�
���󣺱�дһ�������û�ȷ��Ҫ���������n������̨���쳲��������е�ǰn������ÿ�����5����
*/

import java.util.Scanner;
class Task3_3 {
	public static void main(String[] args) {
		int n = 0;					//쳲���������ǰn��
		int result = 1;				//��n�������
		int temp1 = 1;				//��ʱ�����n-1������
		int temp2 = 1;				//��ʱ�����n-2������
		int temp = 0;				//��ʱ�����n������

		System.out.print("��������Ҫ�����쳲��������е�������");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("쳲��������е�ǰ" + n +"��Ϊ��");
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
					if(i%5==1){								//ÿ�����5����
						System.out.println();
					}
					result = temp1 + temp2;
					System.out.print(result + "\t");

					/*����n���Ϊ��n-1��ʱ*/
					temp = result;
					temp2 = temp1;		
					temp1 = temp;	
				}
				System.out.println();
				break;
		}
	}
}
