package test;

public class RealSubject implements Subject{

	@Override
	public void rent() {
		// TODO �Զ����ɵķ������
		System.out.println("I want to rent my house");
	}

	@Override
	public void hello(String str) {
		// TODO �Զ����ɵķ������
		System.out.println("hello:"+str);
	}

}
