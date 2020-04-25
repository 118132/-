
import org.apache.http.util.*;
public class Client
{
	public static void main(String[] Args){
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs=MyFruitStore.Getfruitstore();
		mfs.Add(1,fru1);
		mfs.Add(2,fru2);
		mfs.Add(3,new Apple());
		mfs.Add(4,new Banana());
		MyFruit fru=(MyFruit)mfs.Get(4);
		fru.Display();
		System.out.println("mfs1:"+mfs.toString());
	}
	
	
}
