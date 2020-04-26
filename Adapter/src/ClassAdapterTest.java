
//适配者接口
interface Target
{
    public void request();
}
class Adaptee
{
    public void specificRequest()
    {       
        System.out.println("适配者中的业务代码被调用！");
    }
}

class ClassAdapter extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}

public class ClassAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
