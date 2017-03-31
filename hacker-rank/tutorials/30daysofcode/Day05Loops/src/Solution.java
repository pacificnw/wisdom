import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        if (2 <= n && n <= 20){
            printMultiples(n);
        }
    }
    
    public static void printMultiples(int number){
        for (int index=1; index <= 10; index++){
            System.out.println(number + " x " + index + " = " + number * index);
        }
    }
}