//λ�����
class Model2_14 
{
	public static void main(String[] args) 
	{
		int a =129;													//������10000001
		int b =128;													//������10000000
		System.out.println("a��b��λ��Ľ���ǣ�" + (a&b));			//��λ��Ľ��Ϊ10000000
		System.out.println("a��b��λ��Ľ���ǣ�" + (a|b));			//��λ��Ľ��Ϊ10000001


		//Integer.toBinaryString()�����ǽ����ݰ������Ƶĸ�ʽ���
		System.out.println("a��λ�ǵĽ���ǣ�" + Integer.toBinaryString((~a)));		
		System.out.println("a��b��λ���Ľ���ǣ�" + (a^b));

		
//		��λ����
		int c = 5;
		//ʹ��������õķ��������5��8�Ľ��
		int rst = c<<3;
		//����ÿ����һλ���൱�ڡ�2������һλ���൱�ڡ�2
		System.out.println("5������λ�Ľ���ǣ�" + rst );
	}
}
