/**
153��һ���ǳ��������������������ÿλ���ֵ������ͣ���153=1*1*1+5*5*5+3*3*3���������������������������λʮ������
*/
class Task2_6{
  public static void main(String[] args){
    int bai = 0;			//��λ
    int shi = 0;			//ʮλ
    int ge = 0;				//��λ
    int num = 0;			//��λ��
    int result = 0;			//ˮ�ɻ���

    for(bai = 0;bai<10;bai++){
      for(shi = 0;shi<10;shi++){
        for(ge = 0;ge<10;ge++){
	  result = bai*bai*bai + shi*shi*shi + ge*ge*ge;
	  num = 100*bai + 10*shi +ge;
	  if((result==num) && ((result>=100) && (result<=999))){
	    System.out.println(result);
	  }
	}
      }
    }
  }
}