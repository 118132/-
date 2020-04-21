public class InsertSortOpt
{
	public static int binarySelect(int[] arr,int start,int end,int high) {
		//定义二分查找的区间位置变量，以及中间位置变量
		int left = start;
		int right = end;
		//设定递归算法的结束标志：数组最后一轮区间容量为1.left=right
		if(left >= right) {
			return (high>=arr[left]) ? left+1:left;
		}else {
			//给定二分查找的中间位置
			int middleIndex = (left+right)/2;
			if(high == arr[middleIndex]) {
				return middleIndex;
			}else if(high > arr[middleIndex]) {
				left = middleIndex+1;
				return binarySelect(arr,left,right,high);    //递归调用二分查找算法
			}else {
				right = middleIndex-1;
				return binarySelect(arr,left,right,high);
			}
		}
	}
	public static void InsertSortOpt(int[] arr) {
		for(int i=0 ; i<arr.length-1; i++) {
			//比较i+1位置的元素与升序的有序区最后一个元素的大小
			if(arr[i] > arr[i+1]) {
				int temp = arr[i+1];
				int k = i+1;             //无序位置的索引
				int index = binarySelect(arr,0,i,arr[i+1]);   //待排序元素的插入位置
				while(k-1 >= index) {    //k-1为有序位置的索引
					arr[k] = arr[k-1];   //将插入位置及其后面的数组元素依次后移一位
					k--;
				}
				arr[index] = temp;
			}
		}
//		for(int i=0 ; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
