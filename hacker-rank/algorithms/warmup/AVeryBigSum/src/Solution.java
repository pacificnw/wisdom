import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        BigInteger sumElements = new BigInteger("0");
        BigInteger curElement = new BigInteger("0");
        
        BigInteger minimum = new BigInteger("0");
        BigInteger maximum = new BigInteger("10000000000");
        
        int numElements = 0;
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
        
            numElements = scanner.nextInt();
            
            if (1 <= numElements && numElements <= 10){
                
                while (scanner.hasNextBigInteger()){
                    
                    curElement = scanner.nextBigInteger();
                    
                    if (minimum.compareTo(curElement) <= 0 && curElement.compareTo(maximum) <= 0){
                        sumElements = sumElements.add(curElement);    
                    }
                }
            }
        }
        System.out.println(sumElements.toString());
    }
}