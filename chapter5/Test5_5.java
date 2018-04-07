/**
String类
需求：完成java工程师注册功能
	（1）用户名长度不能小于6
	（2）密码长度不能小于8
	（3）两次输入的密码必须一致
*/

import java.util.Scanner;
class Test5_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		do{
			System.out.print("请输入用户名：");
			String userName = sc.next();
			System.out.print("请输入密码：");
			String password1 = sc.next();
			System.out.print("请确认密码：");
			String password2 = sc.next();
			if(userName.length()>=6 && password1.length()>=8 && password1.equals(password2)){
				status = true;
			}else if(userName.length()<6 || password1.length()<8){
				System.out.println("用户名长度不能小于6，密码长度不能小于8！请重新注册！");
			}else if(!password1.equals(password2)){
				System.out.println("两次密码输入不一致！请重新注册");
			}
		}while(status==false);
		System.out.println("注册成功！");
	}
}