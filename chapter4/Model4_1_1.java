/**
用户输入n，显示n行*，且第n行有n个*
*/
import java.util.Scanner;
class Model4_1_1{
	public static void main(String[] args){
		System.out.println("请输入行数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		drawStar(num);						//调用画*的方法
	}

	/*构造画*的方法*/
	public static void drawStar(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}