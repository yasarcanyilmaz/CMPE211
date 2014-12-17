import static org.junit.Assert.*;

//import java.util.Arrays;

import org.junit.Test;


public class SortTest {

	@Test
	public void testIsItInOrder() {
		Student[]a = new Student[1];
		a[0]= new Student(111, "Yasarcan", "Yilmaz");
		
		Sort s = new Sort();
		assertEquals(true, s.isItInOrder(a, 0, 1) );
	}
	
	@Test
	public void testIsItInOrder2() {
		Student[]a = new Student[2];
		a[0]= new Student(111, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		
		Sort s = new Sort();
		assertEquals(true, s.isItInOrder(a, 0, a.length) );
		
		Student[]b = new Student[2];
		b[0]= new Student(113, "Yasarcan", "Yilmaz");
		b[1]= new Student(112, "Y", "A");
		assertEquals(false, s.isItInOrder(b, 0, b.length) );
		
	}
	
	@Test
	public void testIsItInOrder3() {
		Student[]a = new Student[3];
		a[0]= new Student(111, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		a[2]= new Student(110, "Y", "A");
		
		Sort s = new Sort();
		assertEquals(false, s.isItInOrder(a, 0, a.length) );
	}
	
	@Test
	public void testIsItInOrder4() {
		Student[]a = new Student[4];
		a[0]= new Student(111, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		a[2]= new Student(110, "Y", "A");
		a[3]= new Student(111, "a", "b");
		
		Sort s = new Sort();
		assertEquals(false, s.isItInOrder(a, 0, a.length) );
	}
	

	@Test
	public void testPutInOrder() {
		Sort s= new Sort();
		Student[]a = new Student[1];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		//a[1]= new Student(112, "Y", "A");
		//a[2]= new Student(110, "Y", "A");
		//a[3]= new Student(111, "a", "b");
		s.iSort(a);
		
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	}
	
	@Test
	public void testPutInOrder2() {
		Sort s= new Sort();
		Student[]a = new Student[2];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		//a[2]= new Student(110, "Y", "A");
		//a[3]= new Student(111, "a", "b");
		s.iSort(a);
		//s.qSort(a, 0, a.length);
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	}
	
	@Test
	public void testPutInOrder3() {
		Sort s= new Sort();
		Student[]a = new Student[4];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		a[2]= new Student(110, "Y", "A");
		a[3]= new Student(111, "a", "b");
		s.iSort(a);
		
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	}
	

	@Test
	public void testQSort() {
		Sort s= new Sort();
		Student[]a = new Student[1];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		//a[1]= new Student(112, "Y", "A");
		//a[2]= new Student(110, "Y", "A");
		//a[3]= new Student(111, "a", "b");
		s.qSort(a, 0, a.length);
		
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	
	}
	
	@Test
	public void testQSort2() {
		Sort s= new Sort();
		Student[]a = new Student[4];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		a[2]= new Student(110, "Y", "A");
		a[3]= new Student(111, "a", "b");
		//s.iSort(a);
		s.qSort(a, 0, a.length);
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	}
	
	@Test
	public void testQSort3() {
		Sort s= new Sort();
		Student[]a = new Student[10];
		a[0]= new Student(113, "Yasarcan", "Yilmaz");
		a[1]= new Student(112, "Y", "A");
		a[2]= new Student(110, "Y", "A");
		a[3]= new Student(111, "a", "b");
		a[4]= new Student(109, "a", "b");
		a[5]= new Student(108, "a", "b");
		a[6]= new Student(107, "a", "b");
		a[7]= new Student(106, "a", "b");
		a[8]= new Student(105, "a", "b");
		a[9]= new Student(104, "a", "b");
		
		s.qSort(a, 0, a.length);
		assertEquals(true, s.isItInOrder(a, 0, a.length));
	}
	
	

}
