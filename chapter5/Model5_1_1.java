class Model5_1_1{
	public static void main(String[] args){
		String stuName = new String("王云");
		System.out.println(stuName);

		stuName.concat("同学");
		System.out.println(stuName);

		String stuName1 = new String();
		stuName1 = stuName.concat("同学");
		System.out.println(stuName1);

		stuName = "刘静";
		System.out.println(stuName);

		String stuName2 = new String();
		stuName2 = "刘静";
		System.out.println(stuName2);
	}
}