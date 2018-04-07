/**
java API
1、判断一个字符串是否为空
2、将字符串转化为一个新的字符数组
3、按字典顺序顺序比较两个字符串
*/

class Test5_9{
	public static void main(String[] args){
		//1.判断一个字符串是否为空
		String s1 = "";
		if(s1.isEmpty()){
			System.out.println("这是一个空的字符串！");
		}

		//2.将字符串转化为一个新的字符数组
		String s2 = "像我这样的人,你还见过多少人";
		System.out.println("原字符串为：" + s2);
		char [] s3 = s2.toCharArray();
		System.out.print("转化为字符数组之后,数组的长度为：");
		System.out.println(s3.length);


		/*
		3.按字典顺序顺序比较两个字符串
		其比较规则是：
			拿出字符串的第一个字符与参数的第一个字符进行比较，如果两者不等，比较结束，返回两者的ascii差，即字符串的第一个字符减去参数的第一个字符的ascii码值
			如果两个字符串的长度不同，并且一个字符串与另一个字符串的前面N个字符相等，那么这个方法返回返回两个字符串长度之差
		*/
		String s4 = "abcd";
		String s5 = "abce";
		String s6 = "Abc";
		String s7 = "abcdefg";
		System.out.println(s4.compareTo(s5));			//返回-1
		System.out.println(s4.compareTo(s6));			//返回32
		System.out.println(s7.compareTo(s4));			//返回3
		System.out.println(s7.compareTo(s5));			//返回-1
	}
}