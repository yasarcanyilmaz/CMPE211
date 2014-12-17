import static org.junit.Assert.*;

import org.junit.Test;


public class InsertionSortTest {

	@Test
	public void testIsItInOrder() {
		
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(0), 0, 0));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createRandomArray(0), 0, 0));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(1), 0, 1));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createRandomArray(1), 0, 1));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(2), 0, 2));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(4), 0, 4));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(16), 0, 16));
		assertEquals(false, InsertionSort.isItInOrder(
				InsertionSort.createRandomArray(16), 0, 16));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(256), 0, 256));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(512), 0, 512));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.createOrderedArray(1024), 0, 1024));
		assertEquals(false, InsertionSort.isItInOrder(
				InsertionSort.createRandomArray(1024), 0, 1024));
		
		
	}

	@Test
	public void testPutInOrder() {
		
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(0), 0, 0));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(1), 0, 1));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(2), 0, 2));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(4), 0, 4));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(16), 0, 16));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(128), 0, 128));
		assertEquals(true, InsertionSort.isItInOrder(
				InsertionSort.sortRandomArray(256), 0, 256));		
	}
	
	/*
	@Test
	public void timesForOrderedArrays(){
		System.out.println(
		InsertionSort.timeToSort(
				InsertionSort.createOrderedArray(128)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(256)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(512)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(1024)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(2048)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(4096 )));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(8169)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createOrderedArray(16338)));	
	}
	*/
	
	/*
	@Test
	public void timesForRandomArrays(){
		System.out.println(
		InsertionSort.timeToSort(
				InsertionSort.createRandomArray(128)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(256)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(512)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(1024)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(2048)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(4096 )));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(8169)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338*2)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338*4)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338*8)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338*16)));
		System.out.println(
				InsertionSort.timeToSort(
						InsertionSort.createRandomArray(16338*32)));
		
		
		
	}
	*/
}
