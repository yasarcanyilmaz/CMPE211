package yasarcan;

public interface IHeapSort {

	int left(int n);
	int right(int n);
	int parent(int n);
	void heapify(int[]arr, int root, int end);
	int minPos(int[]arr, int p1, int p2, int end);
	void swap(int arr[], int p1, int p2);
	public long timeToSort(int[] array, int start, int end);
	void heapSort(int[]arr, int start, int end);
	
}
