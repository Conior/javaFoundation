/**
数组
需求：
有一个分数序列：2/1、3/2、5/3、8/5、13/8、21/13，求出求出这个数列的前20项和

分析：
从第二个数字开始：分子是前一个数的分子与分母之和；分母是前一个数的分子
即从第二个数开始：
	分数x/y有：
		a=x
		x=x+y
		y=a
		因为x是一直变化的，所以y也跟着变化，所以复制x给a
		
*/
 
 class Test4_4{
	 public static void main(String[] args){
		 System.out.println("方法一");
		 method1();
		 System.out.println("方法二");
		 method2();
		 System.out.println("方法三");
		 method3();
	 }


	/*方法一*/
	 public static void method1(){
		int fz = 1;
		int fm = 1;
		int temp = 0;
		double sum = 0;
		for(int i = 1;i<=20;i++){
			temp =fz;
			fz = temp+fm;
			fm= temp;
			sum = sum + (double)fz/fm;
		}
		System.out.println("这个数列的前20项和为：" + sum);
	}

	/*方法一*/
	public static void method2(){
		int [] arr = new int [21];			//数组的第i-1项用于保存数列的第i项的分母
		arr[0] = 1;			
		int temp = 2; 
		int a = 0;
		double sum =0;

		for (int i = 0; i<20;i++ ){
			sum = sum + (double)temp/arr[i];
			a = temp;
			temp = temp + arr[i];
			arr[i+1] = a;	
		}
		System.out.println("这个数列的前20项和为：" + sum);
	 }

	/*方法一*/
	public static void method3(){
		int [] fz = new int [20];					//分子
		int [] fm = new int [20];					//分母
		double [] result = new double [20];			//分数值
		fz [0] = 2;
		fz [1] = 3;
		fm [0] = 1;
		fm [1] = 2;
		double sum = 3.5;							//和

		for(int i = 2;i<20;i++){
			fz[i] = fz[i-1] + fz[i-2];
			fm[i] = fm[i-1] + fm[i-2];
			result[i] = (double)fz[i] / fm[i];
			sum = sum + result[i];
		}
		System.out.println("这个数列的前20项和为：" + sum);
	 }


 }