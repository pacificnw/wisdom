import java.util.*;
import java.util.concurrent.*;
import java.text.*;

public class Solution {

	public static int nextRandom(int currentValue, int numberElements) {
		
		return ThreadLocalRandom.current().nextInt(currentValue, numberElements - currentValue);
	}
	
	public static String withCommas(Object item) {

		return NumberFormat.getNumberInstance(Locale.US).format(item);
	}
	
	public static void timedHeader() {
		System.out.format("%14s%14s%16s", 
				"Found At", 
				"Search Value",
				"Elapsed Time\n");
	}
	
	public static void timedSearch(Search searchObject, int searchValue) {
		
		long timeBegin;
		
		timeBegin = System.nanoTime();

		System.out.format("%14s%14s%16s", 
				withCommas(searchObject.searchForValue(searchValue)), 
				withCommas(searchValue),
				withCommas(System.nanoTime() - timeBegin) + " ns\n");		
	}
	
	public static void main(String[] arguments) {
		
		final int numberElements = 10_000_000; // Adjust this based upon your system specifications
		int currentValue = -1 * ( numberElements / 2 );		
		
		int searchValue1 = nextRandom(currentValue, numberElements);
		int searchValue2 = nextRandom(currentValue, numberElements);
		int searchValue3 = nextRandom(currentValue, numberElements);
		int searchValue4 = nextRandom(currentValue, numberElements);
		int searchValue5 = nextRandom(currentValue, numberElements);
		
		int[] elements = new int[numberElements];
		
		System.out.println("Adding elements to array ");
		
		for (int index = 0; index < numberElements; index++) {
			currentValue += (int)Math.ceil(Math.random() + Math.random() + Math.random());
			elements[index] = currentValue;
			if (index % 50_000_000 == 0) { System.out.print(" ... " + withCommas(index)); }
		}
		
		System.out.println("\n");
		
		IterativeSearch iterativeSearch = new IterativeSearch(elements);
		
		System.out.println("Number Elements : " + withCommas(iterativeSearch.length()) + " " + iterativeSearch.searchMethod() + " : Complexity O(n)");
		
		timedHeader();
		timedSearch(iterativeSearch, searchValue1);
		timedSearch(iterativeSearch, searchValue2);
		timedSearch(iterativeSearch, searchValue3);
		timedSearch(iterativeSearch, searchValue4);
		timedSearch(iterativeSearch, searchValue5);
		
		BinarySearch binarySearch = new BinarySearch(elements);
		
		System.out.println("\nNumber Elements : " + withCommas(binarySearch.length()) + " " + binarySearch.searchMethod() + " : Complexity O(log(n))");
		
		timedHeader();
		timedSearch(binarySearch, searchValue1);
		timedSearch(binarySearch, searchValue2);
		timedSearch(binarySearch, searchValue3);
		timedSearch(binarySearch, searchValue4);
		timedSearch(binarySearch, searchValue5);
	}
}
