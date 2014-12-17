package yasarcan;

public class QuickSort implements IQuickSort {

	@Override
	public int partition(int[] array, int start, int end)
	    {
	        int last = end - 1;
	        int first = start;
	        int pivot = array[start];
	        while (first < last)
	        {
	        	while (first < last && pivot <= array[last])
	                last = last - 1;
	            	array[first] = array[last];
	            while (first < last && pivot > array[first])
	                first = first + 1;
	            	array[last] = array[first];
	        }
	        array[first] = pivot;
	        return first;
	    }

	@Override
	public void quickSort(int[] array, int start, int end) {
		if(end - start >= 2){
			int pivotPosn= partition(array, start, end);
			quickSort(array, start, pivotPosn);
			quickSort(array, pivotPosn+1, end);
		}	
	}

	@Override
	public long timeToSort(int[] array, int start, int end) {
		long startTime = System.nanoTime();
		quickSort(array, start, end);
		long estimatedTime = System.nanoTime() - startTime;
		return estimatedTime;
	}
	
	void printTimeForOrdered(int size) {
		Helper h1 = new Helper();
		System.out.println("Time is "+timeToSort(h1.generateOrderedArray(size), 0, size)+" when array size: "+size);
	}
	void printTimeForReverseOrdered(int size){
		Helper h1 = new Helper();
		System.out.println("Time is "+timeToSort(h1.generateReverseOrderedArray(size),0, size)+" when array size: "+size);
	}
	void printTimeForRandomOrdered(int size){
		Helper h1 = new Helper();
		System.out.println("Time is "+timeToSort(h1.generateRandomOrderedArray(size),0, size)+" when array size: "+size);
	}

}
