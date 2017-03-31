import java.io.*;
import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        
        double totalElements = 0;
        double totalNegElements = 0;
        double totalZeroElements = 0;
        double totalPosElements = 0;
        double currentElement = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextDouble()){
            totalElements = scanner.nextDouble();
            
            if (totalElements > 0){
                
                for (int index = 0; index < totalElements ; index++){

                    if (scanner.hasNextDouble()){
                        currentElement = scanner.nextDouble();
                        
                        if (currentElement < 0){
                            totalNegElements++;
                        } else if (currentElement > 0) {
                            totalPosElements++;
                        } else {
                            totalZeroElements++;
                        }
                    }
                }
                
                DecimalFormat decimalFormat = new DecimalFormat("0.000000");
                
                System.out.println(decimalFormat.format(totalPosElements/totalElements));
                System.out.println(decimalFormat.format(totalNegElements/totalElements));
                System.out.println(decimalFormat.format(totalZeroElements/totalElements));
            }
        }
    }
}