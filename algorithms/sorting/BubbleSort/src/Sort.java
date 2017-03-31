import java.text.*;
import java.util.*;

public abstract class Sort {

	protected int numberSortingOperations;
	protected int numberOfElements;
	protected int[] elementsToBeSorted;
	
	public Sort(int[] elements) {
		
		elementsToBeSorted = elements;
		numberOfElements = elements.length;
	}
	
	public abstract int[] doSort();
	public abstract String sortMethod();
	
	public static String withCommas(Object item) {

		return NumberFormat.getNumberInstance(Locale.US).format(item);
	}

	public static void timedHeader() {

		System.out.format("%18s%2s%20s", 
				"Sort Operations",
				"|",
				"Elapsed Time");
		System.out.print("\n");
		System.out.format("%18s%2s%20s", 
				"------------------",
				"-|",
				"--------------------");		
		System.out.print("\n");
	}	
	
	public void doTimedSort() {
		
		long timeBegin;
		
		timedHeader();		
		timeBegin = System.nanoTime();
		this.doSort();
		
		System.out.format("%18s%2s%20s",  
				withCommas(this.numberSortingOperations), " |",
				withCommas(System.nanoTime() - timeBegin) + " ns\n\n");
		System.out.print("\n");
	}	
	
	public void showElements(int elementsToShow) {
		int count = 0;
		System.out.print("[");
		for (int element : elementsToBeSorted) {
			if (count < elementsToShow && count < 25){
				System.out.print(" " + element);	
			} else {
				System.out.print(" ...");
				break;
			}
			count++;
		}
		System.out.println(" ]\n\n");
	}
}
