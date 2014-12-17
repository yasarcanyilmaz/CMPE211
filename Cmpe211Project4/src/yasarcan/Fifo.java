package yasarcan;

public class Fifo implements IFifo {
	private LinkedListofInt headPointer;
	private LinkedListofInt endPointer;
	
	public Fifo(){
		this.headPointer=null;
		this.endPointer=null;
	}
	

	@Override
	public boolean isEmpty() {
		return headPointer == null;
	}

	@Override
	public void insert(int toInsert) {
		if(getEndPointer() == null)
		{
			setEndPointer(new LinkedListofInt(toInsert, null));
			setHeadPointer(getEndPointer());
		}else {
			getEndPointer().setRest(new LinkedListofInt(toInsert, null));
			setEndPointer(getEndPointer().getRest());
			
		}
		
	}

	@Override
	public int extract() throws Exception{
		if(getHeadPointer()== null){
			throw new Exception("Queue is empty!");
		}
			int result= getHeadPointer().getFirst();
			setHeadPointer(getHeadPointer().getRest());
		if(getHeadPointer() == null){
			setEndPointer(null);
		}
		return result;
	}

	public LinkedListofInt getHeadPointer() {
		return headPointer;
	}

	public void setHeadPointer(LinkedListofInt headPointer) {
		this.headPointer = headPointer;
	}

	public LinkedListofInt getEndPointer() {
		return endPointer;
	}

	public void setEndPointer(LinkedListofInt endPointer) {
		this.endPointer = endPointer;
	}

}
