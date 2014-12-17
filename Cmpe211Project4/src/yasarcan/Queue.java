package yasarcan;

public class Queue implements IQueue {
	private int[]data;
	private int insertPointer;
	private int extractPointer;
	
	
	public Queue(int size){
		this.data=new int[size];
		this.insertPointer=0;
		this.extractPointer=0;		
	}

	@Override
	public boolean isEmpty() {
		return  getInsertPointer() == getExtractPointer();
	}

	@Override
	public void insert(int toInsert) throws Exception {
		if(isFull()) 
			throw new Exception("Queue is ful!");
			data[getInsertPointer()]=toInsert;
			setInsertPointer(IncrIndex(getInsertPointer()));	
	}

	@Override
	public int extract() throws Exception {
		if (isEmpty()) 
			throw new Exception("Queue is empty!");
		int tmp= data[getExtractPointer()];
		setExtractPointer(IncrIndex(getExtractPointer()));
		return tmp;
	}
	
	public boolean isFull(){
		return getExtractPointer() == IncrIndex(getInsertPointer());
	}

	public int IncrIndex(int num) {
		return (num+1) % getData().length;
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

	public int getExtractPointer() {
		return extractPointer;
	}

	public void setExtractPointer(int extractPointer) {
		this.extractPointer = extractPointer;
	}

}
