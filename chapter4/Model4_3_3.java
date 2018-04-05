/**
值传递与引用传递
*/
class Model4_3_3{
	public static void main(String[] args){
		int engNo1 = 1001;
		int engNo2 = 1002;
		System.out.println("值传递交换数值：");
		System.out.println("调用值传递之前：工程师1的编号为" + engNo1 + "\t" + "工程师2的编号为：" + engNo2);
		exchange1(engNo1,engNo2);
		System.out.println("调用值传递之后：工程师1的编号为" + engNo1 + "\t" + "工程师2的编号为：" + engNo2);

		int [] engNo = new int [2];
		engNo[0] = 1001;
		engNo[1] = 1002;
		System.out.println("引用传递传递交换数值：");
		System.out.println("调用引用传递之前：工程师1的编号为" + engNo[0] + "\t" + "工程师2的编号为：" + engNo[1]);
		exchange2(engNo);
		System.out.println("调用引用传递之后：工程师1的编号为" + engNo[0] + "\t" + "工程师2的编号为：" + engNo[1]);

	}
	
	/*值传递，交换int型a、b的数值*/
	public static void exchange1(int a,int b){
		int temp = a;
		a = b;
		b = temp ;
	}

	/*引用传递，交换数组x的第1个和第2个元素的值*/
	public static void exchange2(int[] x){
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}
}