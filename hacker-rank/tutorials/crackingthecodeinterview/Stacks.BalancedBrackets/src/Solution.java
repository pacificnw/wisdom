import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        boolean isBalanced = true;
        Stack stack = new Stack();
        char[] elements = expression.toCharArray();
        
        for (int index = 0; index < elements.length; index++) {
            if (elements[index] == '{' || elements[index] == '(' || elements[index] == '[') {
                stack.push(elements[index]);
            } else {
                if (!stack.empty()) {
                    char element = (char)stack.pop();

                    if ((element == '{' && elements[index] == '}') ||
                        (element == '(' && elements[index] == ')') ||
                        (element == '[' && elements[index] == ']')) {
                        // isBalanced = true;
                    } else {
                        isBalanced = false;
                        break;
                    }    
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        
        isBalanced = isBalanced && stack.size() == 0 ? true : false;
        
        return isBalanced;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}