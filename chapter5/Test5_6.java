/**
String��
�����ַ�����կ�������ǣ���������ɽ��ʹ��split�������������ȥ��կ������������ȥ���ǡ���������
*/

class Test5_6{
	public static void main(String[] args){
		String address1 = "��կ��,����,����,��ɽ";
		System.out.println("****ԭ�ַ���****");
		System.out.println(address1);
		System.out.println("****��ֺ��ַ���****");
		String[] address2 = address1.split(",");
		for(int i=0;i<address2.length;i++){
			System.out.println("����ȥ" + address2[i]);
		}
	}
}