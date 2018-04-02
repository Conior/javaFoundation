/**if语句的使用*/
import java.util.Scanner;
class Model3_1_1{
	public static void main(String[] args){
		int JavaScore = -1;		//java成绩
		int WebScore =-1;		//web成绩
		double AvgScore = 0;		//平均成绩

		Scanner input = new Scanner (System.in);
		System.out.print("请输入Java成绩:");
		JavaScore = input.nextInt();
		System.out.println((JavaScore>=60)?"合格":"不合格");

		System.out.print("请输入Web成绩：");
		WebScore = input.nextInt();
		if(WebScore>=60){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
		
		/*逻辑运算符的应用*/
		if((JavaScore>=60)&&(WebScore>=60)){
			System.out.println("获得java初级工程师认证！");
		}else{
			System.out.println("请继续努力！");
		}

		/*利用if分段*/
		AvgScore = (JavaScore + WebScore) / 2;
		if(AvgScore>=85){
			System.out.println("成绩优秀！");
		}else if(AvgScore>=70){
			System.out.println("成绩良好！");
		}else if(AvgScore>=60){
			System.out.println("成绩合格！");
		}else{
			System.out.println("成绩不合格！");
		}
	}
}