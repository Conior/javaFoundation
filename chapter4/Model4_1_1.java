/**
�û�����n����ʾn��*���ҵ�n����n��*
*/
import java.util.Scanner;
class Model4_1_1{
	public static void main(String[] args){
		System.out.println("������������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		drawStar(num);						//���û�*�ķ���
	}

	/*���컭*�ķ���*/
	public static void drawStar(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}