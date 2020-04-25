//具体工厂4生产的青椒猪肉包子
public class BaoZiIngredientFactory4 implements BaoZiIngredientFactory
{

    @Override
    public Veggies createVeggies()
    {
        return new GreenPepper();  // A2
    }

    @Override
    public Meat createMeat()
    {
        return new Pork();         // B1
    }
	
}
