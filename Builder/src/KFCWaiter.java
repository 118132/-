public class KFCWaiter
{
	public Meal SetMealBuilder(MealBuilder mb){
		mb.buildDrink();
		mb.buildFood();
		return mb.getMeal();
	}
}
