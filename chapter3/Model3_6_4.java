/**
for循环
需求：
1、求出1~1000之间所有奇数的和
2、存放10个java工程师信息，现在需要分别输出这10个工程师的底薪，并计算出底薪大于6k的高薪人员比例以及这些高薪人员的底薪平均值
*/

import java.util.Scanner; 
class Model3_6_4{
  public static void main(String[] args){

    int sum = 0;							//奇数和
    for(int i=1;i<=1000;i=i+2){
      sum += i; 
    }
    System.out.println("1~1000之间所有奇数的和为：" + sum);
    System.out.println();


    double basSalary = 0;						//java工程师底薪
    int i = 0;								//java工程师序号
    int count = 0;							//高薪人数
    double higSalary = 0;						//高薪人员总薪资
    Scanner input = new Scanner(System.in);

    for(i=0;i<10;i++){
      System.out.print("请输入第"+ (i+1) +"个java工程师的底薪：");
      basSalary = input.nextDouble();
      if(basSalary>=6000){
        count = count + 1;						//统计高薪人数
	higSalary += basSalary;						//统计高薪人员底薪总和
      } 
    }

    System.out.println("底薪大于6k的高薪人员比例为：" + (count/10.0)*100 + "%");
    System.out.println("这些高薪人员的底薪平均值为：" + higSalary/count);	    
  }
}