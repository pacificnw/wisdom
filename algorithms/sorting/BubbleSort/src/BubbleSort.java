/*
 * Bubble Sort : 
 * 	Iterates over list, swapping adjacent elements if in decreasing order
 *
 * Asymptotic Analysis - 
 * Best : Ω(n) : n * (1) 
 * 	Array is already sorted, iterate n elements (single pass)
 * Average : Θ(n^2) : n * (n - 1) = n^2 - n = n^2
 * 	Array is randomly sorted, iterate n elements, for each n compare to n-1 elements
 * Worst : O(n^2) : n * (n - 1) = n^2 - n = n^2 
 * 	Array is reverse sorted, iterate n elements, for each n compare to n-1 elements
 */

public class BubbleSort extends Sort {

	private int numberOfSwaps;

	public BubbleSort(int[] elements) {
		super(elements);
	}
	
	public String sortMethod() {
		return "Bubble Sort";
	}	
	
	public int[] doSort() {
        
		int swapValue = 0;
        
        for (int i = 0; i < numberOfElements; i++) {
            
            for (int j = 0; j < numberOfElements - 1; j++) {
                
                // Swap adjacent elements if they are in decreasing order
                if (elementsToBeSorted[j] > elementsToBeSorted[j + 1]) {
                    
                	swapValue = elementsToBeSorted[j];
                    elementsToBeSorted[j] = elementsToBeSorted[j+1];
                    elementsToBeSorted[j+1] = swapValue;
                    
                    numberOfSwaps++;
                    numberSortingOperations++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
		
		return elementsToBeSorted;
	}
}
