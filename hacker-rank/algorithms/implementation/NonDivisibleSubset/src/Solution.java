import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int numberCandidates = scanner.nextInt(); 
        int numberDivisor = scanner.nextInt(); 
        int[] candidates = new int[numberCandidates]; 
        
        for (int index = 0; index < numberCandidates; index++) { 
            candidates[index] = scanner.nextInt(); 
        } 
        
        scanner.close();
        
        int[] remainderCounts = new int[numberDivisor]; 
        
        for (int i = 0; i < numberCandidates; i++) { 
            remainderCounts[candidates[i] % numberDivisor] += 1; 
        } 
        
        int remainderCount = remainderCounts[0] < 1 ? remainderCounts[0] : 1; 
        
        for (int i = 1; i < numberDivisor / 2 + 1; i++) { 
            if (i != numberDivisor - i) {
                remainderCount += 
                    remainderCounts[i] > remainderCounts[numberDivisor - i] ? 
                        remainderCounts[i] : remainderCounts[numberDivisor - i];
            }
        } 
        
        if (numberDivisor % 2 == 0){ 
            remainderCount += 1; 
        } 
        
        System.out.println(remainderCount);      
    }
}