package yasarcan;

public interface ILifo {
	
	boolean isEmpty();
	void insert(int n);
	int extract() throws Exception;

}
