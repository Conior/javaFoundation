//Ƕ��if���
import java.util.Scanner;
class Model3_1_2{
	public static void main(String[] args){
		double score = -1;				//����
		int grade = 0;					//�꼶
		Scanner input = new Scanner(System.in);
		System.out.print("������ɼ���");
		score = input.nextDouble();
		if(score>=80){					//���if���
			System.out.print("�������꼶��");
			grade = input.nextInt();
			if(grade == 5){				//�ڲ�if���
				System.out.println("�㽫�μ����꼶��ѧ������");
			}else if(grade == 6 ){
				System.out.println("�㽫�μ����꼶��ѧ������");
			}else{
				System.out.println("��������ȷ���꼶��");
			}
		}else{
			System.out.println("���ܲμ���ѧ������");
		}
	}
}