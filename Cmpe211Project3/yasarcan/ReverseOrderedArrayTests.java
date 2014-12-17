package yasarcan;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseOrderedArrayTests {

	@Test
	public void InsertionSortReverseOrdered() {
		Helper h1 = new Helper();
		InsertionSort s1= new InsertionSort();
		int[]a= h1.generateReverseOrderedArray(1);
		s1.insertionSort(a, 0, 1);
		assertEquals(true, h1.isItInOrder2(a, 0, 1));
		
		Helper h2 = new Helper();
		InsertionSort s2= new InsertionSort();
		int[]a2= h2.generateReverseOrderedArray(2);
		s2.insertionSort(a2, 0, 2);
		assertEquals(true, h1.isItInOrder2(a2, 0, 2));
		
		int[]a3= h2.generateReverseOrderedArray(10);
		s2.insertionSort(a3, 0, a3.length);
		assertEquals(true, h1.isItInOrder2(a3, 0, 10));
		
		int[]a4= h2.generateReverseOrderedArray(100);
		s2.insertionSort(a4, 0, a4.length);
		assertEquals(true, h1.isItInOrder2(a4, 0, 100));
		
		int[]a5= h2.generateReverseOrderedArray(1000);
		s2.insertionSort(a5, 0, a5.length);
		assertEquals(true, h1.isItInOrder2(a5, 0, a5.length));
		
		int[]a6= h2.generateReverseOrderedArray(10000);
		s2.insertionSort(a6, 0, a6.length);
		assertEquals(true, h1.isItInOrder2(a6, 0, a6.length));
		
	}
	@Test
	public void QuickSortReverseOrdered() {
		Helper h1 = new Helper();
		QuickSort s1= new QuickSort();
		int[]a= h1.generateReverseOrderedArray(1);
		
		s1.quickSort(a, 0, 1);
		assertEquals(true, h1.isItInOrder2(a, 0, 1));
		
		Helper h2 = new Helper();
		//InsertionSort s2= new InsertionSort();
		int[]a2= h2.generateReverseOrderedArray(2);
		s1.quickSort(a2, 0, 2);
		assertEquals(true, h1.isItInOrder2(a2, 0, 2));
		
		int[]a3= h2.generateReverseOrderedArray(10);
		s1.quickSort(a3, 0, a3.length);
		assertEquals(true, h1.isItInOrder2(a3, 0, 10));
		
		int[]a4= h2.generateReverseOrderedArray(100);
		s1.quickSort(a4, 0, a4.length);
		assertEquals(true, h1.isItInOrder2(a4, 0, 100));
		
		int[]a5= h2.generateReverseOrderedArray(1000);
		s1.quickSort(a5, 0, a5.length);
		assertEquals(true, h1.isItInOrder2(a5, 0, a5.length));
		
		int[]a6= h2.generateReverseOrderedArray(10000);
		s1.quickSort(a6, 0, a6.length);
		assertEquals(true, h1.isItInOrder2(a6, 0, a6.length));
	}
	
	@Test
	public void MergeSortReverseOrdered() {
		
		Helper h1 = new Helper();
		MergeSort s1= new MergeSort();
		int[]a= h1.generateReverseOrderedArray(1);
		
		s1.mergeSort(a, 0, 1);
		assertEquals(true, h1.isItInOrder2(a, 0, 1));
		
		Helper h2 = new Helper();
		//InsertionSort s2= new InsertionSort();
		int[]a2= h2.generateReverseOrderedArray(2);
		s1.mergeSort(a2, 0, 2);
		assertEquals(true, h1.isItInOrder2(a2, 0, 2));
		
		int[]a3= h2.generateReverseOrderedArray(10);
		s1.mergeSort(a3, 0, a3.length);
		assertEquals(true, h1.isItInOrder2(a3, 0, 10));
		
		int[]a4= h2.generateReverseOrderedArray(100);
		s1.mergeSort(a4, 0, a4.length);
		assertEquals(true, h1.isItInOrder2(a4, 0, 100));
		
		int[]a5= h2.generateReverseOrderedArray(1000);
		s1.mergeSort(a5, 0, a5.length);
		assertEquals(true, h1.isItInOrder2(a5, 0, a5.length));
		
		int[]a6= h2.generateReverseOrderedArray(10000);
		s1.mergeSort(a6, 0, a6.length);
		assertEquals(true, h1.isItInOrder2(a6, 0, a6.length));
		
	}
	
	@Test
	public void HeapSortReverseOrdered() {
		
		Helper h1 = new Helper();
		HeapSort s1= new HeapSort();
		int[]a= h1.generateReverseOrderedArray(1);
		
		s1.heapSort(a, 0, 1);
		assertEquals(true, h1.isItInOrder2(a, 0, 1));
		
		Helper h2 = new Helper();
		//InsertionSort s2= new InsertionSort();
		int[]a2= h2.generateReverseOrderedArray(2);
		s1.heapSort(a2, 0, 2);
		assertEquals(true, h1.isItInOrder2(a2, 0, 2));
		
		int[]a3= h2.generateReverseOrderedArray(10);
		s1.heapSort(a3, 0, a3.length);
		assertEquals(true, h1.isItInOrder2(a3, 0, 10));
		
		int[]a4= h2.generateReverseOrderedArray(100);
		s1.heapSort(a4, 0, a4.length);
		assertEquals(true, h1.isItInOrder2(a4, 0, 100));
		
		int[]a5= h2.generateReverseOrderedArray(1000);
		s1.heapSort(a5, 0, a5.length);
		assertEquals(true, h1.isItInOrder2(a5, 0, a5.length));
		
		int[]a6= h2.generateReverseOrderedArray(10000);
		s1.heapSort(a6, 0, a6.length);
		assertEquals(true, h1.isItInOrder2(a6, 0, a6.length));
		
	}
	
	@Test
	public void InsertionSortTime() {
		InsertionSort iS1= new InsertionSort();
		System.out.println();
		iS1.printTimeForReverseOrdered(100);
		iS1.printTimeForReverseOrdered(1000);
		iS1.printTimeForReverseOrdered(10000);
		iS1.printTimeForReverseOrdered(100000);
		//iS1.printTimeForReverseOrdered(1000000);
		//iS1.printTimeForReverseOrdered(10000000);
		
	}
	
	@Test
	public void MergeSortTime() {
		MergeSort iS1= new MergeSort();
		System.out.println();
		iS1.printTimeForReverseOrdered(100);
		iS1.printTimeForReverseOrdered(1000);
		iS1.printTimeForReverseOrdered(10000);
		iS1.printTimeForReverseOrdered(100000);
		//iS1.printTimeForReverseOrdered(1000000);
		//iS1.printTimeForReverseOrdered(10000000);	
	}

	@Test
	public void QuickSortTime() {
		QuickSort iS1= new QuickSort();
		System.out.println();
		iS1.printTimeForReverseOrdered(100);
		iS1.printTimeForReverseOrdered(1000);
		iS1.printTimeForReverseOrdered(10000);
		iS1.printTimeForReverseOrdered(100000);
		//iS1.printTimeForReverseOrdered(1000000);
		//iS1.printTimeForReverseOrdered(10000000);	
	}
	@Test
	public void HeapSortTime() {
		HeapSort iS1= new HeapSort();
		System.out.println();
		iS1.printTimeForReverseOrdered(100);
		iS1.printTimeForReverseOrdered(1000);
		iS1.printTimeForReverseOrdered(10000);
		iS1.printTimeForReverseOrdered(100000);
		//iS1.printTimeForReverseOrdered(1000000);
		//iS1.printTimeForReverseOrdered(10000000);	
	}
}
