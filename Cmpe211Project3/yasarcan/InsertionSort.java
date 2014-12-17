package yasarcan;

public class InsertionSort implements InsertionSortInterface {



	@Override
	public int[] insertionSort(int[] input, int start, int end){
    int temp;
	
    for (int i = start+1; i < end; i++) {
	    for(int j = i ; j > 0 ; j--){
		    if(input[j] < input[j-1]){
			    temp = input[j];
			    input[j] = input[j-1];
			    input[j-1] = temp;
		    }
	    }
    }
    return input;
}
	@Override
	public long timeToSort(int[] array, int start, int end) {
		long startTime = System.nanoTime();
		insertionSort(array, start, end);
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
