//位运算符
class Model2_14 
{
	public static void main(String[] args) 
	{
		int a =129;													//二进制10000001
		int b =128;													//二进制10000000
		System.out.println("a和b按位与的结果是：" + (a&b));			//按位与的结果为10000000
		System.out.println("a和b按位或的结果是：" + (a|b));			//按位或的结果为10000001


		//Integer.toBinaryString()方法是将数据按二进制的格式输出
		System.out.println("a按位非的结果是：" + Integer.toBinaryString((~a)));		
		System.out.println("a和b按位异或的结果是：" + (a^b));

		
//		移位运算
		int c = 5;
		//使用性能最好的方法计算出5×8的结果
		int rst = c<<3;
		//整数每左移一位，相当于×2；右移一位，相当于÷2
		System.out.println("5左移三位的结果是：" + rst );
	}
}
