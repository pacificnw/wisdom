import java.io.*;
import java.util.*;

public class Solution {

    public static class BubbleSortResult {
        public int numberOfSwaps;
        public int firstValue;
        public int lastValue;
        
        public BubbleSortResult(int[] elements, int swaps) {
            numberOfSwaps = swaps;
            firstValue = elements[0];
            lastValue = elements[elements.length-1];
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int numberOfElements = scanner.nextInt();
        
        int[] elements = new int[numberOfElements];
        
        while (scanner.hasNextInt()) {
            elements[index] = scanner.nextInt();
            index++;
        }
        
        BubbleSortResult result = doBubbleSort(elements, elements.length);
        
        System.out.println("Array is sorted in " + result.numberOfSwaps + " swaps.");
        System.out.println("First Element: " + result.firstValue);
        System.out.println("Last Element: " + result.lastValue);
        
        scanner.close();
    }
    
    public static BubbleSortResult doBubbleSort(int[] a, int n) {
        int aOrig = 0;
        int numberOfSwaps = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - 1; j++) {
                
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    
                    aOrig = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aOrig;
                    
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        BubbleSortResult result = new BubbleSortResult(a, numberOfSwaps);
        return result;
    }    
    
}