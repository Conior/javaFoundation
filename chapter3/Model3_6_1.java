/**
ѭ�����
1�����ͼ�Σ�***********************����20�У�
2�����ͼ�Σ���i����i��*����20�У�
*/
class Model3_6_1{
  public static void main(String[] args){
    int i = 0;					//����
    int j = 0;					//��*������

    /*��һ��ͼ��*/
    while(i<=20){
      System.out.println("********************");
      i++;
    }

    System.out.println();

    /*�ڶ���ͼ��*/
    for(i=0;i<=20;i++){				//ѭ��������
      for(j=0;j<=i;j++){			//ѭ������ÿ�С�*������
        System.out.print("*");
      }
      System.out.println();
    }
  }
}