package yasarcan;

public class Lifo implements ILifo {

	private LinkedListofInt Stack;

	@Override
	public boolean isEmpty() {
		return getStack() == null;
	}

	@Override
	public void insert(int n) {
		setStack(new LinkedListofInt(n, getStack()));

	}

	@Override
	public int extract() throws Exception {
		if(isEmpty()){
			throw new Exception("Stack Underflow");
		}
		int tmp=getStack().getFirst();
		setStack(getStack().getRest());
		return tmp;
	}

	public LinkedListofInt getStack() {
		return Stack;
	}

	public void setStack(LinkedListofInt headPointer) {
		this.Stack = headPointer;
	}
	
}
