package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class DynamicProxy implements InvocationHandler{

	private Object subject;
	public DynamicProxy(Object subject){

		this.subject=subject;

	}
	@Override
	public Object invoke(Object arg0, Method method, Object[] args) 
			throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println("before rent house");
		System.out.println("Method:"+method);
		method.invoke(subject, args);
		System.out.println("after rent house");
		return null;
	}
}
