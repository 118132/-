public class ShellSortOpt
{
	/**
     * 比较两个元素的大小
     *
     * @param comparableA 待比较元素A
     * @param comparableB 待比较元素B
     * @return 若 A < B,返回 true,否则返回 false
     */
    private static boolean less(int a, int b) {
		if(a<b)
			return true;
		else 
			return false;
    }

    /**
     * 将两个元素交换位置
     *
     * @param arr    待交换元素所在的数组
     * @param indexI 第一个元素索引
     * @param indexJ 第二个元素索引
     */
    private static void exch(int[] arr, int indexI, int indexJ) {
        int temp = arr[indexI];
        arr[indexI] = arr[indexJ];
        arr[indexJ] = temp;
    }
	
	public static void SellSortOpt(int[] arr){
		int length = arr.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;  // 1 , 4 , 13 , 40 , 121 , 364 , 1093...
        }
        int exchanges = 0; //交换次数
        //若 arr[index] < arr[index - 1]，则交换两数
        for (int index = length - 1; index > 0; index--) {
            if (less(arr[index], arr[index - 1])) {
                exch(arr, index, index - 1);
                exchanges++;
            }
        }
        //若交换次数为0（即数组有序），则无需进行下一步排序。
        if (exchanges == 0) return;
        //若有交换次数，表明目前的数组无序。
        while (h >= 1) {
            // 将数组变为 h 有序
            for (int indexI = h; indexI < length; indexI++) {
                int temp = arr[indexI];  //记录一下arr[indexI]的值
                int indexJ = indexI;            //indexI 的代替品
                //若 indexJ 的前 h 位元素小于 temp，则将小于temp的元素向右移动 h 位
                //需要注意：可能会出现 indexJ < h 的情况。而一般的插入排序不会出现。
                while (indexJ >= h && less(temp, arr[indexJ - h])) {
                    arr[indexJ] = arr[indexJ - h];
                    indexJ -= h;
                }
                arr[indexJ] = temp; //将记录的值放在 indexJ 的位置上
            }
            h = h / 3;
        }
//		for (int i=0;i<arr.length;i++){
//			System.out.print(arr[i]+" ");
//		}
	}
}
