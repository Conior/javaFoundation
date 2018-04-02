/**
  switch语句练习
  输入学生的美术结业评价（只能输入1，2，3，4），当输入评价后，控制台根据评价输出对应的奖励。
*/
import java.util.Scanner;
class Model3_4_1{
  public static void main(String[] args){
    int score1 = 0;			//张明同学的美术结业评价
    int score2 = 0;			//李阳同学的美术结业评价
    Scanner input = new Scanner(System.in);

    /*利用switch语句判断*/
    /*张明同学的奖励*/
    System.out.println("请输入张明同学的美术结业成绩评价（只能输入1、2、3、4）：");
    score1 = input.nextInt();
    switch(score1){
      case 1:
            System.out.println("奖励暑假去九寨沟旅游！");
      	    break;
      case 2:
            System.out.println("奖励一个变形金刚！");
 	    break;
      case 3:
	    System.out.println("不奖不罚，需要继续努力！");
   	    break;
      case 4:
	    System.out.println("负责家里洗碗一周！");
	    break;
      default:
	    System.out.println("输入错误，请重新输入！");
	    break;
    }

    System.out.println();

    /*李阳同学的美术结业评价*/
    System.out.println("请输入李阳同学的美术结业成绩评价（智能输入1、2、3、4）：");
    score2 = input.nextInt();
    switch(score2){
      case 1 :
      case 2:
           System.out.println("奖励暑假去九寨沟旅游！");
   	   break;
      case 3:
      case 4:
	   System.out.println("不奖不罚，需要继续努力！");
      	   break;
      default:
	   System.out.println("输入错误，请重新输入！");
	   break;
    } 
  }
}