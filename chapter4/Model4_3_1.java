/**
����
����
1������java����ʦ��н�����������н����6k�ĸ�н��Ա�����Լ���Щ��н��Ա�ĵ�нƽ��ֵ
2�����Բ鿴��Ӧ��ŵĹ���ʦ��н
*/
import java.util.Scanner;
class Model4_3_1{
	static int ordNum = 1;								//����ʦ���
	static int index = 0;								//Ҫ��ѯ�Ĺ���ʦ�����
	static double [] basSalary = new double [10];		//�������������ݱ��湤��ʦ��н
	static Scanner sc = new Scanner(System.in);
	static int count = 0;								//��н����ʦ����
	static double percentage = 0;						//��н��Ա����
	static double sumBasSalary = 0;						//����ʦ�ܵ�н


	public static void main(String[] args){
		addBasSalary();
		selBasSalary();
		
	}

	/*¼��java����ʦ��н*/
	public static void addBasSalary(){

		/*ѭ����������java����ʦ��н*/
		for(ordNum = 1;ordNum<=10;ordNum++){ 
			System.out.print("�������" + ordNum + "������ʦ�ĵ�н��");
			basSalary[ordNum-1] = sc.nextDouble();
			if(basSalary[ordNum-1]>=6000){
				sumBasSalary += basSalary[ordNum-1];	//ͳ�Ƹ�н��Ա�ܵ�н
				count++;								//ͳ�Ƹ�н����
			}
		}
		percentage = (count/10.0)*100;
		System.out.println("10��java����ʦ�У���н��Ա����Ϊ��" + percentage + "%");
		System.out.println("��н��Աƽ����нΪ��" + sumBasSalary/count);	
	}
	
	/*��ѯָ����ŵĹ���ʦ��н*/
	public static void selBasSalary(){
		System.out.print("����������Ҫ��ȡ�ڼ�������ʦ�ĵ�н��");
		index = sc.nextInt();
		System.out.println("��"+ index +"������ʦ�ĵ�нΪ��"+ basSalary[index-1]);
//		return order;
	}
}