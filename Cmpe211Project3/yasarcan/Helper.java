package yasarcan;

public class Helper implements IHelperSort {

	@Override
	public boolean isItInOrder(int[] arr, int start, int end) 
	{
		if(end-start <= 1)
			return true;
		else return (arr[start]<arr[start+1]) && (isItInOrder(arr,start+1,end));

	}
	@Override
	public boolean isItInOrder2(int[] arr, int start, int end) {
		while(end - start > 1){
			if(arr[start]>arr[start+1])
				return false;
			else start=start+1;
		} return true;
	}
	@Override
	public int[] generateOrderedArray(int size)
	{
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=1+i;
		}
		return arr;
	}
	@Override
	public int[] generateReverseOrderedArray(int size) {
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=size-i;
		}
		return arr;
	}
	@Override
	public int[] generateRandomOrderedArray(int size) {
		int[]arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*1000000);
		}
		return arr;
	}


}
