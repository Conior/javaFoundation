/**
153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数
*/
class Task2_6{
  public static void main(String[] args){
    int bai = 0;			//百位
    int shi = 0;			//十位
    int ge = 0;				//个位
    int num = 0;			//三位数
    int result = 0;			//水仙花数

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