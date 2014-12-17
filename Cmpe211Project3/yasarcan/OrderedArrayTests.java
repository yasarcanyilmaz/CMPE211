package yasarcan;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedArrayTests {

	@Test
	public void testInsertionSortOrdered() {
		InsertionSort iS1= new InsertionSort();
		Helper h1= new Helper();
		//in order 1 element
		assertEquals(true, h1.isItInOrder2(iS1.insertionSort(h1.generateOrderedArray(1), 0, 1), 0, 1));
		//in order 2 elements
		int[] o2 =h1.generateOrderedArray(2);
		iS1.insertionSort(o2, 0, 2);
		assertEquals(true, h1.isItInOrder2(o2, 0, o2.length));
		//in order 10 elements
		int[] o10 =h1.generateOrderedArray(10);
		iS1.insertionSort(o10, 0, 10);
		assertEquals(true, h1.isItInOrder2(o10, 0, 10));
		//in order 100 elements
		int[] o100 =h1.generateOrderedArray(100);
		iS1.insertionSort(o100, 0, 100);
		assertEquals(true, h1.isItInOrder2(o100, 0, 100));
		//in order 1000 elements
		int[] o1000 =h1.generateOrderedArray(1000);
		iS1.insertionSort(o1000, 0, 1000);
		assertEquals(true, h1.isItInOrder2(o1000, 0, 1000));
		//in order 10000 elements
		int[] o10000 =h1.generateOrderedArray(10000);
		iS1.insertionSort(o10000, 0, 10000);
		assertEquals(true, h1.isItInOrder2(o10000, 0, 10000));
		//in order 100000 elements
		int[] o100000 =h1.generateOrderedArray(100000);
		iS1.insertionSort(o100000, 0, 100000);
		assertEquals(true, h1.isItInOrder2(o100000, 0, 100000));
	}
	
	@Test
	public void testQuickSortOrdered() {
		QuickSort s1= new QuickSort();
		Helper h1= new Helper();
		
		int[] o2 =h1.generateOrderedArray(2);
		s1.quickSort(o2, 0, 2);
		assertEquals(true, h1.isItInOrder2(o2, 0, o2.length));
		
		int[] o3 =h1.generateOrderedArray(10);
		s1.quickSort(o3, 0, o3.length);
		assertEquals(true, h1.isItInOrder2(o3, 0, o3.length));
		
		int[] o4 =h1.generateOrderedArray(100);
		s1.quickSort(o4, 0, o4.length);
		assertEquals(true, h1.isItInOrder2(o4, 0, o3.length));
		
		int[] o5 =h1.generateOrderedArray(1000);
		s1.quickSort(o5, 0, o5.length);
		assertEquals(true, h1.isItInOrder2(o5, 0, o5.length));
		
		int[] o6 =h1.generateOrderedArray(10000);
		s1.quickSort(o6, 0, o6.length);
		assertEquals(true, h1.isItInOrder2(o6, 0, o6.length));
		
		int[] o7 =h1.generateOrderedArray(100000);
		s1.quickSort(o7, 0, o7.length);
		assertEquals(true, h1.isItInOrder2(o7, 0, o7.length));
		
		
	}


	@Test
	public void testMergeSortOrdered() {
		MergeSort m1 = new MergeSort();
		Helper h1= new Helper();
		
		int[] o2 =h1.generateOrderedArray(2);
		//s1.quickSort(o2, 0, 2);
		m1.mergeSort(o2, 0, o2.length);
		assertEquals(true, h1.isItInOrder2(o2, 0, o2.length));
		
		int[] o3 =h1.generateOrderedArray(10);
		m1.mergeSort(o3, 0, o3.length);
		assertEquals(true, h1.isItInOrder2(o3, 0, o3.length));
		
		int[] o4 =h1.generateOrderedArray(100);
		m1.mergeSort(o4, 0, o4.length);
		assertEquals(true, h1.isItInOrder2(o4, 0, o3.length));
		
		int[] o5 =h1.generateOrderedArray(1000);
		m1.mergeSort(o5, 0, o5.length);
		assertEquals(true, h1.isItInOrder2(o5, 0, o5.length));
		
		int[] o6 =h1.generateOrderedArray(10000);
		m1.mergeSort(o6, 0, o6.length);
		assertEquals(true, h1.isItInOrder2(o6, 0, o6.length));
		
		int[] o7 =h1.generateOrderedArray(100000);
		m1.mergeSort(o7, 0, o7.length);
		assertEquals(true, h1.isItInOrder2(o7, 0, o7.length));
		
	}
	@Test
	public void testHeapSortOrdered() {
		HeapSort s1= new HeapSort();
		Helper h1= new Helper();
		
		int[] o2 =h1.generateOrderedArray(2);
		
		s1.heapSort(o2, 0, o2.length);
		assertEquals(true, h1.isItInOrder2(o2, 0, o2.length));
		
		int[] o3 =h1.generateOrderedArray(10);
		s1.heapSort(o3, 0, o3.length);
		assertEquals(true, h1.isItInOrder2(o3, 0, o3.length));
		
		int[] o4 =h1.generateOrderedArray(100);
		s1.heapSort(o4, 0, o4.length);
		assertEquals(true, h1.isItInOrder2(o4, 0, o3.length));
		
		int[] o5 =h1.generateOrderedArray(1000);
		s1.heapSort(o5, 0, o5.length);
		assertEquals(true, h1.isItInOrder2(o5, 0, o5.length));
		
		int[] o6 =h1.generateOrderedArray(10000);
		s1.heapSort(o6, 0, o6.length);
		assertEquals(true, h1.isItInOrder2(o6, 0, o6.length));
		
		int[] o7 =h1.generateOrderedArray(100000);
		s1.heapSort(o7, 0, o7.length);
		assertEquals(true, h1.isItInOrder2(o7, 0, o7.length));
		
	}
	
	@Test
	public void InsertionSortTime() {
		
		InsertionSort iS1= new InsertionSort();
		iS1.printTimeForOrdered(100);
		iS1.printTimeForOrdered(1000);
		iS1.printTimeForOrdered(10000);
		iS1.printTimeForOrdered(100000);
		iS1.printTimeForOrdered(1000000);
		iS1.printTimeForOrdered(10000000);
		
	}
	
	@Test
	public void QuickSortTime(){
		QuickSort s1= new QuickSort();
		System.out.println();
		s1.printTimeForOrdered(100);
		s1.printTimeForOrdered(1000);
		s1.printTimeForOrdered(10000);
		s1.printTimeForOrdered(100000);
		s1.printTimeForOrdered(1000000);
		s1.printTimeForOrdered(10000000);
	}
	
	@Test
	public void MergeSortTime(){
		MergeSort s1= new MergeSort();
		System.out.println();
		s1.printTimeForOrdered(100);
		s1.printTimeForOrdered(1000);
		s1.printTimeForOrdered(10000);
		s1.printTimeForOrdered(100000);
		s1.printTimeForOrdered(1000000);
		s1.printTimeForOrdered(10000000);
	}
	
	@Test
	public void HeapSortTime(){
		HeapSort s1= new HeapSort();
		System.out.println();
		s1.printTimeForOrdered(100);
		s1.printTimeForOrdered(1000);
		s1.printTimeForOrdered(10000);
		s1.printTimeForOrdered(100000);
		s1.printTimeForOrdered(1000000);
		s1.printTimeForOrdered(10000000);
	}
	
}
