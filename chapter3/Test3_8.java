/**
需求：输入任意一个整数，根据这个值输出乘法表
*/
import java.util.Scanner;
class Test3_8{
  public static void main(String[] args){
    int firNum = 0;				//第一个乘数
    int userNum = 0;				//用户输入的数
    int secNum = 0;				//第二个乘数
    System.out.print("请输入一个整数：");
    Scanner input = new Scanner(System.in);
    userNum = input.nextInt();
    System.out.println("数" + userNum + "的乘法表为：");

    for(firNum=0,secNum=userNum;firNum<=userNum;firNum++,secNum--){
      System.out.println(firNum + " * " + secNum + " = " + firNum*secNum);
    }
  }
}