import java.util.*;
import org.apache.http.impl.execchain.*;
import javax.xml.parsers.*;

public class ClientClass
{
	public static void main(String[] args)
	{
//		Factoty factory=new Factory();
//		Fruit fr=factory.CreateFruit("A");
//		//Fruit fr=factory.CreateFruit("B");
//		fr.eat();
		
		Factory factory=new AFactory();
		Fruit fr=factory.CreateFruit();
		fr.eat();
		
		

	}
	public String factory(String fruitname){
		if (fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}
