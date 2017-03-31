import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int sizeArray = 0;
        int sumArray = 0;
                
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextInt()){
        
            sizeArray = scan.nextInt();
            
            for (int index = 0; index < sizeArray; index++){
                
                sumArray += scan.nextInt();
            }
        }
        
        System.out.println(sumArray);
    }
}