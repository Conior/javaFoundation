/**
String��
�������java����ʦע�Ṧ��
	��1���û������Ȳ���С��6
	��2�����볤�Ȳ���С��8
	��3������������������һ��
*/

import java.util.Scanner;
class Test5_5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean status = false;
		do{
			System.out.print("�������û�����");
			String userName = sc.next();
			System.out.print("���������룺");
			String password1 = sc.next();
			System.out.print("��ȷ�����룺");
			String password2 = sc.next();
			if(userName.length()>=6 && password1.length()>=8 && password1.equals(password2)){
				status = true;
			}else if(userName.length()<6 || password1.length()<8){
				System.out.println("�û������Ȳ���С��6�����볤�Ȳ���С��8��������ע�ᣡ");
			}else if(!password1.equals(password2)){
				System.out.println("�����������벻һ�£�������ע��");
			}
		}while(status==false);
		System.out.println("ע��ɹ���");
	}
}