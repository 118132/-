package cn.itcast.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.itcast.junit.Calculator;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculatorTest {
	@Before
	public void init() {
		//初始化 资源申请
		System.out.print("测试执行");
		
	}
	@After
	public void close() {
		//资源释放，自动执行
		System.out.print("测试结束");
		
	}
	//测试
	@SuppressWarnings("deprecation")
	@Test
    public void addTest() {
    	//System.out.print("测试执行");
		Calculator a=new  Calculator();
		int b=a.add(2, 2);
		//int b=a.sub(2,3);
		//System.out.print(b);
		Assert.assertEquals(4, b);
    }
	

}
