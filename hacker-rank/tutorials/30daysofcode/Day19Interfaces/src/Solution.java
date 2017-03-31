import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    
    public Calculator() {
        
    }
    
    public int divisorSum(int n) {
        int sum = 0;
        
        for (int index = 1; index <= n; index++) {
            if (n % index == 0) {
                sum += index;
            }
        }
        return sum;
    }
}