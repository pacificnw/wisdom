import java.util.*;
import java.io.*;

class Calculator {
    
    public int answer;
    
    public Calculator() {
        answer = 0;
    }
    
    public int power(int base, int exponent) throws NegativeValueException {
        if (base < 0) {
            throw new BaseNegativeException();
        } else if (exponent < 0) {
            throw new ExponentNegativeException();
        } else {
            answer = (int)Math.pow(base, exponent);            
        }
        
        return answer;
    }
    
    class NegativeValueException extends Exception {
        
        public NegativeValueException() {
            
        }

    }

    class ExponentNegativeException extends NegativeValueException {
        
        public ExponentNegativeException() {
            super();
        }
        
        public String getMessage() {
            return "n and p should be non-negative";
        }
    }

    class BaseNegativeException extends NegativeValueException {
        
        public BaseNegativeException() {
            super();
        }
        public String getMessage() {
            return "n and p should be non-negative";
        }    
    }    
    
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

