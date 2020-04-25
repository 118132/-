public class SubMealBuilderA implements MealBuilder
{
	Meal meal;
	public SubMealBuilderA(){
		meal=new Meal();
	}
	public void buildFood(){
		meal.setFood("一个鸡腿堡");
	}
	public void buildDrink(){
		meal.setDrink("一杯可乐");
	}

	@Override
	public Meal getMeal()
	{
		// TODO: Implement this method
		return meal;
	}
	
}

