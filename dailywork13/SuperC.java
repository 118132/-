package dailywork13;
import java.io.Serializable; 
@SuppressWarnings("serial")
public class SuperC implements Serializable {//父类实现了序列化 
	//class SuperC 此时即为一个没有实现Serializable接口的父类
	int supervalue; 
	public SuperC(int supervalue) { 
	this.supervalue = supervalue; 
	} 
	//2中想要实现序列化则父类需要增加一个无参
	//public SuperC(){}//增加一个无参的constructor 
	//public String toString() { 
	//return "supervalue: "+supervalue; 
	//} 
	//} 
	
	public String toString() { 
	   return "supervalue: "+supervalue; 
	} 
	} 