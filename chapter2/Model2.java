class Model2 
{
	public static void main(String[] args) 
	{


	 //常量练习
	 final int STU_AGE = 22;
	 System.out.println(STU_AGE);

//	 STU_AGE = 27;         //不可修改
//	 System.out.println(STU_AGE);




	//整型练习

//	long maxNum = 9999999999;   //超过int类型最大值
//	System.out.println(maxNum);

	long maxNum = 9999999999L;
	System.out.println(maxNum);



	//浮点型练习
	System.out.println("float最小值="+Float.MIN_VALUE);
	System.out.println("float最大值="+Float.MAX_VALUE);

	System.out.println("double最小值="+Double.MIN_VALUE);
	System.out.println("double最大值="+Double.MAX_VALUE);




	//字符型练习
	char eChar = 'q';
	char cChar = '桥';
	System.out.println("显示汉字:" + cChar);
	char tChar = '\u0061';
	System.out.println("Unicode代码0061代表的字符为：" + tChar);
	char fChar = '\t';
	System.out.println(fChar + "Unicode代码0061的字符为：" + tChar);





	//基本数据类型转换
	int i1 = 222;
	int i2 = 333;
	double d1 = (i1+i2)*2.9;             //转换成double类型运算
	float f1 = (float)((i1+i2)*2.9);     //从double型转换成float型，强制类型转换
	System.out.println(d1);
	System.out.println(f1);

	byte b1 = 88;
	byte b2 = 99;
	byte b3 = (byte)(b1+b2);            //结果溢出
	System.out.println("88+99="+b3);
	
	double d2 = 5.1E88;
	float f2 = (float)d2;               //结果溢出
	System.out.println(f2);
	
	float f3 = 3.14F;
	f3 = f3 + 0.05F;
	System.out.println("3.13F+0.05F = " + f3);
	}
}
