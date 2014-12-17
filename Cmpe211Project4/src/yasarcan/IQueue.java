package yasarcan;

public interface IQueue {
	
	boolean isEmpty();
	void insert(int toInsert) throws Exception;
	int extract() throws Exception;

}
