import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static int maximumHourGlassTotal = -64;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int currentTotal = 0;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
                
        for(int i=0; i < 4; i++){ // columns
            for(int j=0; j < 4; j++){ // rows
                
                currentTotal = (Solution.findHourGlassTotal(arr, i, j));
                                
                if (currentTotal > maximumHourGlassTotal){
                    maximumHourGlassTotal = currentTotal;
                }
            }
        }        
        
        System.out.println(maximumHourGlassTotal);
                                
        in.close();
    }
    
    public static int findHourGlassTotal(int[][] elements, int col, int row){
        int total = 0;

        total = elements[row][col] + elements[row][col+1] + elements[row][col+2] +
                                       elements[row+1][col+1] +
                elements[row+2][col] + elements[row+2][col+1] + elements[row+2][col+2];
        
        return total;
    }
}