package yasarcan;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTTest {

	@Test
	public void PrinttestAndBalance() {
		BST<String> bst =new BST<String>(null,null,null);
		BST<String> bst1 =new BST<String>("a", null,null);
		BST<String> bst2 =new BST<String>("b", null,null);
		BST<String> bst3 =new BST<String>("c", null,null);
		BST<String> bst4 =new BST<String>("d", null,null);
		BST<String> bst5 =new BST<String>("ç", null,null);
		assertEquals("", bst.toString());
		assertEquals("", bst.toStringVLR());
		assertTrue(bst.isBalanced(bst));
		assertEquals("(a)", bst1.toString());
		assertEquals("(a)", bst1.toStringVLR());
		bst1.setLeft(bst2);
		assertFalse(bst.isBalanced(bst1));
		assertEquals("((b))(a)", bst1.toString());
		assertEquals("(a)((b))", bst1.toStringVLR());
		bst1.setRight(bst3);
		assertTrue(bst.isBalanced(bst1));
		assertEquals("((b))(a)((c))", bst1.toString());
		assertEquals("(a)((b))((c))", bst1.toStringVLR());
		bst3.setLeft(bst5);
		assertFalse(bst.isBalanced(bst1));
		assertEquals("((b))(a)(((ç))(c))", bst1.toString());
		assertEquals("(a)((b))((c)((ç)))", bst1.toStringVLR());
		bst3.setRight(bst4);
		assertFalse(bst.isBalanced(bst1));
		assertEquals("((b))(a)(((ç))(c)((d)))", bst1.toString());	
		assertEquals("(a)((b))((c)((ç))((d)))", bst1.toStringVLR());
	}
	@Test
	public void Height() {
		BST<String> bst =new BST<String>("y",null,null);

		assertEquals(1,bst.height(bst));
		BST<String> bst1 =new BST<String>("a", null,null);
		bst.setLeft(bst1);
		assertEquals(2,bst.height(bst));
		BST<String> bst2 =new BST<String>("b", null,null);
		bst1.setLeft(bst2);
		assertEquals(3,bst.height(bst));
		BST<String> bst3 =new BST<String>("c", null,null);
		bst1.setRight(bst3);
		assertEquals(3,bst.height(bst));
		BST<String> bst4 =new BST<String>("d", null,null);
		bst.setRight(bst4);
		assertEquals(3,bst.height(bst));
		BST<String> bst5 =new BST<String>("ç", null,null);
		bst2.setRight(bst5);
		assertEquals(4,bst.height(bst));

		//System.out.print(bst);

	}
	@Test 
	public void LeftMostAndDeleteLeftMost(){
		BST<String> bst =new BST<String>("y",null,null);

		assertEquals("y",bst.leftMost(bst));
		BST<String> bst1 =new BST<String>("a", null,null);
		bst.setLeft(bst1);
		assertEquals("a",bst.leftMost(bst));
		BST<String> bst2 =new BST<String>("b", null,null);
		bst1.setLeft(bst2);
		assertEquals("b",bst.leftMost(bst));
		BST<String> bst3 =new BST<String>("c", null,null);
		bst1.setRight(bst3);
		assertEquals("b",bst.leftMost(bst));
		BST<String> bst4 =new BST<String>("d", null,null);
		bst.setRight(bst4);
		assertEquals("b",bst.leftMost(bst));
		BST<String> bst5 =new BST<String>("ç", null,null);
		bst2.setRight(bst5);
		assertEquals("b",bst.leftMost(bst));

	}
	@Test
	public void Search() {
		BST<Integer> bst6 =new BST<Integer>(5, null,null);
		assertTrue(bst6.search(bst6,5));
		assertFalse(bst6.search(bst6,10));


		BST<Integer> root= new BST<Integer>(5, 
				new BST<Integer>(3,null,null), 
				new BST<Integer>(7,null,null)
				);
		assertTrue(root.search(root, 5));
		assertTrue(root.search(root, 3));
		assertTrue(root.search(root, 7));
		assertFalse(root.search(root, 10));

		BST<Integer> bst =new BST<Integer>(5,null,null);
		bst.setLeft(new BST<Integer>(3,
				new BST<Integer>(2,null,null),
				new BST<Integer>(4,null,null)));

		assertTrue(bst.search(bst, 2));
		assertTrue(bst.search(bst, 4));
		assertTrue(bst.search(bst, 3));
	}
	@Test
	public void Insert() throws Exception{
		BST<Integer> bst6=new BST<Integer>(null,null,null);
		//	bst6.insert(bst6,6);
		//	assertEquals("(6)",bst6.toString());
		bst6.insert(bst6, 5);
		//	assertEquals("((5)(6)", bst6.toString());
		//	bst6.insert(bst6,7);
		//	assertEquals("((5))(6)((7))",bst6.toString());
	}
	/*
	@Test
	public void Delete() throws Exception{
		BST<Integer> bst6=new BST<Integer>(null,null,null);
		bst6.deleteRoot(bst6);
		bst6.insert(bst6, 5);
		assertEquals("((5)(6)", bst6.toString());

	}
	 */
	
	@Test
	public void Balanced(){

		//Tests are given in the first of part test.

	}

	@Test 
	public void DeleteRoot(){

	}




}
