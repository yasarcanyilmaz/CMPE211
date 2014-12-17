package yasarcan;

public class LinkedListofInt {
	private int first;
	private LinkedListofInt rest;

	public LinkedListofInt(int first,LinkedListofInt rest){
		this.first=first;
		this.rest=rest;
	}
	
	public int getFirst() {
		return first;
	}


	public void setFirst(int first) {
		this.first = first;
	}


	public LinkedListofInt getRest() {
		return rest;
	}


	public void setRest(LinkedListofInt rest) {
		this.rest = rest;
	}
	
	public LinkedListofInt getLinkedListofInt(){
		return this;
	}
	
	public String toString(){
		if(getRest() == null){
			return "("+getFirst()+")";
		} else{
		 return "("+getFirst()+""+getRest().toString()+")";
	}
	}
}
