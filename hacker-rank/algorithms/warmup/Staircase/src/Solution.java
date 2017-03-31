import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int numStairLevels = 0;
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
            
            numStairLevels = scanner.nextInt();
            
            for (int index=0;index<numStairLevels;index++){
                System.out.println(
                    Solution.getSpaces(index,numStairLevels) + 
                    Solution.getStairs(index,numStairLevels));
            }
        }
    }
    
    public static String getSpaces(int levelStairCase, int totalStairLevels){
        String spaces = "";        
        
        for (int index = 0; index < (totalStairLevels - levelStairCase - 1); index++){
            spaces += " ";
        }
        
        return spaces;
    }
    
    public static String getStairs(int levelStairCase, int totalStairLevels){
        String stairs = "";
        
        for (int index = 0; index <= levelStairCase; index++){
            stairs += "#";
        }
        
        return stairs;
    }
}