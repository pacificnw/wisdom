import java.util.concurrent.*;

public class Solution {

	public static int nextRandom(int currentValue, int numberElements) {
		
		return ThreadLocalRandom.current().nextInt(currentValue, numberElements - currentValue);
	}	
	
	public static void main(String[] arguments) {
		
		final int numberElements = 10_000; // Adjust this based upon your system specifications
		int currentValue = -1 * ( numberElements / 2 );		
		int[] collection = new int[numberElements];
		
		for (int index = 0; index < numberElements; index++) {
			collection[index] = nextRandom(currentValue, numberElements);
		}

		BubbleSort bubble = new BubbleSort(collection);
		
		bubble.showElements(15);
		bubble.doTimedSort();
		bubble.showElements(15);
	}
}
