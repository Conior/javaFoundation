/**
ֵ���������ô���
*/
class Model4_3_3{
	public static void main(String[] args){
		int engNo1 = 1001;
		int engNo2 = 1002;
		System.out.println("ֵ���ݽ�����ֵ��");
		System.out.println("����ֵ����֮ǰ������ʦ1�ı��Ϊ" + engNo1 + "\t" + "����ʦ2�ı��Ϊ��" + engNo2);
		exchange1(engNo1,engNo2);
		System.out.println("����ֵ����֮�󣺹���ʦ1�ı��Ϊ" + engNo1 + "\t" + "����ʦ2�ı��Ϊ��" + engNo2);

		int [] engNo = new int [2];
		engNo[0] = 1001;
		engNo[1] = 1002;
		System.out.println("���ô��ݴ��ݽ�����ֵ��");
		System.out.println("�������ô���֮ǰ������ʦ1�ı��Ϊ" + engNo[0] + "\t" + "����ʦ2�ı��Ϊ��" + engNo[1]);
		exchange2(engNo);
		System.out.println("�������ô���֮�󣺹���ʦ1�ı��Ϊ" + engNo[0] + "\t" + "����ʦ2�ı��Ϊ��" + engNo[1]);

	}
	
	/*ֵ���ݣ�����int��a��b����ֵ*/
	public static void exchange1(int a,int b){
		int temp = a;
		a = b;
		b = temp ;
	}

	/*���ô��ݣ���������x�ĵ�1���͵�2��Ԫ�ص�ֵ*/
	public static void exchange2(int[] x){
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}
}