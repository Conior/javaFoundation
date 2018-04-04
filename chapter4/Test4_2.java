/**
完成系统模块，第一个模块"输入java工程师资料"功能；
用户按提示逐行输入java工程师信息（月工作完成分数和月实际工作天数再“计算java工程师的月薪”功能）；
如果输入错误，会要求用户从头开始重新输入java工程师资料
*/

import java.util.Scanner;
class Test4_2{
	static Scanner input = new Scanner(System.in);
	static int engNo = 0;							//工程师编号
	static String engName = "";						//工程师姓名
	static int engSex = 0;							//工程师性别（1代表男，2代表女，只能输入1和2）
	static int engEdu = 0;							//工程师学历（1代表大专，2代表本科，3代表 硕士，4代表博士，5代表其他，只能输入1、2、3、4、5）
    static double basSalary = 3000;					//工程师底薪
    static double insurance = 3000 * 0.105;			//月应扣保险数
	static double engSalary = 0.0;					//java工程师月薪
	static int comResult = 0;						//月工作完成数
    static double workDay = 0;						//实际工作天数
	static boolean status = false;					//功能1模块状态


	public static void main(String[] args){
		int choose = -1;							//定义选项
		boolean state = true;						//主程序状态    

    /*主界面选项*/
		do{
			System.out.println("-------------------------------");
			System.out.print("|      ");
			System.out.print("java工程师管理系统");
			System.out.println("      |");
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
			System.out.print("请输入您的选择：");
			choose = input.nextInt();

      /*用户选项*/ 
			switch(choose){
				case 1:
						addEng();  
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
				case 5:
						comSalary();
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
						System.out.println("程序结束！");
						state = false;					//改变状态
						break;
			}
		}while(state);
	}
	
	/*添加java工程师资料模块*/
	public static void addEng(){
		/*判断输入的java工程师资料是否已经录入*/
		if(status == true){
			System.out.println("已输入java工程师资料！请选择其他功能：");
		}
		while(status == false){
			System.out.println("请现在输入java工程师资料：");
			System.out.print("请输入java工程师的编号：");
			engNo = input.nextInt();
			/*判断输入的java工程师序号是否为负数*/
			if(engNo<=0){
				System.out.println("编号只能为正整数，请重新输入！");
				continue ;
			}
			System.out.print("请输入java工程师的姓名：");
			engName = input.next();
			System.out.print("请输入java工程师的性别（1代表男，2代表女，只能输入1和2）：");
			engSex = input.nextInt();
			/*判断输入的java工程师性别是否合法*/
			if(engSex!=1 && engSex!=2){
				System.out.println("请输入正确的性别！");
				continue ;
			}
			System.out.print("请输入java工程师的学历（1代表大专，2代表本科，3代表 硕士，4代表博士，5代表其他，只能输入1、2、3、4、5）：");
			engEdu = input.nextInt();
			/*判断输入的java工程师学历是否合法*/
			if(engEdu!=1 && engEdu!=2 && engEdu!=3 && engEdu!=4 && engEdu!=5){
				System.out.println("请输入正确的学历！");
				continue ;
			}
			System.out.print("请输入java工程师的底薪：");
			basSalary = input.nextDouble();
			/*判断输入的java工程师底薪是否合法*/
			if(basSalary<0){
				System.out.println("底薪不能为负，请重新输入！");
				continue ;
			}
			System.out.print("请输入java工程师的月应扣保险数：");
			insurance = input.nextDouble();
			/*判断输入的java工程师月应扣保险是否合法*/
			if(insurance<0){
				System.out.println("月应扣保险不能为负，请重新输入！");
				continue ;
			}
			status = true ;								//java工程师信息录入，改变录入状态
		}	
	}

	/*计算java工程师月薪模块*/
	public static void comSalary(){
		System.out.print("请输入java工程师月完成分数（最小值为0，最大值为150）：");
 		comResult = input.nextInt();
		System.out.print("请输入java工程师实际工作天数：");
		workDay = input.nextDouble();
		engSalary = basSalary + basSalary*0.25*comResult/100 + workDay*15 - insurance;			//计算java工程师月薪
		System.out.println("java工程师月薪为：" + engSalary);
	}

}