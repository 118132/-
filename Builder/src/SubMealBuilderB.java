public class SubMealBuilderB implements MealBuilder
{
	Meal meal;
	public SubMealBuilderB(){
		meal=new Meal();
	}
	public void buildFood(){
		meal.setFood("一个鸡腿");
	}
	public void buildDrink(){
		meal.setDrink("一杯果汁");
	}

	@Override
	public Meal getMeal()
	{
		// TODO: Implement this method
		return meal;
	}
	
}
