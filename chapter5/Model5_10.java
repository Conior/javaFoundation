/**
StringBuffer��
*/

class Model5_10{
	public static void main(String[] args){
		System.out.println("����StringBuffer����");
		StringBuffer s1 = new StringBuffer();
		System.out.println("new StringBuffer s1�ĳ���Ϊ:" + s1.length());
		StringBuffer s2 = new StringBuffer("������");
		System.out.println("s2�ĳ���Ϊ��" + s2.length());
		System.out.println("s2���������Ϊ��" + s2);

		System.out.println("ʹ��append������s2����׷���ַ�����");
		s2.append(",���ã�");
		System.out.println("׷�Ӻ��s2Ϊ��" + s2);
		System.out.println("ʹ��insert������s2�м�����ַ�����");
		s2.insert(3,"����ʦ");
		System.out.println("������s2Ϊ��" + s2);
	}
}