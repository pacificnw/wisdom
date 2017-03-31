import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        
        if (scanner.hasNextInt()){
            n = scanner.nextInt();
        }
        
        n = factorial(n);
        
        System.out.println(n);
        
        scanner.close();
    }
    
    public static int factorial(int n){
        int factorial = 1;
        
        if (n > 0){
            factorial = n * factorial(n-1);     
        }
        
        return factorial;
    }
}