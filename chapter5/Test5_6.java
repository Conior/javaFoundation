/**
String类
定义字符串九寨沟，三亚，昆明，黄山，使用split方法输出“我想去九寨沟”，“我想去三亚”…………
*/

class Test5_6{
	public static void main(String[] args){
		String address1 = "九寨沟,三亚,昆明,黄山";
		System.out.println("****原字符串****");
		System.out.println(address1);
		System.out.println("****拆分后字符串****");
		String[] address2 = address1.split(",");
		for(int i=0;i<address2.length;i++){
			System.out.println("我想去" + address2[i]);
		}
	}
}