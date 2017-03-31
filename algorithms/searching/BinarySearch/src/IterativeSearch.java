
public class IterativeSearch extends Search {

	public IterativeSearch(int[] sortedArray) {
		super(sortedArray);
	}
	
	public String searchMethod() {
		return "Iterative Search";
	}
	
	public int searchForValue(int value) {
		
		boolean itemFound = false;
		int itemIndex = 0;
		searchValue = value;
	
		for (int index = 0; index < searchElements.length; index++) {
		
			if (searchElements[index] == searchValue) {
				itemFound = true;
				itemIndex = index;
				break;
			}
		}
		
		return itemFound ? itemIndex : searchFailure;
	}	
}
