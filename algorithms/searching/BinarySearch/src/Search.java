
public abstract class Search {
	protected final int searchFailure = -1;
	protected int[] searchElements;
	protected int searchValue;
	
	public Search(int[] sortedArray) {
		searchElements = sortedArray;
	}
	
	public int length() {
		return searchElements.length;
	}
	
	public abstract String searchMethod();
	public abstract int searchForValue(int value);
}
