import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	
	/*
	 * Basic idea here is to use two HashMaps to track our letters and their counts.
	 * If you find a match, decrement count in first list. If not, add to second list.
	 * If the count in the first list ever gets to zero, remove it.
	 * Sum up the counts at the end.
	 * The running time complexity of this should be O(n+c) ~ O(n). It'll do a comparison for each n.
	 */
    public static int numberNeeded(String first, String second) {
        
        int charactersRemoved = 0;
        
        HashMap<String, Integer> firstMap = new HashMap<String, Integer>();
        HashMap<String, Integer> secondMap = new HashMap<String, Integer>();
        
        for (char character : first.toCharArray()) {
            
            String letter = Character.toString(character);
            
            if (firstMap.containsKey(letter)) {
                firstMap.replace(letter, firstMap.get(letter) + 1 );
            } else {
                firstMap.put(letter, 1);
            }
        }
        
        for (char character : second.toCharArray()) {
            
            String letter = Character.toString(character);
            
            if (firstMap.containsKey(letter)) {
                if (firstMap.get(letter) - 1 == 0) {
                    // If we are down to 0, remove it from the List
                    firstMap.remove(letter);
                } else {
                    // Otherwise, simply decrement it
                    firstMap.replace(letter,firstMap.get(letter) - 1);
                }
            } else {
                if (secondMap.containsKey(letter)) {
                    // In second list, increase count
                    secondMap.replace(letter, secondMap.get(letter) + 1);
                } else {
                    // Not in list, insert it
                    secondMap.put(letter, 1);
                }
            }
        }

        for (Integer letterCount : firstMap.values()) {
            charactersRemoved += letterCount;
        }
        
        for (Integer letterCount : secondMap.values()) {
            charactersRemoved += letterCount;
        }
        
        return charactersRemoved;
    }
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringBase = scanner.next();
        String stringCompare = scanner.next();
        System.out.println(numberNeeded(stringBase, stringCompare));
    }
}