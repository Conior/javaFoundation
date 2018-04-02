/**
判断一个三位数是否是水仙花数,如果是,输出YES,如果不是,输出NO。
说明:水仙花就是一个数的每个数字的立方和等于它本身的数,例如153就是一个水仙花数111+555+333=153。
*/
import java.util.Scanner;
class Task2_3{
  public static void main(String[] args){
    int num = 0;			//三个任意整数  
    int bai = 0;			//定义百位数
    int shi = 0;			//定义十位数
    int ge = 0;				//定义个位数
    int result = 0;  			//水仙花数

    Scanner input=new Scanner(System.in);  
    System.out.print("请输入一个3位整数：");  
    num = input.nextInt();

    /*判断输入的是不是三位数*/
    if(num>=100 && num<=999){
      bai = num / 100;  //456  
      shi = num % 100 /10;  
      ge = num %10;  
      result = bai*bai*bai + shi*shi*shi + ge*ge*ge;  
      if(result == num){  
        System.out.println(num+"是水仙花数");  
      }else{  
        System.out.println(num+"不是水仙花数");       
      }  
    }else{
      System.out.println("请输入正确的三位数！");
    } 
  }
}