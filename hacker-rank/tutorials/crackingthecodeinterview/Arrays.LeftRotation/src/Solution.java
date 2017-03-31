import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	/*
	 * The trick here is to not move the entire array... just grab
	 * elements off the front and put them on the back - so using a
	 * queue works wonderfully for this implementation.
	 */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        
        int numberElements = scanner.nextInt();
        int numberLeftRotations = scanner.nextInt();

        for(int index = 0; index < numberElements; index++) {
            queue.add(scanner.nextInt());
        }
        
        for (int index = 0; index < numberLeftRotations; index++) {
            queue.add(queue.remove());
        }
        
        int resultCount = 0;
        
        while (queue.peek() != null) {
            
            if (resultCount == 0) { 
                System.out.print(queue.remove()); }
            else { 
                System.out.print(" " + queue.remove()); }
            
            resultCount++;
        }
        
        scanner.close();
    }
}
