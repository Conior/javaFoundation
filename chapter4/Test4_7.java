/**
1����ɵڶ���ģ�顰ɾ��java����ʦ���ϡ���ʵ���ǰ�java����ʦ�����Ϣ����Ϊ��ʼֵ��Ҳ��Ҫ���¹������������ʵ�ʹ�����������н����Ϊ��ʼֵ
2����ɵ�����ģ�顰��ѯjava����ʦ���ϡ���ʵ���ǰ�java����ʦ��������������Ա��ѧ������������֣�Ҫ�����ʵ���֣�����ʾ�¹�����ɷ�������ʵ�ʹ�����������н
3����ɵ��ĸ�ģ�顰�޸�java����ʦ���ϡ���Ҫ�������ԭʼ��Ϣ��Ȼ�������û������µ���Ϣ���Ա��ѧ�������ʵ���֣����޸��¹�����ɷ�������ʵ�ʹ�����������н
*/

import java.util.Scanner;
class Test4_7{
	static Scanner input = new Scanner(System.in);
	static int engNo = 0;							//����ʦ���
	static String engName = "";						//����ʦ����
	static int engSex = 0;							//����ʦ�Ա�1�����У�2����Ů��ֻ������1��2��
	static int engEdu = 0;							//����ʦѧ����1�����ר��2�����ƣ�3���� ˶ʿ��4����ʿ��5����������ֻ������1��2��3��4��5��
    static double basSalary = 0;					//����ʦ��н
    static double insurance = 0;					//��Ӧ�۱�����
	static double engSalary = 0.0;					//java����ʦ��н
	static int comResult = 0;						//�¹��������
    static double workDay = 0;						//ʵ�ʹ�������
	static boolean status = false;					//����1ģ��״̬


	public static void main(String[] args){
		int choose = -1;							//����ѡ��
		boolean state = true;						//������״̬    

    /*������ѡ��*/
		do{
			System.out.println("-------------------------------");
			System.out.print("|      ");
			System.out.print("java����ʦ����ϵͳ");
			System.out.println("      |");
			System.out.println("-------------------------------");
			System.out.println("1.����java����ʦ����");
			System.out.println("2.ɾ��ָ��java����ʦ����");
			System.out.println("3.��ѯjava����ʦ����");
			System.out.println("4.�޸�java����ʦ����");
			System.out.println("5.����java����ʦ��н");
			System.out.println("6.��������ӵĹ���ʦ����");
			System.out.println("7.��java����ʦ��Ϣ����1�������2��������");
			System.out.println("8.�������java����ʦ��Ϣ");
			System.out.println("9.�������java����ʦ����");
			System.out.println("10.��ӡjava����ʦ�����ݱ���");
			System.out.println("11.���ļ�����java����ʦ����");
			System.out.println("0.�������༭����ʦ��Ϣ����ʾ���棩");
			System.out.print("����������ѡ��");
			choose = input.nextInt();

      /*�û�ѡ��*/ 
			switch(choose){
				case 1:
						addEng();  
						break;
				case 2:
						delEng();
						break;
				case 3:
						selEng();
						break;
				case 4:
						altEng();
						break;
				case 5:
						comSalary();
						break;
				case 6:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 7:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 8:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 9:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 10:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 11:
						System.out.println("��ģ�鹦��δʵ��");
						break;
				case 0:
						System.out.println("���������");
						state = false;					//�ı�״̬
						break;
			}
		}while(state);
	}
	
	
	
	
	
