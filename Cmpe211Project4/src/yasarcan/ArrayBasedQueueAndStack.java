package yasarcan;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayBasedQueueAndStack {

	@Test (expected=Exception.class)
	public void StackTestExtract() throws Exception {
		
		Stack l= new Stack(10);
	assertEquals(Exception.class,l.extract());
	}
	
	@Test // (expected=ArrayIndexOutOfBoundsException.class)
	public void StackTestEmpty() throws Exception   {
		Stack l= new Stack(2);
		assertEquals(true, l.isEmpty());
		l.insert(1);
		assertEquals(false, l.isFull());
		l.insert(2);
		assertEquals(true, l.isFull());
		
	}
	
	@Test
	public void StackTest() throws Exception{
		Stack l= new Stack(10000);
		assertEquals(true, l.isEmpty());
		l.insert(1);
		assertEquals(1, l.extract());
		assertEquals(true, l.isEmpty());
	//	assertEquals(Exception.class, l.extract());
		l.insert(1);
		assertEquals(false, l.isEmpty());
		l.insert(2);
		l.insert(3);
		assertEquals(false, l.isEmpty());
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert(7);
		assertEquals(7, l.extract());
		l.insert(8);
		assertEquals(8, l.extract());
		assertEquals(6, l.extract());
		assertEquals(5, l.extract());
		assertEquals(4, l.extract());
		assertEquals(3, l.extract());
		assertEquals(2, l.extract());
		assertEquals(1, l.extract());
	//	assertEquals(Exception.class, l.extract());
	}
	
	@Test //(expected=Exception.class)
	public void FifoTest() throws Exception{
		Queue f= new Queue(1000);
		assertEquals(true, f.isEmpty());
		f.insert(1);
		assertEquals(1, f.extract());
		assertEquals(true, f.isEmpty());
		//assertEquals(Exception.class, f.extract());
		assertEquals(true, f.isEmpty());
		f.insert(1);
		assertEquals(false, f.isEmpty());
		f.insert(2);
		assertEquals(false, f.isEmpty());
		f.insert(3);
		assertEquals(false, f.isEmpty());
		f.insert(4);
		assertEquals(false, f.isEmpty());
		f.insert(5);
		assertEquals(false, f.isEmpty());
		assertEquals(1, f.extract());
		assertEquals(2, f.extract());
		assertEquals(false, f.isEmpty());
		assertEquals(3, f.extract());
		assertEquals(false, f.isEmpty());
		assertEquals(4, f.extract());
		assertEquals(5, f.extract());
		assertEquals(true, f.isEmpty());
		//assertEquals(Exception.class, f.extract());
	}
	

}
