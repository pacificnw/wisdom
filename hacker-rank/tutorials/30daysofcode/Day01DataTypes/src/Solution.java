import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */
        int inputInt = 0;
        double inputDouble = 0.0;
        String inputString = "";

        /* Read and save an integer, double, and String to your variables.*/
        if (scan.hasNextInt())
        {
            inputInt = scan.nextInt();
        }

        if (scan.hasNextDouble())
        {
            inputDouble = scan.nextDouble();
        }
        
        while (scan.hasNext())
        {
            inputString += " " + scan.next();    
        }

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + inputInt);

        /* Print the sum of the double variables on a new line. */
		System.out.println(d + inputDouble);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s.trim() + inputString);

        scan.close();
    }
}
