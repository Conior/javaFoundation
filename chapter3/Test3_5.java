/**
用switch语句实现根据用户输入指令跳转到相应选项
java工程师月薪=月底薪+月实际绩效+月餐补-月保险
月底薪为固定值
月实际绩效=月绩效基数（月底薪×25%）×月工作完成数（最小值为0，最大值为150）/100
月餐补=月实际工作天数×15
月保险为固定值
*/

import java.util.Scanner;
class Test3_5{
  public static void main(String[] args){
    int choose = -1;					//定义选项
    double engSalary = 0.0;				//java工程师月薪
    double basSalary = 3000;				//java工程师底薪
    int comResult = 0;					//月工作完成数
    double workDay = 0;					//实际工作天数
    double insurance = 3000 * 0.105;			//月应扣保险数    

    Scanner input = new Scanner(System.in);

    /*主界面选项*/
    System.out.println("-------------------------------");
    System.out.print("|     ");
    System.out.print("蓝桥java工程师管理系统");
    System.out.println("     |");
    System.out.println("-------------------------------");
    System.out.println("1.输入java工程师资料");
    System.out.println("2.删除指定java工程师资料");
    System.out.println("3.查询java工程师资料");
    System.out.println("4.修改java工程师资料");
    System.out.println("5.计算java工程师月薪");
    System.out.println("6.保存新添加的工程师资料");
    System.out.println("7.对java工程师信息排序（1编号升序，2姓名升序）");
    System.out.println("8.输出所有java工程师信息");
    System.out.println("9.清空所有java工程师数据");
    System.out.println("10.打印java工程师的数据报表");
    System.out.println("11.从文件导入java工程师数据");
    System.out.println("0.结束（编辑工程师信息后提示保存）");

    System.out.println("请输入您的选择：");
    choose = input.nextInt();

    /*用户选项*/
    switch(choose){
      case 1:
           System.out.println("本模块功能未实现");
           break;
      case 2:
           System.out.println("本模块功能未实现");
           break;
      case 3:
           System.out.println("本模块功能未实现");
           break;
      case 4:
           System.out.println("本模块功能未实现");
           break;

      /*计算java工程师月薪*/
      case 5:
 	   System.out.print("请输入java工程师底薪：");
      	   basSalary = input.nextDouble();
	   System.out.print("请输入java工程师月完成分数（最小值为0，最大值为150）：");
 	   comResult = input.nextInt();
	   System.out.print("请输入java工程师实际工作天数：");
	   workDay = input.nextDouble();
	   System.out.print("请输入java工程师月应扣保险数：");
	   insurance = input.nextDouble();
	   engSalary = basSalary + basSalary*0.25*comResult/100 + workDay*15 - insurance;	//计算java工程师月薪
	   System.out.println("java工程师月薪为：" + engSalary);
	   break;

      case 6:
           System.out.println("本模块功能未实现");
           break;
      case 7:
           System.out.println("本模块功能未实现");
           break;
      case 8:
           System.out.println("本模块功能未实现");
           break;
      case 9:
           System.out.println("本模块功能未实现");
           break;
      case 10:
           System.out.println("本模块功能未实现");
           break;
      case 11:
           System.out.println("本模块功能未实现");
           break;
      case 0:
           System.out.println("本模块功能未实现");
           break;
    }
  }
}
