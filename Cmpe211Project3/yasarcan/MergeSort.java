package yasarcan;

public class MergeSort implements IMergeSort {


	@Override
	public int[] mergeSort(int[] arr, int start, int end) {
		int middle= start + (end-start)/2;
		if(end - start > 1){
			return (merge(mergeSort(arr,start,middle),
					mergeSort(arr,middle,end)));	
		}else{
			int[] result= new int[end-start];
			for (int i = 0; i < end - start; i++) {
				result[i]=arr[start+i];
			}
			return result;
		}
	}

	@Override
	public int[] merge(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		int outPos=0;
		int arr1in=0;
		int arr2in=0;
		while(outPos < result.length){
			if(arr1in >= arr1.length){
				result[outPos++]= arr2[arr2in++];
			}else if(arr2in >= arr2.length){
				result[outPos++]=arr1[arr1in++];
			}else if(arr1[arr1in] < arr2[arr2in]){
				result[outPos++]=arr1[arr1in++];
			}else
				result[outPos++]=arr2[arr2in++];
		}
		return result;
	}
	@Override
	public long timeToSort(int[] array, int start, int end) {
		long startTime = System.nanoTime();
		mergeSort(array, start, end);
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
