package cn.itcast.junit;

public class Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Calculator a=new  Calculator();
		int b=a.add(2, 2);
		//int b=a.sub(2,3);
		System.out.print(b);

	}

}
//白盒测试 定义测试类 定义测试方法（可独立运行-添加注解@test，建议无返回值，建议空参）
//注意测试结果正确or错误