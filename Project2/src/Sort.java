
public class Sort {
	
	
	public boolean isItInOrder2(int[]arr, int start, int end)
	{
		if(end-start <= 1)
			return true;
		else return (arr[start]<arr[start+1]) && (isItInOrder2(arr,start+1,end));

	}
	
	public boolean isItInOrder(Student[]arr, int start, int end)
	{
		if(end-start <= 1)
			return true;
		else return (arr[start].checkAscending(arr[start+1])) && (isItInOrder(arr,start+1,end));

	}
	
	
	 public void iSort (Student[] list)
	   {
	      int min;
	      Student dammy;

	      for (int i = 0; i < list.length-1; i++)
	      {
	         min = i;
	         for (int j = i+1; j < list.length; j++)
	            if (list[j].checkAscending(list[min]))
	               min = j;
	         dammy = list[min];
	         list[min] = list[i];
	         list[i] = dammy;
	      }
	   }
	
	public void qSort(int arr[], int start, int end){
		if(end - start >= 2){
			int pivotPosn= partition(arr, start, end);
			qSort(arr, start, pivotPosn);
			qSort(arr, pivotPosn+1, end);
		}
	}

	public int partition(int[] array, int start, int end) {
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
		
	public void qSort(Student[] arr, int start, int end){
		if(end - start >= 2){
			int pivotPosn= partition(arr, start, end);
			qSort(arr, start, pivotPosn);
			qSort(arr, pivotPosn+1, end);
		}
	}
	
	public int partition(Student[] array, int start, int end) {
		int last = end - 1;
        int first = start;
        Student pivot = array[start];
        while (first < last)
        {
            while (first < last && pivot.checkAscending(array[last]))
                last = last - 1;
            array[first] = array[last];
            while (first < last && pivot.checkDesc(array[first]))
                first = first + 1;
            array[last] = array[first];
        }
        array[first] = pivot;
        return first;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
