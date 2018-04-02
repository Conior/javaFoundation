/**
输入小明的考试成绩，显示所获奖励
成绩：100分，爸爸给他买辆车
成绩大于90分，妈妈给他买MP4
90分>成绩>=60分，妈妈给他买本参考书
成绩<60分，什么都不买。
*/
import java.util.Scanner;
class Task2_4{
  public static void main(String[] args){
    double score = 0;				//小明成绩
    System.out.print("请输入小明的成绩：");
    Scanner input = new Scanner (System.in);
    score = input.nextDouble();
    
    /*判断小明应获奖励*/
    if(score == 100){
      System.out.println("爸爸给买一辆自行车！");
    }else if(score>=90){
      System.out.println("妈妈给买一个MP4！");
    }else if(score>=60 && score<90){
      System.out.println("妈妈给买一本参考书！");
    }else{
      System.out.println("什么都不买！");
    }
  }
}