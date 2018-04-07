/**
String类
需求：完成论文提交功能
（1）需要检查论文文件名，文件名必须以.docx结尾
（2）需要检查接受论文反馈的邮箱，邮箱必须包含“@”和“.”，且“.”在“@”之后
*/

import java.util.Scanner;
class Test5_7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean status = false;			
		do{
			System.out.print("请输入论文文件名（文件名必须以.docx结尾）：");
			String fileName = sc.next();
			System.out.print("请输入接受论文反馈的邮箱：");
			String email = sc.next();
			int start1 = email.indexOf("@");			//“@”的索引位置
			int start2 = email.indexOf(".");			//“.”的索引位置
			if(fileName.endsWith(".docx") && start1>=0 && start2>=0 && start1<start2){
				status = true;
			}else if(!fileName.endsWith(".docx")){		//判断文件名格式是否正确
				System.out.println("文件名无效！");
				System.out.println("论文提交失败！");
			}else if(start1<0 || start2<0 || start1>start2){	//判断邮箱格式是否正确
				System.out.println("邮箱无效！");
				System.out.println("论文提交失败！");
			}
		}while(status==false);
		System.out.println("论文提交成功！");

	}
}