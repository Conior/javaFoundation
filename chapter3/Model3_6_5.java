/**
˫��forѭ��
�������1~100֮�������
*/

class Model3_6_5{
  public static void main(String[] args){
    System.out.print("1~100֮��������У�");
    for(int i=2;i<=100;i++){
      for(int j=2;j<=i;j++){
        if(i%j==0 && i!=j ){				//����
	  break;
	}
        if(i%j==0 && i==j){				//����
	  System.out.print(" " + i + " ");
	}
      }
    }
  }
}