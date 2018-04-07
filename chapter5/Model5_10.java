/**
StringBuffer类
*/

class Model5_10{
	public static void main(String[] args){
		System.out.println("创建StringBuffer对象");
		StringBuffer s1 = new StringBuffer();
		System.out.println("new StringBuffer s1的长度为:" + s1.length());
		StringBuffer s2 = new StringBuffer("刘海龙");
		System.out.println("s2的长度为：" + s2.length());
		System.out.println("s2里面的内容为：" + s2);

		System.out.println("使用append方法在s2后面追加字符串！");
		s2.append(",您好！");
		System.out.println("追加后的s2为：" + s2);
		System.out.println("使用insert方法在s2中间插入字符串！");
		s2.insert(3,"工程师");
		System.out.println("插入后的s2为：" + s2);
	}
}