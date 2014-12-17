package yasarcan;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() throws Exception {
		LinkedListofInt l1= new LinkedListofInt(1,null);
		assertEquals("(1)", l1.toString());
		LinkedListofInt l2= new LinkedListofInt(2, new LinkedListofInt(3, null));
		assertEquals("(2(3))", l2.toString());
		LinkedListofInt l3= new LinkedListofInt(1,l2);
		assertEquals("(1(2(3)))", l3.toString());
		assertEquals(1, l1.getFirst());
		assertEquals(2, l2.getFirst());
		assertEquals(1, l3.getFirst());
		
		LinkedListOfString s1= new LinkedListOfString();
		assertEquals("(null)", s1.toString());
		s1.setFirst("1");
		assertEquals("(1)", s1.toString());
		s1.setRest(new LinkedListOfString("a", null));
		assertEquals("(1(a))", s1.toString());
	}

}
