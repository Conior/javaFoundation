/**从键盘上输入两个整数，由用户回答题目的和，差，积，商，取余的结果，并统计用户正确回答的个数*/
import java.util.Scanner;
class Task2_1{
  public static void main(String[] args){
    int a = 0;					//定义第一个数字
    int b = 0;					//定义第二个数字
    int c = 0;					//定义用户回答正确的个数
    int sum = 0;				//定义两个数字的标准和
    int difference = 0;				//定义两个数字的标准差
    int product = 0;				//定义两个数字的标准积
    double quotient = 0;			//定义两个数字的标准商
    int remainder = 0;				//定义两个数字的标准取余
    int admSum = 0;				//定义用户输入的和
    int admDif = 0;				//定义用户输入的差
    int admPro = 0;				//定义用户输入的积
    double admQuo = 0;				//定义用户输入的商
    int admRem = 0;				//定义用户输入的取余

    Scanner input = new Scanner(System.in);

    /*用户输入计算结果*/
    System.out.print("请输入数字a：");
    a = input.nextInt();
    System.out.print("请输入数字b：");
    b = input.nextInt();
    System.out.print("请输入a+b的和：");
    admSum = input.nextInt();
    System.out.print("请输入a-b的差：");
    admDif = input.nextInt();
    System.out.print("请输入a×b的积：");
    admPro = input.nextInt();
    System.out.print("请输入a÷b的商：");
    admQuo = input.nextDouble();
    System.out.print("请输入a÷b的余数：");
    admRem = input.nextInt();

    /*计算标准答案*/
    sum = a+b;
    difference = a-b;
    product = a*b;
    quotient = a/b;
    remainder =a%b;

    /*答案验证*/
    if(admSum == sum){c++;}
    if(admDif == difference){c++;}
    if(admPro == product){c++;}
    if(admQuo == quotient){c++;}
    if(admRem == remainder){c++;}

    /*统计作答结果*/
    System.out.println("你答对了" + c + "道题目！");
  }
}