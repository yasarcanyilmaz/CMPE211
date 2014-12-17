package yasarcan;

public interface IHelperSort {
	
	/*
	//isItInOrder is a function, which takes an (sub)array and 2 pointer in array as starting and end points. 
	//boolean isItInOrder(int[]arr, int start, int end);
	//It returns boolean, as a result of listing, it can be in order or not in order.
	[1] 0 1 -> true
	[1 2] 0 1 -> true
	[1 2] 0 2 -> true
	[2 1] 0 2 -> false
	[1 2 2] 0 3 -> true
	[1 2 1] 0 3 -> false
	[3 2 1] 0 2 -> false
	[1 2 2] 0 3 -> true
	[1 1 1] 0 3 -> true
	[1 2 3] 0 2 -> true
	[1 2 3] 0 3 -> true
	[1 2 4 3] 0 4 -> false
	[5 2 3 3] 1 4 -> true

	  boolean isItInOrder (int[] arr, int start, int end)
	{
		if (end - start <? 1)
			...
			else
				...arr[start] .... arr[start+1]...
	} 
	
	boolean isItInOrder2(int[]arr, int start, int end)
	{
	for(int i=start; i<end; i++)
	if(arr[i] ... arr[i+1]...)
		return.....
	}
	return ....
	}

	 * 
	 */
	boolean isItInOrder(int[]arr, int start, int end);
	boolean isItInOrder2(int[]arr, int start, int end);
	
	/* generateOrderedArray is a function, which takes an integer as input and return and array of integers as output.
	 * it generates OrderedArray with given size, starting from one to size.
	 * 0 -> [ ]
	 * 1 -> [1]
	 * 2 -> [1,2]
	 * 5 -> [1,2,3,4,5]
	 
	 int[] generateOrderedArray(int size){
	 int arr[]=new int[size];
	 for(int i=0; i<size; i++){
	 ......
	 }
	 return arr;
	 
	 */
	int[] generateOrderedArray(int size);
	/*
	 * generateReverseOrderedArray is a function, which takes an integer as input and return and array of integers as output.
	 * it generates OrderedArray with given size, starting from size to one.
	 * 0 -> [ ]
	 * 1 -> [1]
	 * 2 -> [2,1]
	 * 5 -> [5,4,3,2,1]
	 *  
	 int[] generateRandomOrderedArray(int size){
	 int arr[]=new int[size];
	 for(int i=0; i<size; i++){
	 ......
	 }
	 return arr;
	 */
	int[] generateReverseOrderedArray(int size);
	/*
	 * generateRandomOrderedArray is a function, which takes an integer as input and return and array of integers as output.
	 * it generates OrderedArray with given size and the values in array is randomly selected.
	 * 0 -> [ ]
	 * 1 -> [?]
	 * 2 -> [?,?]
	 * 5 -> [?,?,?,?,?]
	 *  
	 * 
	 int[] generateRandomOrderedArray(int size){
	 int arr[]=new int[size];
	 for(int i=0; i<size; i++){
	 ......
	 }
	 return arr;
	 */
	int[] generateRandomOrderedArray(int size);
	}
