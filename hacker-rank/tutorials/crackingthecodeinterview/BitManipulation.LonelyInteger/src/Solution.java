import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	/*
	 * This solution is based upon the fact that if you constantly exclusive or (XOR)
	 * values with itself you'll get 0 and with 0 you'll get itself. So naturally doing
	 * this will cancel out pairs in sequence.
	 */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int lonelyNumber = 0;
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for (int index = 0; index < a.length; index++) {
            lonelyNumber ^= a[index];
        }
        
        System.out.println(lonelyNumber);
    }
}