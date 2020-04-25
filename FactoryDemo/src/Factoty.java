public class Factoty
{
	public Fruit CreateFruit(String Kind){
		if(Kind.equals("A"))
			return new Apple();
		if(Kind.equals("B"))
			return new Banana();
		return null;
	}
}
