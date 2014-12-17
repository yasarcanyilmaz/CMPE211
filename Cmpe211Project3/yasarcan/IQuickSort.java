package yasarcan;

public interface IQuickSort {
	/*
	 * partitioning is method which takes an array and 2 integer as starting point and end point
	 * it makes first element of array, pivot. 
	 public int partition(int[] array, int start, int end)
	    {
	        int last = end - 1;
	        int first = start;
	        int pivot = array[start];
	        while (first ... last)
	        {
	        	while (first ... last && pivot ... array[last])
	                last = last - 1;
	            	array[first] = array[last];
	            while (first ... last && pivot ... array[first])
	                first = first + 1;
	            	array[last] = array[first];
	        }
	        array[first] = pivot;
	        return first;
	    }
	 */
	int partition(int[]array, int start, int end);
	/*
	 * quickSort is method which takes an array and 2 integer as starting point and end point
	 * it makes array sorted.
	 * [2,1],0,2 -> [1,2]
	 * [3,2,1],0,3 -> [1,2,3]
	 * [4,3,2,1],0,3 -> [1,2,3,4]
	 public void quickSort(int[] array, int start, int end) {
		if(end - start ...2){
			int pivotPosn=....
			quickSort .....
			(array...
			 .....start
			 ....pivotPosn....)
			 ....
		}	
	}
	 */
	void quickSort(int[]array, int start, int end);

	public long timeToSort(int[] array, int start, int end);
}
