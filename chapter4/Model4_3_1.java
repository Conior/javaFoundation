/**
数组
需求：
1、输入java工程师底薪，并计算出底薪大于6k的高薪人员比例以及这些高薪人员的底薪平均值
2、可以查看相应序号的工程师底薪
*/
import java.util.Scanner;
class Model4_3_1{
	static int ordNum = 1;								//工程师序号
	static int index = 0;								//要查询的工程师的序号
	static double [] basSalary = new double [10];		//声明并创建数据保存工程师底薪
	static Scanner sc = new Scanner(System.in);
	static int count = 0;								//高薪工程师人数
	static double percentage = 0;						//高薪人员比例
	static double sumBasSalary = 0;						//工程师总底薪


	public static void main(String[] args){
		addBasSalary();
		selBasSalary();
		
	}

	/*录入java工程师底薪*/
	public static void addBasSalary(){

		/*循环遍历输入java工程师底薪*/
		for(ordNum = 1;ordNum<=10;ordNum++){ 
			System.out.print("请输入第" + ordNum + "个工程师的底薪：");
			basSalary[ordNum-1] = sc.nextDouble();
			if(basSalary[ordNum-1]>=6000){
				sumBasSalary += basSalary[ordNum-1];	//统计高薪人员总底薪
				count++;								//统计高薪人数
			}
		}
		percentage = (count/10.0)*100;
		System.out.println("10个java工程师中，高薪人员比例为：" + percentage + "%");
		System.out.println("高薪人员平均底薪为：" + sumBasSalary/count);	
	}
	
	/*查询指定序号的工程师底薪*/
	public static void selBasSalary(){
		System.out.print("请输入你需要获取第几个工程师的底薪：");
		index = sc.nextInt();
		System.out.println("第"+ index +"个工程师的底薪为："+ basSalary[index-1]);
//		return order;
	}
}