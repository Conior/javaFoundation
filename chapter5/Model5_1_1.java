class Model5_1_1{
	public static void main(String[] args){
		String stuName = new String("����");
		System.out.println(stuName);

		stuName.concat("ͬѧ");
		System.out.println(stuName);

		String stuName1 = new String();
		stuName1 = stuName.concat("ͬѧ");
		System.out.println(stuName1);

		stuName = "����";
		System.out.println(stuName);

		String stuName2 = new String();
		stuName2 = "����";
		System.out.println(stuName2);
	}
}