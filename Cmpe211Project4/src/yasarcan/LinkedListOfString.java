package yasarcan;

public class LinkedListOfString {

	private String first;
	private LinkedListOfString rest;

	public LinkedListOfString() {
		this.setFirst(null);
		this.setRest(null);
	}

	public LinkedListOfString(String first, LinkedListOfString rest){
		this.setFirst(first);
		this.setRest(rest);
	}

	public String toString(){
		if(getRest() == null){
			return "("+getFirst()+")";
		} else{
			return "("+getFirst()+""+getRest().toString()+")";
		}
	}


	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public LinkedListOfString getRest() {
		return rest;
	}

	public void setRest(LinkedListOfString rest) {
		this.rest = rest;
	}

}