	/*1.���java����ʦ����ģ��*/
	public static void addEng(){
		/*�ж������java����ʦ�����Ƿ��Ѿ�¼��*/
		if(status == true){
			System.out.println("������java����ʦ���ϣ���ѡ���������ܣ�");
		}
		while(status == false){
			System.out.println("����������java����ʦ���ϣ�");
			System.out.print("������java����ʦ�ı�ţ�");
			engNo = input.nextInt();
			/*�ж������java����ʦ����Ƿ�Ϊ����*/
			if(engNo<=0){
				System.out.println("���ֻ��Ϊ�����������������룡");
				continue ;
			}
			System.out.print("������java����ʦ��������");
			engName = input.next();
			System.out.print("������java����ʦ���Ա�1�����У�2����Ů��ֻ������1��2����");
			engSex = input.nextInt();
			/*�ж������java����ʦ�Ա��Ƿ�Ϸ�*/
			if(engSex!=1 && engSex!=2){
				System.out.println("��������ȷ���Ա�");
				continue ;
			}
			System.out.print("������java����ʦ��ѧ����1�����ר��2�����ƣ�3���� ˶ʿ��4����ʿ��5����������ֻ������1��2��3��4��5����");
			engEdu = input.nextInt();
			/*�ж������java����ʦѧ���Ƿ�Ϸ�*/
			if(engEdu!=1 && engEdu!=2 && engEdu!=3 && engEdu!=4 && engEdu!=5){
				System.out.println("��������ȷ��ѧ����");
				continue ;
			}
			System.out.print("������java����ʦ�ĵ�н��");
			basSalary = input.nextDouble();
			/*�ж������java����ʦ��н�Ƿ�Ϸ�*/
			if(basSalary<0){
				System.out.println("��н����Ϊ�������������룡");
				continue ;
			}
			System.out.print("������java����ʦ����Ӧ�۱�������");
			insurance = input.nextDouble();
			/*�ж������java����ʦ��Ӧ�۱����Ƿ�Ϸ�*/
			if(insurance<0){
				System.out.println("��Ӧ�۱��ղ���Ϊ�������������룡");
				continue ;
			}
			status = true ;					//java����ʦ��Ϣ¼�룬�ı�¼��״̬
			System.out.println("java����ʦ��Ϣ��ӳɹ���");
		}	
	}

	
	
	
	/*2.ɾ��ָ��java����ʦ����ģ��*/
	public static void delEng(){
		if(status==false){
			System.out.println("��java����ʦ��Ϣ�����������Ϣ��");
		}else{
			engNo = 0;							//����ʦ���
			engName = "";						//����ʦ����
			engSex = 0;							//����ʦ�Ա�1�����У�2����Ů��ֻ������1��2��
			engEdu = 0;							//����ʦѧ����1�����ר��2�����ƣ�3���� ˶ʿ��4����ʿ��5����������ֻ������1��2��3��4��5��
			basSalary = 0;						//����ʦ��н
			insurance = 0;						//��Ӧ�۱�����
			engSalary = 0.0;					//java����ʦ��н
			comResult = 0;						//�¹��������
			workDay = 0;						//ʵ�ʹ�������
			status = false;						//�ı乤��ʦ¼������״̬
			System.out.println("java����ʦ������ɾ����");
		}
	}

	
	
	
	/*3.��ѯjava����ʦ����ģ��*/
	public static void selEng(){
		if(status==false){
			System.out.println("��java����ʦ��Ϣ�����������Ϣ��");
		}else{
			System.out.println("java����ʦ��ţ�" + engNo);
			System.out.println("java����ʦ������" + engName);
			if(engSex == 1){
				System.out.println("java����ʦ�Ա���");
			}else{
				System.out.println("java����ʦ�Ա�Ů");
			}
			switch(engEdu){
				case 1:
					System.out.println("java����ʦѧ������ר");
					break;
				case 2:
					System.out.println("java����ʦѧ��������");
					break;
				case 3:
					System.out.println("java����ʦѧ����˶ʿ");
					break;
				case 4:
					System.out.println("java����ʦѧ������ʿ");
					break;
				case 5:
					System.out.println("java����ʦѧ��������");
					break;
			}
			System.out.println("java����ʦ��н��" + basSalary);
			System.out.println("java����ʦ��Ӧ�۱�������" + insurance);
			System.out.println("java����ʦ��Ϣ��ѯ��ϣ�");
		}
	}


	
	
	
	/*4.�޸�java����ʦ����ģ��*/
	public static void altEng(){
		if(status==false){
			System.out.println("��java����ʦ��Ϣ�����������Ϣ��");
		}
		while(status==true){
			System.out.print("ԭ��java����ʦ����ǣ�" + engNo + "\t" + "�������޸ĺ�ı�ţ�");
			engNo = input.nextInt();
			/*�ж������java����ʦ����Ƿ�Ϊ����*/
			if(engNo<=0){
				System.out.println("���ֻ��Ϊ�����������������룡");
				continue ;
			}
			System.out.print("ԭ��java����ʦ�����ǣ�" + engName + "\t" + "�������޸ĺ��������");
			engName = input.next();
			System.out.print("ԭ��java����ʦ�Ա��ǣ�" + (engSex==1?"��":"Ů") + "\t" + "�������޸ĺ���Ա�1�����У�2����Ů��ֻ������1��2����");
			engSex = input.nextInt();
			/*�ж������java����ʦ�Ա��Ƿ�Ϸ�*/
			if(engSex!=1 && engSex!=2){
				System.out.println("��������ȷ���Ա�");
				continue ;
			}
			switch(engEdu){
				case 1:
					System.out.print("ԭ��java����ʦѧ���ǣ���ר" + "\t");	
					break;
				case 2:
					System.out.print("ԭ��java����ʦѧ���ǣ�����" + "\t");
					break;
				case 3:
					System.out.print("ԭ��java����ʦѧ���ǣ�˶ʿ" + "\t");
					break;
				case 4:
					System.out.print("ԭ��java����ʦѧ���ǣ���ʿ" + "\t");
					break;
				case 5:
					System.out.print("ԭ��java����ʦѧ���ǣ�����" + "\t");
					break;
			}
			System.out.print("�������޸ĺ�java����ʦ��ѧ����1�����ר��2�����ƣ�3���� ˶ʿ��4����ʿ��5����������ֻ������1��2��3��4��5����");
			engEdu = input.nextInt();
			/*�ж������java����ʦѧ���Ƿ�Ϸ�*/
			if(engEdu!=1 && engEdu!=2 && engEdu!=3 && engEdu!=4 && engEdu!=5){
				System.out.println("��������ȷ��ѧ����");
				continue;
			}
			System.out.print("ԭ��java����ʦ��н�ǣ�" + basSalary + "\t" + "�������޸ĺ�ĵ�н��");
			basSalary = input.nextDouble();
			/*�ж������java����ʦ��н�Ƿ�Ϸ�*/
			if(basSalary<0){
				System.out.println("��н����Ϊ�������������룡");
				continue ;
			}
			System.out.print("ԭ��java����ʦ��Ӧ�۱������ǣ�" + insurance + "\t" + "�������޸ĺ��Ӧ�۱�������");
			insurance = input.nextDouble();
			/*�ж������java����ʦ��Ӧ�۱����Ƿ�Ϸ�*/
			if(insurance<0){
				System.out.println("��Ӧ�۱��ղ���Ϊ�������������룡");
				continue ;
			}
			break;
		}
		System.out.println("java����ʦ��Ϣ�޸ĳɹ���");
	}

	
	
	
	/*5.����java����ʦ��нģ��*/
	public static void comSalary(){
		if(status==false){
			System.out.println("��java����ʦ��Ϣ�����������Ϣ��");
		}else{
			System.out.print("������java����ʦ����ɷ�������СֵΪ0�����ֵΪ150����");
 			comResult = input.nextInt();
			System.out.print("������java����ʦʵ�ʹ���������");
			workDay = input.nextDouble();
			engSalary = basSalary + basSalary*0.25*comResult/100 + workDay*15 - insurance;			//����java����ʦ��н
			System.out.println("java����ʦ��нΪ��" + engSalary);
			System.out.println("java����ʦ��н������ϣ�");
		}
	}

}