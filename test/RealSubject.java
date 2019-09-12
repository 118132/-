package test;

public class RealSubject implements Subject{

	@Override
	public void rent() {
		// TODO 自动生成的方法存根
		System.out.println("I want to rent my house");
	}

	@Override
	public void hello(String str) {
		// TODO 自动生成的方法存根
		System.out.println("hello:"+str);
	}

}
