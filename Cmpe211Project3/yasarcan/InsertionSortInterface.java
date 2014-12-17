package yasarcan;	
					
public interface InsertionSortInterface {
	
	/*
	 * insertionSort is a method which take an array, and 2 integers as starting and end point.
	 * make the array sorted.
	 * [1],0,1 -> [1]
	 * [1,2],0,2 -> [1,2]
	 * [2,1],0,2 -> [1,2]
	 * [3,2,1],0,3 -> [1,2,3]
	 	public void insertionSort(int[] arr, int start, int end) {
		int dammy;
		for (int i = start; i < end; i++) {
			for (int j = i+1; j < end-1 ; j++) {
				if(arr[i] .... arr[j]){
					dammy=arr[i];
					arr[i]=arr[j];
					arr[j]=dammy;
				}
			}
		}
	}
	 * 
	 */
	
	int[] insertionSort(int[]arr, int start, int end);
	public long timeToSort(int[] array, int start, int end);
	 
	

}
