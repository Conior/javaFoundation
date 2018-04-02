/**求1+2+3+...+n的值*/
import java.util.Scanner;
class Task2_5{
  public static void main(String[] args){
    int n = 0;					//用户输入的数
    int sum = 0;				//求和结果
    Scanner input = new Scanner(System.in);
    System.out.print("请输入最后一个数：");
    n = input.nextInt();

    /*计算1+2+3+...+n的值*/
    for(int i=0;i<=n;i++){
      sum = sum + i;
    }
    System.out.println("1+2+3+...+n = " + sum);
  }
}