/**if����ʹ��*/
import java.util.Scanner;
class Model3_1_1{
	public static void main(String[] args){
		int JavaScore = -1;		//java�ɼ�
		int WebScore =-1;		//web�ɼ�
		double AvgScore = 0;		//ƽ���ɼ�

		Scanner input = new Scanner (System.in);
		System.out.print("������Java�ɼ�:");
		JavaScore = input.nextInt();
		System.out.println((JavaScore>=60)?"�ϸ�":"���ϸ�");

		System.out.print("������Web�ɼ���");
		WebScore = input.nextInt();
		if(WebScore>=60){
			System.out.println("�ϸ�");
		}else{
			System.out.println("���ϸ�");
		}
		
		/*�߼��������Ӧ��*/
		if((JavaScore>=60)&&(WebScore>=60)){
			System.out.println("���java��������ʦ��֤��");
		}else{
			System.out.println("�����Ŭ����");
		}

		/*����if�ֶ�*/
		AvgScore = (JavaScore + WebScore) / 2;
		if(AvgScore>=85){
			System.out.println("�ɼ����㣡");
		}else if(AvgScore>=70){
			System.out.println("�ɼ����ã�");
		}else if(AvgScore>=60){
			System.out.println("�ɼ��ϸ�");
		}else{
			System.out.println("�ɼ����ϸ�");
		}
	}
}