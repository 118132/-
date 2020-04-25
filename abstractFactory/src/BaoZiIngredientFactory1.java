// 具体工厂1生产的白菜猪肉包子
public class BaoZiIngredientFactory1 implements BaoZiIngredientFactory
{

    @Override
    public Veggies createVeggies()
    {
        return new Cabbage(); // A1
    }

    @Override
    public Meat createMeat()
    {
        return new Pork();    // B1
    }

}
