package cn.itcast.reflect;

import java.lang.reflect.Field;

public class Reflect1 {
	public static void main(String[] args) {
		Class p=Person.class;
		Field[] f=p.getFields();
		//public成员变量
		for (Field fi:f) {
			System.out.println(fi);
		}
		
	}

}
