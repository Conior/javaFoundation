/**
String��
������������ύ����
��1����Ҫ��������ļ������ļ���������.docx��β
��2����Ҫ���������ķ��������䣬������������@���͡�.�����ҡ�.���ڡ�@��֮��
*/

import java.util.Scanner;
class Test5_7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean status = false;			
		do{
			System.out.print("�����������ļ������ļ���������.docx��β����");
			String fileName = sc.next();
			System.out.print("������������ķ��������䣺");
			String email = sc.next();
			int start1 = email.indexOf("@");			//��@��������λ��
			int start2 = email.indexOf(".");			//��.��������λ��
			if(fileName.endsWith(".docx") && start1>=0 && start2>=0 && start1<start2){
				status = true;
			}else if(!fileName.endsWith(".docx")){		//�ж��ļ�����ʽ�Ƿ���ȷ
				System.out.println("�ļ�����Ч��");
				System.out.println("�����ύʧ�ܣ�");
			}else if(start1<0 || start2<0 || start1>start2){	//�ж������ʽ�Ƿ���ȷ
				System.out.println("������Ч��");
				System.out.println("�����ύʧ�ܣ�");
			}
		}while(status==false);
		System.out.println("�����ύ�ɹ���");

	}
}