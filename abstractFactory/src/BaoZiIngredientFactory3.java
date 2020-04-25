// 具体工厂3生产的青椒牛肉包子
public class BaoZiIngredientFactory3 implements BaoZiIngredientFactory
{

    @Override
    public Veggies createVeggies()
    {
        return new GreenPepper(); // A2
    }

    @Override
    public Meat createMeat()
    {
        return new Beaf();        // B2
    }

}
