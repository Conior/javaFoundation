/**
规定一个工人工作时间一月160小时，每小时工资5元，加班的话，每小时增加4元，请编程计算此工人一个月的工资，工作时间由键盘输入。
*/

import java.util.Scanner;
class Task2_2{
  public static void main(String[] args){
    int salary = 5;				//每小时工资
    double engSalary = 0;			//实际月薪
    int ruleSalary = 160*5;			//规定时间应得的月薪
    double ruleTime = 160;			//规定工作时间
    double workTime = 0;			//实际工作时间
    Scanner input = new Scanner(System.in);

    System.out.print("请输入工作时间：");
    workTime = input.nextDouble();
    
    /*计算工资*/
    if(workTime<ruleTime){
      System.out.println("劳动人民最光荣！");
    }else if(workTime == ruleTime){
      System.out.println("这个月的工资为"+ ruleSalary +"元！");
    }else{
      engSalary = ruleSalary + (workTime - ruleTime)*(5+4);
      System.out.println("这个月的工资为"+ engSalary +"元！");
    }
  }
}