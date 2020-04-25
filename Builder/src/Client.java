
public class Client
{
	public static void main(String[] args){
		KFCWaiter waiter=new KFCWaiter();
		Meal meal=waiter.SetMealBuilder(new SubMealBuilderA());
		System.out.println(meal.getDrink());
		System.out.println(meal.getFood());
	}
	
	
}
