package yasarcan;

public interface IMergeSort {
	
	/*
	 * mergeSort is a method which takes 3 inputs: array of integer, starting and end points of array as subarray
	 * it returns the sorted array.
	 * [1],0,1 -> [1]
	 * [1,2],0,2 -> [1,2]
	 * [2,1],0,2 -> [1,2]
	 * [3,2,1],0,3 -> [1,2,3]
	 public int[] mergeSort(int[] arr, int start, int end) {
		int middle= ......
		if(end - start > .....){
			return (.....mergeSort(arr,start,middle),
					.....mergeSort(arr,middle,end)...	
		}else{
			int[] result= new int[.....];
			for (int i = 0; i < .....; i++) {
				result[i]=arr[....];
			}.....
			return result;
		}
	}
	 */
	int[] mergeSort(int[]arr, int start, int end);
	/*
	 * merge is a method which takes 2 inputs: array of integer, array of integer -> sorted array of integer
	 * merge takes 2 sorted array and combine them.
	 * [1],[2] -> [1,2]
	 * [1,4],[2] -> [1,2,4]
	 * [1,5,6,8],[2,3,4] -> [1,2,3,4,5,6,8]
	 public int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		int outPos=....;
		int arr1in=...;
		int arr2in=....;
		while(outPos < result.length){
			if(arr1in >= arr1.length){
				........
			}else if(arr2in >= arr2.length){
				........
			}else if(arr1[arr1in] < arr2[arr2in]){
				.......
			}else
				........
		}
		return result;
	}
	 */
	int[] merge(int[]arr1, int[]arr2);
	long timeToSort(int[] array, int start, int end);

}
