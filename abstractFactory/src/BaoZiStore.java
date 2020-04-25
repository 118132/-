public class BaoZiStore
{
    protected  BaoZi createBaoZi(String baoZiName)
    {
        BaoZi baoZi = new BaoZi();
        BaoZiIngredientFactory factory = null;

        if(baoZiName.equals("白菜猪肉"))
        {
            factory = new BaoZiIngredientFactory1();
            baoZi.setIngredientFactory(factory);
        }
        else if(baoZiName.equals("白菜牛肉"))
        {
            factory = new BaoZiIngredientFactory2();
            baoZi.setIngredientFactory(factory);
        }
        else if(baoZiName.equals("青椒牛肉"))
        {
            factory = new BaoZiIngredientFactory3();
            baoZi.setIngredientFactory(factory);
        }
        else if(baoZiName.equals("青椒猪肉"))
        {
            factory = new BaoZiIngredientFactory4();
            baoZi.setIngredientFactory(factory);
        }

        return baoZi;
    }

    public BaoZi orderBaoZi(String baoZiName)
    {
        BaoZi baoZi = createBaoZi(baoZiName);
        baoZi.makeBaoZi();
        return baoZi;
    }
}

