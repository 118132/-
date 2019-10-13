package dailywork13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {


	public static void main(String [] args){ 
    SubC subc=new SubC(100,200); 
	FileInputStream in=null; 
	FileOutputStream out=null; 
	ObjectInputStream oin=null; 
	ObjectOutputStream oout=null; 
	try { 
	
		out = new FileOutputStream("Test1.txt");//子类序列化 
        oout = new ObjectOutputStream(out); 
	    oout.writeObject(subc); 
	    oout.close(); 
	    oout=null; 

	    in = new FileInputStream("Test1.txt"); 
	    oin = new ObjectInputStream(in); 
	    SubC subc2=(SubC)oin.readObject();//子类反序列化 
	    System.out.println(subc2); 
      } catch (Exception ex)
	{ 
	   ex.printStackTrace(); 
	} 
	}
}
