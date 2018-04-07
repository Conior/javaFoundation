/**
String类常用方法
*/

class Model5_2_1{
	public static void main(String[] args){
		String s1 = "blue bridge";
		String s2 = "Blue Bridge";
		String s3 = "我是学生，我学java";
		String s4 = "20140801刘海龙Resume.docx";
		String s5 = "   20140801刘海龙Resume.docx    ";
		String s7 = "哈哈，今天，很开心，嘻嘻嘻";
		int salary = 16789;

		System.out.println(s1.charAt(1));					//查找s1中第2个字符，结果为l
		System.out.println(s1.length());					//计算s1的长度，结果为11
		System.out.println(s1.indexOf("bridge"));			//查找bridge在s1中的位置，结果为5（从0开始）
		System.out.println(s2.indexOf("bridge"));			//查找bridge在s2中的位置，因为没有，所以结果为-1

		System.out.println(s1.equals(s2));					//比较s1与s2，结果为false
		System.out.println(s1.equalsIgnoreCase(s2));		//忽略大小写比较s1与s2，结果为ture

		System.out.println(s3.replace("我","你"));			//将s3中的“我”替换为“你”


		System.out.println(s4.startsWith("2014"));			//判断s4是不是以“2014”开头，结果为true
		System.out.println(s4.endsWith("docx"));			//判断s4是不是以“docx”结尾，结果为ture
		System.out.println(s4.endsWith("doc"));				//判断s4是不是以“doc”结尾，结果是false
		System.out.println(s4.toUpperCase());				//将s4的字母转为大写
		System.out.println(s4.toLowerCase());				//将s4转为小写
		System.out.println(s4.substring(8));				//从s4的第9个字符开始到结尾截取字符
		System.out.println(s4.substring(8,11));				//从s4的第9个字符开始，第12个结束截取字符

		System.out.println(s5.trim());						//忽略s5字符串前后所有的空格


		System.out.println("月薪为" + salary);
		String s6 = String.valueOf(salary);					//将基本数据类型转化为字符串类型
		System.out.println("月薪为" + s6.length() + "位数");

		String [] s8 = s7.split("，");						//把s8按“，”分割，分割后保存在数组内
		System.out.println(s7 + "分割后为：");
//		System.out.println(s8);								//split()方法只能保存为数组
		for(int i=0;i<s8.length;i++){
			System.out.println(s8[i]);
		}
	}
}