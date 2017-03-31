import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        char[] camelCase;
        int wordCount = 1;
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        camelCase = s.toCharArray();
        
        for (char character : camelCase){
            if (character <= 'Z'){
                wordCount++;
            }
        }
        
        in.close();
        
        System.out.println(wordCount);
    }
}