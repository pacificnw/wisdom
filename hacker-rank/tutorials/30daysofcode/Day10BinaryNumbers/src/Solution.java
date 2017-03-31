import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int input = 0;
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
            input = scanner.nextInt();  
        }
        
        System.out.println(
            Solution.getMostConsecutiveOnes(
                Solution.getBinaryIntArray(input)));
        
        scanner.close();
    }
    
    public static char[] getBinaryIntArray(int input){
        return Integer.toBinaryString(input).toCharArray();
    }
    
    public static int getMostConsecutiveOnes(char[] binary){
        int currentCount = 0;
        int maximumCount = 0;
        
        for (char element : binary){
            if (element == '1'){
                currentCount++;
                if (currentCount > maximumCount){
                    maximumCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        
        return maximumCount;
    }
}