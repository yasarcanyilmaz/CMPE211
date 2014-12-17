package yasarcan;


/**
 * @author yasarcan
 *
 */

public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BST<Integer> bst6 =new BST<Integer>(5, null,null);
		System.out.println(bst6.search(bst6,5));
		BST<Integer> bst7 =new BST<Integer>(null,null,null);
		bst7.setData(10);
		System.out.println(bst7.search(bst7,5));
		

	}

}
