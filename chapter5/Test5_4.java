/**
需求：
计算字符串中字符串出现的次数：让用户分别输入字符串和子字符串，输出子字符串出现的次数
*/

import java.util.Scanner;
class Test5_4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;						//统计子字符串在父字符串中出现的次数
		int start = 0;						//索引开始的下标位置
		System.out.print("请输入一个字符串：");
		String s1 = sc.next();
		System.out.print("请输入要查找的字符串：");
		String s2 = sc.next();
		while(s1.indexOf(s2,start)>=0 && start<s1.length()){		//子字符串索引到的位置要大于0，并且索引到的位置要小于父字符串的长度
			count++;
			start = s1.indexOf(s2,start) + s2.length();				//把下一次索引的位置定位到上一次索引完毕之后的位置
		}
		System.out.println(s2 + " 在 " + s1 + " 中出现的次数为：" + count);
	}
}