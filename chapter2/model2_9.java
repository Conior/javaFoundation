//成员变量与局部变量
class model2_9
{
	static float varQ = 9.1F;   //定义成员变量
	{
		int varB = 10;         //定义局部变量
		System.out.println("varB=" + varB);
		System.out.println("varQ=" + varQ);
	}
	public static void main(String[] args){
		int varL = 8;
		System.out.println("varL=" + varL);
		System.out.println("varQ=" + varQ);
//		System.out.println("varB=" + varB);
	}
	float varT = varQ + 1.0F;
}