// Client即包子，聚合两个抽象产品,关联工厂接口
public class BaoZi
{
    String name;

    // 一个包子就是一个"a family of products"
    // 一个包子由分布在两类抽象产品中的三个具体产品构成
    Veggies veggies; // A类产品-蔬菜馅
    Meat    meat;    // B类产品-肉馅

    BaoZiIngredientFactory factory; // 工厂接口

    public BaoZi()
    {
        // 构造函数都不做什么事
    }

    public void setIngredientFactory(BaoZiIngredientFactory factory)
    {
        this.factory = factory;
    }

    public void makeBaoZi()
    {
        prepare();  // 准备原材料
        steam();    // 蒸30分钟
        setName(veggies.toString() + meat.toString() + "包子");
    }

    void prepare()
    {
        veggies = factory.createVeggies();
        meat    = factory.createMeat();
        System.out.println("Preparing " + veggies.toString() + "," + meat.toString());
    }

    void steam()
    {
        System.out.println("Steam for 30 minutes");
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    public String toString()
    {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (veggies != null)
        {
            result.append(veggies);
            result.append("馅 + ");
        }
        if (meat != null)
        {
            result.append(meat);
            result.append("馅\n");
        }
        return result.toString();
    }
}

