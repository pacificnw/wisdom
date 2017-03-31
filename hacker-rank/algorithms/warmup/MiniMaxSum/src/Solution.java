import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    
        ArrayList<BigInteger> collection = new ArrayList<BigInteger>();
        
        BigInteger minimumValue = new BigInteger("1");
        BigInteger maximumValue = new BigInteger("1000000000");
        BigInteger minimumSum = new BigInteger("0");
        BigInteger maximumSum = new BigInteger("0");
        
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger c = in.nextBigInteger();
        BigInteger d = in.nextBigInteger();
        BigInteger e = in.nextBigInteger();
        
        collection.add(a);
        collection.add(b);
        collection.add(c);
        collection.add(d);
        collection.add(e);
        
        Collections.sort(collection);
        
        System.out.println(Solution.minimumValue(collection) + " " + Solution.maximumValue(collection));
    }
    
    public static String minimumValue(ArrayList<BigInteger> sortedCollection){
        BigInteger minimumValue = new BigInteger("0");
        int index = 0;
        
        for (BigInteger element : sortedCollection){
            if (index < 4){
                minimumValue = minimumValue.add(element);
            }
            index++;
        }
        
        return minimumValue.toString();
    }
    
    public static String maximumValue(ArrayList<BigInteger> sortedCollection){
        BigInteger maximumValue = new BigInteger("0");
        int index = 0;
        
        for (BigInteger element : sortedCollection){
            if (index > 0){
                maximumValue = maximumValue.add(element);
            }
            index++;
        }
        
        return maximumValue.toString();
    }
}
