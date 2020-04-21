public class InsertSort
{
	public static void InsertSort(int[] sortingData) 
	{
		for (int i = 1; i < sortingData.length; i++)
		{
			int currentValue = sortingData[i];
			int j = i;
			while (j - 1 >= 0 && currentValue < sortingData[j - 1]) 
			{
				sortingData[j] = sortingData[j - 1];
				j--;
			}
			sortingData[j] = currentValue;
		}
//		for (int i = 0; i < sortingData.length; i++){
//			System.out.print(sortingData[i]+" ");
//		}
	}
}
