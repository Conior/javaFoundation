/**
����
����
��һ���������У�2/1��3/2��5/3��8/5��13/8��21/13��������������е�ǰ20���

������
�ӵڶ������ֿ�ʼ��������ǰһ�����ķ������ĸ֮�ͣ���ĸ��ǰһ�����ķ���
���ӵڶ�������ʼ��
	����x/y�У�
		a=x
		x=x+y
		y=a
		��Ϊx��һֱ�仯�ģ�����yҲ���ű仯�����Ը���x��a
		
*/
 
 class Test4_4{
	 public static void main(String[] args){
		 System.out.println("����һ");
		 method1();
		 System.out.println("������");
		 method2();
		 System.out.println("������");
		 method3();
	 }


	/*����һ*/
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
		System.out.println("������е�ǰ20���Ϊ��" + sum);
	}

	/*����һ*/
	public static void method2(){
		int [] arr = new int [21];			//����ĵ�i-1�����ڱ������еĵ�i��ķ�ĸ
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
		System.out.println("������е�ǰ20���Ϊ��" + sum);
	 }

	/*����һ*/
	public static void method3(){
		int [] fz = new int [20];					//����
		int [] fm = new int [20];					//��ĸ
		double [] result = new double [20];			//����ֵ
		fz [0] = 2;
		fz [1] = 3;
		fm [0] = 1;
		fm [1] = 2;
		double sum = 3.5;							//��

		for(int i = 2;i<20;i++){
			fz[i] = fz[i-1] + fz[i-2];
			fm[i] = fm[i-1] + fm[i-2];
			result[i] = (double)fz[i] / fm[i];
			sum = sum + result[i];
		}
		System.out.println("������е�ǰ20���Ϊ��" + sum);
	 }


 }