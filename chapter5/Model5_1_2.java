/*
String类连接字符串与比较字符串
*/
class Model5_1_2{
	public static void main(String[] args){
		//1.连接字符串
		//使用“+”进行字符串连接
		System.out.println("使用'+'进行字符串连接：");
		String s1 = "您好";
		s1 = s1 + "江老师！";
		System.out.println(s1);

		//使用String public concat(String str) 方法连接
		System.out.println("使用String public concat(String str) 方法连接");
		String s2 = "您好";
		s2 = s2.concat("江老师！");
		System.out.println(s2);



		//2.比较字符串
		String s3 = "java基础";
		String s4 = "java基础";
		System.out.println(s3==s4);					//ture
		System.out.println(s3.equals(s4));			//true

		String s5 = new String("java基础");
		String s6 = new String("java基础");
		System.out.println(s5==s6);					//false
		System.out.println(s5.equals(s6));			//true

		System.out.println(s3==s5);					//false
		System.out.println(s3.equals(s5));			//true
	}
}