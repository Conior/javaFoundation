/**
双重for循环
需求：输出1~100之间的质数
*/

class Model3_6_5{
  public static void main(String[] args){
    System.out.print("1~100之间的质数有：");
    for(int i=2;i<=100;i++){
      for(int j=2;j<=i;j++){
        if(i%j==0 && i!=j ){				//合数
	  break;
	}
        if(i%j==0 && i==j){				//质数
	  System.out.print(" " + i + " ");
	}
      }
    }
  }
}