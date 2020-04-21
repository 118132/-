public class ShellSort
{
	public static void ShellSort(int[] sortingData)
	{
		int length =sortingData.length;
		int temp;
		int gap = length/2;
		while (gap > 0){//当组合为单个数时候就没有继续分组的必要了
			for(int i=gap;i<sortingData.length;i++){
				int preIndex = i - gap;//某一组数据中的前一个数，假如此时为0
				temp =sortingData [i];//假如为 arr[5]
				while(preIndex >= 0 &&sortingData[preIndex] > temp){//arr[1] > arr[5]
					sortingData[preIndex+gap] = sortingData[preIndex];
					preIndex-=gap;
				}
				sortingData[preIndex+gap] = temp;

			}
			gap/=2;
		}
//		for (int i = 0; i < sortingData.length; i++){
//			System.out.print(sortingData[i]+" ");
//		}
	}
}
