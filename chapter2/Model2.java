class Model2 
{
	public static void main(String[] args) 
	{


	 //������ϰ
	 final int STU_AGE = 22;
	 System.out.println(STU_AGE);

//	 STU_AGE = 27;         //�����޸�
//	 System.out.println(STU_AGE);




	//������ϰ

//	long maxNum = 9999999999;   //����int�������ֵ
//	System.out.println(maxNum);

	long maxNum = 9999999999L;
	System.out.println(maxNum);



	//��������ϰ
	System.out.println("float��Сֵ="+Float.MIN_VALUE);
	System.out.println("float���ֵ="+Float.MAX_VALUE);

	System.out.println("double��Сֵ="+Double.MIN_VALUE);
	System.out.println("double���ֵ="+Double.MAX_VALUE);




	//�ַ�����ϰ
	char eChar = 'q';
	char cChar = '��';
	System.out.println("��ʾ����:" + cChar);
	char tChar = '\u0061';
	System.out.println("Unicode����0061������ַ�Ϊ��" + tChar);
	char fChar = '\t';
	System.out.println(fChar + "Unicode����0061���ַ�Ϊ��" + tChar);





	//������������ת��
	int i1 = 222;
	int i2 = 333;
	double d1 = (i1+i2)*2.9;             //ת����double��������
	float f1 = (float)((i1+i2)*2.9);     //��double��ת����float�ͣ�ǿ������ת��
	System.out.println(d1);
	System.out.println(f1);

	byte b1 = 88;
	byte b2 = 99;
	byte b3 = (byte)(b1+b2);            //������
	System.out.println("88+99="+b3);
	
	double d2 = 5.1E88;
	float f2 = (float)d2;               //������
	System.out.println(f2);
	
	float f3 = 3.14F;
	f3 = f3 + 0.05F;
	System.out.println("3.13F+0.05F = " + f3);
	}
}
