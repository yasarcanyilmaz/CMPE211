package yasarcan;

public interface IFifo {
	
	boolean isEmpty();
	void insert(int toInsert);
	int extract() throws Exception;

}
