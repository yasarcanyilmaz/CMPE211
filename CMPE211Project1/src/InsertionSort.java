
public class InsertionSort {

	/*	isItIndorder is method to check list is in order or not, that's why, it returns true or false.
	 * boolean isItInOrder (int[] arr, int start, int end)
	 * method takes 3 parameters, which are an array, starting point and end point to check array.
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

	  boolean isLoindo (int[] arr, int start, int end)


	{
		if (end - start <? 1)
			...
			else
				...arr[start] .... arr[start+1]...

	} 

	 * 
	 */

	public static boolean isItInOrder(int[]arr, int start, int end)
	{
		if(end-start <= 1)
			return true;
		else return (arr[start]<arr[start+1]) && (isItInOrder(arr,start+1,end));

	}


	public static void putInOrder(int[]arr, int start, int end)
	{
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
	public static int[] putInOrder2(int[]arr){
		
			int dammy;

			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length ; j++) {
					if(arr[i] > arr[j]){
						dammy=arr[i];
						arr[i]=arr[j];
						arr[j]=dammy;
					}

				}

			}
			return arr;
		}
	public static int[] addToSortedList(int[]arr, int n){
		int[]a =new int[arr.length+1];
		a[a.length-1]=n;
		for (int i = 0; i < a.length-1; i++) {
			a[i]=arr[i];
		}
		putInOrder2(a);
		return a;
	}
	
	public static int[] sortRandomArray(int n){
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*1000000);
		}
		putInOrder2(arr);
		return arr;
	}
	
	public static int[] createRandomArray(int n){
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*1000000);
		}
		return arr;
	}
	
	public static int[] createOrderedArray(int n){
		int[]arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=10000+i;
		}
		return arr;
	}
	public static long timeToSort(int[]arr){
		int start=0;
		int end=arr.length;
		long startTime = System.nanoTime();
		putInOrder(arr, start, end);
		long estimatedTime = System.nanoTime() - startTime;
		return estimatedTime;
	}

	public static void printArray(int[]a){
		System.out.println();
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {

	} //end of main method
	
} //end of class
