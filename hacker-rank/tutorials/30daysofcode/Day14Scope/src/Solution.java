import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
	
    // Constructor
    public Difference (int[] inputElements) {
        this.elements = inputElements;
        this.maximumDifference = 0;
    }

    public void computeDifference() {

        for (int indexFirst = 0; indexFirst < this.elements.length-1 ; indexFirst++) {
            for (int indexSecond = indexFirst; indexSecond < this.elements.length; indexSecond++) {
            
                int differenceValue = 0;
                differenceValue = Math.abs(this.elements[indexFirst] - this.elements[indexSecond]);
                
                if (differenceValue > this.maximumDifference) {
                    this.maximumDifference = differenceValue;
                }
            }
        }
    }
  	
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}    