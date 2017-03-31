import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        BigInteger summationMultiplesOf3;
        BigInteger summationMultiplesOf5;
        BigInteger summationMultiplesOf15;
        BigInteger summationMultiples;
        
        for(int a0 = 0; a0 < t; a0++){
            BigInteger n = in.nextBigInteger();
        
            // Consider the multiples of 3
            
            summationMultiplesOf3 = 
                Solution.getMultipleSummation(
                    n,
                    Solution.getHighestMultiple(n, new BigInteger("3")),
                    new BigInteger("3"));
            
            // Consider the multiples of 5
            summationMultiplesOf5 = 
                Solution.getMultipleSummation(
                    n,
                    Solution.getHighestMultiple(n, new BigInteger("5")),
                    new BigInteger("5"));
                        
            // Remove the over lap from multiples of 15
            summationMultiplesOf15 = 
                Solution.getMultipleSummation(
                    n,
                    Solution.getHighestMultiple(n, new BigInteger("15")),
                    new BigInteger("15"));            
            
            summationMultiples = summationMultiplesOf3.add(summationMultiplesOf5.subtract(summationMultiplesOf15));

            // Convert the double values back to int
            System.out.println(summationMultiples.toString());
            
        }

        in.close();
    }
    
    public static BigInteger getHighestMultiple(BigInteger number, BigInteger multiple){
        // This finds the highest pure multiple of given number
        BigInteger remainder = new BigInteger("0");
        
        remainder = number.mod(multiple);

        return number.subtract(remainder);
    }
    
    public static BigInteger getMultipleSummation(BigInteger original, BigInteger number, BigInteger multiple){
        BigInteger multipleSum = new BigInteger("0");
        
        // If the new number equals the original, we can not count it, so decrement by multiple
        if (number.compareTo(original) == 0){
            
            if (number.subtract(multiple).compareTo(new BigInteger("0")) >= 0){
                number = number.subtract(multiple);
            } else {
                number = new BigInteger("0");
            }
        }
        
        if (number.compareTo(multiple) >= 0){
        
            BigInteger numberTerms = number.divide(multiple);
            multipleSum = numberTerms.multiply(multiple.add(number)).divide(new BigInteger("2"));
        }
        
        return multipleSum;
    }
}
