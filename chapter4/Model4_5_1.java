/**
二维数组
录入学生各科成绩，然后输出各科目的平均成绩
*/

import java.util.Scanner;
class Model4_5_1{
	public static void main(String[] args){
		int i = 0;														//科目下标
		int j = 0;														//学生下标
		String [] course = {"java基础","前端技术","后端技术"};			//存储科目的一维数组
		String [] name = {"王云","刘静涛","南天华","雷静"};				//存储学生的一维数组
		double [] [] score = new double [3] [4];						//存放学生各科成绩的二维数组
		double [] sumScore = {0,0,0};									//单科总成绩
		double allScore = 0;											//所有学科总成绩
		Scanner sc = new Scanner(System.in);

		/*录入各个学生各科成绩*/
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				System.out.print("请输入学生"  + name[j] + "学生" + course[i] + "的成绩:");
				score[i][j] = sc.nextDouble();
				sumScore[i] += score[i][j];
			}
			allScore = allScore + sumScore[i];
		}

		/*计算各科总成绩*/
		for(i=0;i<3;i++){
			System.out.println("科目" + course[i] + "的平均成绩：" + sumScore[i]/4);
		}
		System.out.println("总平均成绩:" + allScore/12);
	}
}