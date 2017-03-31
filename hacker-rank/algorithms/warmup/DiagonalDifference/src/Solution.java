import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> rowElements;
        int numRowsCols = 0;
        int sumDiagLeft = 0;
        int sumDiagRight = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
            numRowsCols = scanner.nextInt();
            
            for (int row=0;row<numRowsCols;row++){
            
                rowElements = new ArrayList<Integer>();
                
                for (int col=0;col<numRowsCols;col++){
                    rowElements.add(scanner.nextInt());
                }
                
                // process the row
                sumDiagLeft += rowElements.get(numRowsCols - (numRowsCols - 1 * row));
                sumDiagRight += rowElements.get(numRowsCols - (1 + row));
            }
            
            System.out.println(Math.abs(sumDiagLeft - sumDiagRight));
        }
        
    }
}