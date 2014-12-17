package yasarcan;

public class Stack implements IStack {
	private int[]data;
	private int insertPointer;

	public Stack(int size){
		this.data= new int[size+1];
		this.insertPointer=0;	
	}

	@Override
	public boolean isEmpty() {
		return getInsertPointer() == 0;
	}
	

	@Override
	public void insert(int n) throws Exception {
		if(isFull() == true)
			throw new Exception("Stack is full!"); 
		setInsertPointer(getInsertPointer()+1);
		data[getInsertPointer()]=n;
	}

	public boolean isFull() {
		return getInsertPointer() == getData().length-1;
	}

	@Override
	public int extract() throws Exception {
		if (isEmpty())
			throw new Exception("Stack is empty!");
		setInsertPointer(getInsertPointer()-1);
		return getData()[getInsertPointer()+1];
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getInsertPointer() {
		return insertPointer;
	}

	public void setInsertPointer(int insertPointer) {
		this.insertPointer = insertPointer;
	}

}
