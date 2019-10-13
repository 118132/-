package dailywork13;

import java.io.IOException;

@SuppressWarnings("serial")
public class SubC extends SuperC{
	//class SubC implements Serializable,子类父类化
	int subvalue; 

	public SubC(int supervalue,int subvalue) { 
	super(supervalue); 
	this.subvalue=subvalue; 
} 

	public String toString() { 
	return super.toString()+" sub: "+subvalue; 
	} 
	
	//2,子类线序化自身然后负责序列化父类的域
	/*private void writeObject(java.io.ObjectOutputStream out) 
			throws IOException{ 
			out.defaultWriteObject();//先序列化对象 
			out.writeInt(supervalue);//再序列化父类的域 
			　　} 
			private void readObject(java.io.ObjectInputStream in) 
			throws IOException, ClassNotFoundException{ 
			in.defaultReadObject();//先反序列化对象 
			supervalue=in.readInt();//再反序列化父类的域 
			　　} */

}
