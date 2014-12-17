package yasarcan;

public class HeapSort implements IHeapSort {

	@Override
	public void heapSort(int[] arr, int start, int end) {
		
		for (int i = parent(end); i >= start; i--) {
			heapify(arr, i, end);
		}
		
	}
	
	@Override
	public int left(int n) {
		return 2*n+1;
	}

	@Override
	public int right(int n) {
		return 2*n+2;
	}

	@Override
	public int parent(int n) {
		return (n-1)/2;
	}

	@Override
	public void heapify(int[] arr, int root, int end) {
		if((root < end) && (left(root) < end)){
			int minP= minPos(arr, left(root), right(root), end);
			if(arr[root] > arr[minP]){
				swap(arr, root, minP);
				heapify(arr, minP, end);
			}
		}
		
	}

	@Override
	public int minPos(int[] arr, int p1, int p2, int end) {
		if((p2 >= end) || (arr[p1] < arr[p2]))
			return p1;
		else  
			return p2;
	}

	@Override
	public void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
		
	}

	@Override
	public long timeToSort(int[] array, int start, int end) {
		long startTime = System.nanoTime();
		heapSort(array, start, end);
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
