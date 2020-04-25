public class BaoZiIngredientFactory2 implements BaoZiIngredientFactory
{

    @Override
    public Veggies createVeggies()
    {
        return new Cabbage(); // A1
    }

    @Override
    public Meat createMeat()
    {
        return new Beaf();    // B2 
    }

}
