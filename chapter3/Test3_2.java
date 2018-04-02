/**输入积分，根据积分再控制台输出需要赠送的物品*/
import java.util.Scanner;
class Test3_2{
  public static void main(String[] args){
    int x = 0;					//用户积分
    Scanner input = new Scanner(System.in);
    System.out.println("请输入您的积分：");
    x = input.nextInt();

    /*判断积分区间*/
    if(x<5000){
      System.out.println("国庆节快乐，送您一张贺卡！");
    }else if((x>=50000)&&(x<=10000)){
      System.out.println("国庆节快乐，送您一个杯子！");
    }else if((x>=10000)&&(x<30000)){
      System.out.println("国庆节快乐，送您一套餐具！");
    }else{
      System.out.println("国庆节快乐，送您一套精美骨质瓷器！");
    }
  }
}