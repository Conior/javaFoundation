/**
循环语句
1、输出图形：***********************（共20行）
2、输出图形：第i行有i个*（共20行）
*/
class Model3_6_1{
  public static void main(String[] args){
    int i = 0;					//行数
    int j = 0;					//“*”个数

    /*第一个图像*/
    while(i<=20){
      System.out.println("********************");
      i++;
    }

    System.out.println();

    /*第二个图形*/
    for(i=0;i<=20;i++){				//循环遍历行
      for(j=0;j<=i;j++){			//循环遍历每行“*”个数
        System.out.print("*");
      }
      System.out.println();
    }
  }
}