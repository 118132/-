public class Main
{

    public static void main(String[] args)
    {
        BaoZiStore baoZiStore = new BaoZiStore();
        BaoZi baoZi = null;

        baoZi = baoZiStore.orderBaoZi("白菜猪肉");
        System.out.println(baoZi);

        baoZi = baoZiStore.orderBaoZi("白菜牛肉");
        System.out.println(baoZi);

        baoZi = baoZiStore.orderBaoZi("青椒牛肉");
        System.out.println(baoZi);

        baoZi = baoZiStore.orderBaoZi("青椒猪肉");
        System.out.println(baoZi);

    }   

}

