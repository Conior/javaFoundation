/**
do...while循环
需求：让用户输入正确的程序密码之后，才可以执行下面的代码，否则继续让用户输入，知道输入正确为止
*/

import java.util.Scanner;
class Model3_6_3{
  public static void main(String[] args){
    String userPass = "";				//用户输入密码
    final String PASSWORD = "123456";			//正确密码
    Scanner input = new Scanner(System.in);

    do{
      System.out.print("请输入正确的密码：");
      userPass = input.nextLine();
    }while(!userPass.equals(PASSWORD));			// ==不仅比较字面值，而且比较存储地址；equals只比较字面值

    System.out.println("密码正确，请继续执行！");
  }
}