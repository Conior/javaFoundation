import java.util.Scanner;				//����util��
//���������
class Model2_11 
{
	public static void main(String[] args) 
	{
		int i1 = 10, i2 = 20;
		int i = (i2++);    //�ȸ�ֵ������
		System.out.print("i=" + i +" ");
		System.out.println("i2=" + i2);

		i = (++i2);   //�������ٸ�ֵ
		System.out.print("i=" + i + " ");
		System.out.println("i2=" + i2);

		i = (i1--);    //�ȸ�ֵ���Լ�
		System.out.print("i=" + i + " ");
		System.out.println("i1=" + i1 + " ");

		i = (--i1);    //���Լ��ٸ�ֵ
		System.out.print("i=" + i + " ");
		System.out.println("i1=" + i1 + " ");


		System.out.println("10 % 3 =" + 10 % 3);
		System.out.println("20 % 3 =" + 20 % 3);


		int rst = (21 % 5) > 3 ? 1 : 0 ;
		System.out.println("21��5����������3��" + rst);





//		���㹤��ʦ��н		
//		��н=��н+��ʵ�ʼ�Ч+�²Ͳ�-�±���		
//		��ʵ�ʼ�Ч=�¼�Ч��������н��25%�����¹��������/100		
//		�²Ͳ�=��ʵ�ʹ���������15
		double engSalary = 0.0;						//����ʦ��н
		int basSalary = 3000;						//��н
		int comResult = 100;						//�¹������������СΪ0�����Ϊ150��
		double workDay = 22;						//ʵ�ʹ�������
		double insurance = 3000 * 0.105;			//��Ӧ�۱�����

		Scanner input = new Scanner(System.in);		//�ӿ���̨��ȡ�������
		System.out.println("������java����ʦ�ĵ�н��");
		basSalary = input.nextInt();				//�ӿ���̨��ȡ���롪��������н����ֵ��basSalary
		System.out.println("������java����ʦ�¹�����ɷ�������СΪ0�����Ϊ150����");
		comResult = input.nextInt();				//�ӿ���̨��ȡ���롪�������¹������������ֵ��conResult
		System.out.println("������java����ʦ��ʵ�ʹ���������");
		workDay = input.nextInt();					//�ӿ���̨��ȡ���롪�������¹�����������ֵ��workDay
		System.out.println("������java����ʦ��Ӧ�۱�������");
		insurance = input.nextDouble();				//�ӿ���̨��ȡ���롪��������Ӧ�۱���������ֵ��insurance

		engSalary = basSalary + basSalary * 0.25 * comResult / 100 + workDay * 15 - insurance ;
		System.out.println("java����ʦ����нΪ��" + engSalary);


	} 
}
