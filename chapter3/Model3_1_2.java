//嵌套if语句
import java.util.Scanner;
class Model3_1_2{
	public static void main(String[] args){
		double score = -1;				//分数
		int grade = 0;					//年级
		Scanner input = new Scanner(System.in);
		System.out.print("请输入成绩：");
		score = input.nextDouble();
		if(score>=80){					//外层if语句
			System.out.print("请输入年级：");
			grade = input.nextInt();
			if(grade == 5){				//内层if语句
				System.out.println("你将参加五年级数学竞赛！");
			}else if(grade == 6 ){
				System.out.println("你将参加六年级数学竞赛！");
			}else{
				System.out.println("请输入正确的年级！");
			}
		}else{
			System.out.println("不能参加数学竞赛！");
		}
	}
}