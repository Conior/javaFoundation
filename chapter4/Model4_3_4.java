/**
����
����
1������java����ʦ��н�����������н����6k�ĸ�н��Ա�����Լ���Щ��н��Ա�ĵ�нƽ��ֵ
2������û�ѡ���ĳ������ʦ�ĵ�н
3����н���ڵ���6k�ĸ�н��Ա����н5%
4���Ǹ�н��Ա����н10%
*/
import java.util.Scanner;
class Model4_3_4{
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
		incBasSalary();
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

	/*����ʦ��н*/
	public static void incBasSalary(){
		System.out.println("��н���ڵ���6k�ĸ�н��Ա����н5%;�Ǹ�н��Ա����н10%");
		for(ordNum = 1;ordNum<=10;ordNum++){
			if(basSalary[ordNum-1] >= 6000){
				basSalary[ordNum-1] = basSalary[ordNum-1] * 1.05;
			}else{
				basSalary[ordNum-1] = basSalary[ordNum-1] * 1.1;
			}  
		}
	}
}