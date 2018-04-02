//成员变量与局部变量
class Model2_10 
{
	float varT = 9.1F;   //成员变量

//   创建方法
	public void show(){
		float varT = 1.1F;
		System.out.println("varT=" + varT);
	}

	public static void main(String[] args) 
	{
		Model2_10 m2 = new Model2_10();
		m2.show();     //调用show()方法
	}
}
