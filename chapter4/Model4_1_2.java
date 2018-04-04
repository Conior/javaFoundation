/**
方法的使用
需求：
1.输入数据
2.输出数据
3.退出程序
请选择你的输入（只能输入1、2、3）
说明：
当用户输入1时，执行模块1的功能，执行完毕后，继续输出主界面；
当用户输入2时，执行模块2的功能，执行完毕后，继续输出主界面；
当用户输入3时，则退出程序；
*/

import java.util.Scanner;
class Model4_1_2{
	static int userSel = -1;					//用户输入的参数

	public static void main(String[] args){
		boolean state = true;					//状态

		while(state){
			userSel = showMenu();
			switch(userSel){
				case 1:
					inputData();
					break;
				case 2:
					outData();
					break;
				case 3:
					System.out.println("结束程序！");
					state = false;				//修改状态，不允许再执行循环
					break;
				default:
					System.out.println("输入不正确！");
			}
			System.out.println();
		} 
	}

	/*主程序界面*/
	public static int showMenu(){
		System.out.println("1.输入数据");
		System.out.println("2.输出数据");
		System.out.println("3.退出程序");
		System.out.print("请选择你的输入（只能输入1、2、3）：");
		Scanner input = new Scanner(System.in);
		userSel = input.nextInt();
		return userSel;
	}

	/*模块1  输入数据功能*/
	public static void inputData(){
		System.out.println("执行1.输入数据模块");
		System.out.println("******************");
		System.out.println("******************");
	}

	/*模块2  输出数据功能*/
	public static void outData(){
		System.out.println("执行2.输出数据模块");
		System.out.println("******************");
		System.out.println("******************");
	}

}