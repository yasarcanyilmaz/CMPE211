package yasarcan;

import java.util.NoSuchElementException;

/**
 * @author yasarcan
 *
 */

public class BST<T extends Comparable<T>> {

	private T data;
	private BST<T> left;
	private BST<T> right;

	public BST(T data, BST<T> left, BST<T>right){
		this.data=data;
		this.left=left;
		this.right=right;
	}

	public BST() {
		// TODO Auto-generated constructor stub
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BST<T> getLeft() {
		return left;
	}

	public void setLeft(BST<T> left) {
		this.left = left;
	}

	public BST<T> getRight() {
		return right;
	}

	public void setRight(BST<T> right) {
		this.right = right;
	}


	//toString is default method to Convert defined BST to string version to able to print it. Order of nodes is : Data, Left Child, Right Child
	//it takes object itself and return string
	//Examples of it will be given as a part of Tests.

	public String toStringVLR(){
		String output="";
		if(getData() !=null){
			output+= "(" + getData() + ")";
		}
		if(getLeft() !=null){
			output += "(" + getLeft().toStringVLR()+")";
		}
		if(getRight() != null){
			output +="("+ getRight().toStringVLR() + ")";
		}
		return output;

	}
	//toString is default method to Convert defined BST to string version to able to print it. Order of nodes is : Left Child, Data, Right Child
	//it takes object itself and return string
	//Examples of it will be given as a part of Tests.
	public String toString(){
		String output="";
		if(getLeft() !=null){
			output += "(" + getLeft().toString()+")";
		}
		if(getData() !=null){
			output+= "(" + getData() + ")";
		}
		if(getRight() != null){
			output +="("+ getRight().toString() + ")";
		}
		return output;
	}
	//search takes BST and and T type parameter and return true if toFind exists in the BST otherwise false.
	//search :(BST,toFind) -> boolean
	public boolean search(BST<T> t,T toFind){
		if(t == null){
			return false;
		}
		else {
			if(t.data == toFind){
				return true;
			}
			else{
				if(t.data.compareTo(toFind) < 0){
					return search(t.right,toFind);
				}
				else {
					return search(t.left,toFind);
				}
			}
		}
	}
	//insert is method which takes a BST and an object and adds object to right places in the BST.
	//insert : BST, object -> BST
	public BST<T> insert(BST<T> bst, T toInsert) throws Exception{
		if(getData() == null){
			return new BST<T>(toInsert,null,null);
		}
		else if(getData() == toInsert) {
			throw new Exception();
		}
		else if(toInsert.compareTo(bst.getData()) < 0){
			setLeft(insert(bst, toInsert));
		}
		else {
			setRight(insert(bst, toInsert));
		}
		return bst;	
	}
	//deleteLeftMost is method which takes a BST and returns a BST with deleted version of LeftMost Node.
	//deleteLeftMost : BST, object -> BST
	public BST<T> deleteLeftMost(BST<T> bst) throws Exception{
		if(bst == null){
			throw new Exception();
		}
		else if (bst.getLeft() == null){
			return bst.getRight();
		}
		else
			return new BST<T>(bst.getData(), deleteLeftMost(bst.getLeft()), bst.getRight());
	}
	//deleteRoot is a method which takes a BST and returns a BST which root is deleted.
	//deleteRoot : BST -> BST
	public BST<T> deleteRoot(BST<T> bst) throws Exception{
		if (bst == null){
			throw new Exception();
		}
		else if (bst.getLeft() == null){
			return bst.getRight();
		}
		else if (bst.getRight() == null){
			return bst.getLeft();
		}
		else
			return new BST<T>(leftMost(bst.getRight()), bst.getLeft(), deleteLeftMost(bst.getRight()));
	}
	//leftMost is a method which takes a BST and return leftMost node's value.
	//leftMost: BST -> object
	public T leftMost(BST<T> bst) {
		if(bst == null){
			throw new NoSuchElementException();
		}
		else if(bst.getLeft() == null){
			return bst.getData();
		}
		else return leftMost(bst.getLeft());

	}
	/*
	 * //delete is a method which takes a BST and an object and return a BST object deleted.
	 	//delete: BST, object -> BST
	*/
	public BST<T> delete(BST<T> bst, T toDelete) throws Exception{
		if (bst == null){return bst;}
		if  (bst.getData().compareTo(toDelete) < 0){ bst.setLeft(delete(bst.getLeft(),  toDelete)); }
		else if (bst.getData().compareTo(toDelete) > 0) { bst.setRight(delete(bst.getRight(), toDelete));}
		else { 
			if (bst.getRight() == null){return bst.getLeft();}
			if (bst.getLeft()  == null){return bst.getRight();}
			BST<T> tmp = bst;
			bst.setData(leftMost(bst.getRight()));
			bst.setRight(deleteLeftMost(tmp.getRight()));
			bst.setLeft(tmp.getLeft());
		}
		return bst;
	}
	//height is a method which takes a BST and returns height of BST
	//height : BST -> integer
	public int height(BST<T> bst){
		if(bst == null){
			return 0;
		} else {
			return (1 + Math.max( height(bst.getLeft()), height(bst.getRight())));
		}
	}
	//nodeNumber is a method which takes a BST and returns number of nodes in it.
	//nodeNumber : BST -> integer
	public int nodeNumber(BST<T> bst){
		if (bst == null){
			return 0;
		}else {
			return 1 + nodeNumber(bst.getLeft()) + nodeNumber(bst.getRight());
		}
	}
	//isBalanced is a method which takes a BST and checks it is balanced or not
	//isBalances: BST -> boolean
	public boolean isBalanced(BST<T> bst){
		int height = height(bst);
		int numberOfNodes= nodeNumber(bst);
		return height == Math.log10(numberOfNodes+1)/Math.log10(2);
	}

}
