/**
需求：输出1！+2！+...+10!的和
*/

class Daily4_9{
	public static void main(String[] args){
		
		int [] a = new int [10];		//定义一个数组分别保存这每个阶乘的数值
		a[0] = 1;						//初始化第一个数组，即将1！的值保存在第一个数组
		int sum = 1;					//定义阶乘的和

		//循环将2！到10！分别保存在数组a[1]到a[9]内
		for(int i=2;i<a.length+1;i++){
			a[i-1] = a[i-2] * i;		//i的阶乘是（i-1）的阶乘与i的乘积
			sum = sum + a[i-1];			//计算前n个阶乘的和
		}

		System.out.println("1! + 2! +...+ 10! = " + sum);
	}
}