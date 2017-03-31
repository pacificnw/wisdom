import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int[] sticks;
        int minimum = 0;
        int maximum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        sticks = new int[scanner.nextInt()];
        
        int index = 0;
        sticks[index] = minimum = maximum = scanner.nextInt();
        index++;
        
        while (scanner.hasNextInt()) {
            sticks[index] = scanner.nextInt();
            if (sticks[index] < minimum && sticks[index] != 0) {
                minimum = sticks[index];
            }
            if (sticks[index] > maximum) {
                maximum = sticks[index];
            }            
            index++;
        }
        
        cutSticks(sticks, minimum, maximum);
        
        scanner.close();
    }
    
    public static void cutSticks(int[] sticks, int cutLength, int stickMax) {
        
        int minimum = stickMax;
        int maximum = 0;
        int numberCuts = 0;
        
        if (cutLength != 0) {
            for (int index = 0; index < sticks.length; index++) {
                if (sticks[index] != 0) {
                    sticks[index] -= cutLength;
                    numberCuts++;
                    
                    if (sticks[index] > maximum) {
                        maximum = sticks[index];
                    }
                    
                    if (sticks[index] < minimum && sticks[index] != 0) {
                        minimum = sticks[index];
                    }
                }
            }
            
            System.out.println(numberCuts);
            
            if (maximum > 0) {
                cutSticks(sticks, minimum, maximum);    
            }
        }
    }
}