/**
��ά����
¼��ѧ�����Ƴɼ���Ȼ���������Ŀ��ƽ���ɼ�
*/

import java.util.Scanner;
class Model4_5_1{
	public static void main(String[] args){
		int i = 0;														//��Ŀ�±�
		int j = 0;														//ѧ���±�
		String [] course = {"java����","ǰ�˼���","��˼���"};			//�洢��Ŀ��һά����
		String [] name = {"����","������","���컪","�׾�"};				//�洢ѧ����һά����
		double [] [] score = new double [3] [4];						//���ѧ�����Ƴɼ��Ķ�ά����
		double [] sumScore = {0,0,0};									//�����ܳɼ�
		double allScore = 0;											//����ѧ���ܳɼ�
		Scanner sc = new Scanner(System.in);

		/*¼�����ѧ�����Ƴɼ�*/
		for(i=0;i<3;i++){
			for(j=0;j<4;j++){
				System.out.print("������ѧ��"  + name[j] + "ѧ��" + course[i] + "�ĳɼ�:");
				score[i][j] = sc.nextDouble();
				sumScore[i] += score[i][j];
			}
			allScore = allScore + sumScore[i];
		}

		/*��������ܳɼ�*/
		for(i=0;i<3;i++){
			System.out.println("��Ŀ" + course[i] + "��ƽ���ɼ���" + sumScore[i]/4);
		}
		System.out.println("��ƽ���ɼ�:" + allScore/12);
	}
}