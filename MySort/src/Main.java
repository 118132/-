import java.util.*;
import InsertSort;
import InsertSortOpt;
import ShellSort;
import ShellSortOpt;
public class Main
{
	public static void main(String[] args)
	{
//		System.out.println("输入一个8位数数组");
		    Scanner sc=new Scanner(System.in);
//		int[] sortData=new int[8];
//		int i;
//		for(i=0;i<8;i++)
//		{
//			sortDate[i]=sc.nextInt();
//			//System.out.println(sortDate[i]);
//		}
		int length = 10000000;//千万级别
        int[] sortData = new int[length];
        for (int index = 0; index < length; index++) {
            sortData[index] = new Random().nextInt(length) + 1;
        }
		System.out.println("****************************************");
		System.out.print("1.直接插入排序");
		System.out.print("      ");
		System.out.print("2.直接插入排序优化");
		System.out.println("");
		System.out.print("3.希尔排序");
		System.out.print("              ");
		System.out.print("4.希尔排序优化");
		System.out.println("");
		System.out.print("5.退出");
		System.out.println("");
		System.out.println("****************************************");
		switch(sc.nextInt()){
			case 1:
				//System.out.println("1");
				long start= System.currentTimeMillis();
				InsertSort InSort=new InsertSort();
				InSort.InsertSort(sortData);
				long end=System.currentTimeMillis();
				//System.out.println("");
				System.out.println("花费时间"+(end-start)+"ms");
				break;
			case 2:
				//System.out.println("2");	
				start= System.currentTimeMillis();
				InsertSortOpt InSortOpt=new InsertSortOpt();
				InSortOpt.InsertSortOpt(sortData);
				end=System.currentTimeMillis();
				//System.out.println("");
				System.out.println("花费时间"+(end-start)+"ms");
				break;
			case 3:
				//System.out.println("3");
				start= System.currentTimeMillis();
				ShellSort SS=new ShellSort();
				SS.ShellSort(sortData);
				end=System.currentTimeMillis();
				//System.out.println("");
				System.out.println("花费时间"+(end-start)+"ms");
				break;
			case 4:
				//System.out.println("4");
				 start= System.currentTimeMillis();
				ShellSortOpt SSO=new ShellSortOpt();
				SSO.SellSortOpt(sortData);
				end=System.currentTimeMillis();
				//System.out.println("");
				System.out.println("花费时间"+(end-start)+"ms");
				break;
			case 5:
				break;
		}
	}
}
