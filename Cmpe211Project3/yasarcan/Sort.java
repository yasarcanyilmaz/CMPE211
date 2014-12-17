package yasarcan;

public class Sort {
	
	
	public void insertionSort(int[] arr, int start, int end) {

		int dammy;

		for (int i = start; i < end; i++) {
			for (int j = i+1; j < end-1 ; j++) {
				if(arr[i] > arr[j]){
					dammy=arr[i];
					arr[i]=arr[j];
					arr[j]=dammy;
				}
			}
		}
	}
	
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

	
	public void quickSort(int[] array, int start, int end) {
		if(end - start >= 2){
			int pivotPosn= partition(array, start, end);
			quickSort(array, start, pivotPosn);
			quickSort(array, pivotPosn+1, end);
		}	
	}

}
