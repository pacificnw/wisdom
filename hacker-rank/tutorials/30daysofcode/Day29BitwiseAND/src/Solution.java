import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rangeMaximum;
        int bitwiseMaximum;
        int maximumValue;
        
        scanner.nextInt();
        
        while (scanner.hasNextInt()) {
            maximumValue = 0;
            rangeMaximum = scanner.nextInt();
            bitwiseMaximum = scanner.nextInt();    
            
            for (int a = 1; a < rangeMaximum - 1; a++) {
                for (int b = a + 1; b <= rangeMaximum; b++) {
                    int bitWiseValue = a & b;
                    
                    if (bitWiseValue > maximumValue && bitWiseValue < bitwiseMaximum) {
                        maximumValue = bitWiseValue;
                    }
                }
            }
            
            System.out.println(maximumValue);
        }
        
        scanner.close();
    }
}