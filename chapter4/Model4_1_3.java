/**
�����ĵݹ����
����ʹ�õݹ��������n�Ľ׳�
*/

import java.util.Scanner;
class Model4_1_3{
	static long sum = 1;
	public static void main(String[] args){
		System.out.print("������n��");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factional(n);
		System.out.println(n + "! = " + sum*n);
	}

	public static long factional (int n){
		if(n==1){
			return 1;
		}
		sum = factional(n - 1);
		return sum*n;
	}
}