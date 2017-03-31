import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * This code is only partially correct as it only passes several of the test cases.
 * The other test cases depend on finding a solution that runs quicker than O(n^2).
 */

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            System.out.println(findUniqueSubs(s, left, right));
        }
    }
    
    public static int findUniqueSubs(String s, int begin, int end)
    {
        HashMap<String, Integer> uniqueSubstrings = new HashMap<String, Integer>();
        int totalSubstrings = 0;
        
        for (int a = begin; a <= end; a++) {
            for (int b = end; b >= a; b--) {
                if (uniqueSubstrings.containsKey(s.substring(a,b+1))) {
                    uniqueSubstrings.replace(s.substring(a,b+1), uniqueSubstrings.get(s.substring(a,b+1)));
                } else {
                    uniqueSubstrings.put(s.substring(a,b+1), 1);
                }
            }
        }
        
        for (Integer value : uniqueSubstrings.values()) {
            totalSubstrings += value;
        }
        
        return totalSubstrings;
    }
}
