/*
 * Binary Search : 
 * 	Assume input is an ordered list.
 *  Start halfway in collection, compare values, then concentrate on either left/right
 *  half and recursively iterate over each smaller half until found.
 *
 * Asymptotic Analysis - 
 * Best : Ω(1) : (1) 
 * 	The first element searched is the one found
 * Average : Θ(log n) : n + n/2 + n/4 ... 
 * 	Each iteration will be half the elements of the prior
 * Worst : O(log n) : n + n/2 + n/4 ...
 * 	Even at worst, it's still a consideration of half the elements of the prior
 */

public class BinarySearch extends Search {
	
	public BinarySearch(int[] sortedIntegerArray) {
		super(sortedIntegerArray);
	}
	
	public String searchMethod() {
		return "Binary Search";
	}	
	
	private int binarySearch(int leftMin, int rightMax) {
		int searchIndex = 0;
		
		if (leftMin != rightMax) {
			
			int leftMax = leftMin + (rightMax - leftMin) / 2;
			int rightMin = leftMax + 1;
			int comparisonElement = searchElements[leftMax];
			
			if (searchValue == comparisonElement)
			{
				searchIndex = leftMax;
			} else if (searchValue < comparisonElement) {
				searchIndex = binarySearch(leftMin, leftMax);
			} else {
				searchIndex = binarySearch(rightMin, rightMax);
			}
		} else { 
			if (searchElements[leftMin] == searchValue) {
				searchIndex = leftMin;
			} else {
				searchIndex = searchFailure;
			}
		}

		return searchIndex;
	}
	
	public int searchForValue(int value) {
		searchValue = value;
		
		return binarySearch(0, searchElements.length-1);
	}	
}
