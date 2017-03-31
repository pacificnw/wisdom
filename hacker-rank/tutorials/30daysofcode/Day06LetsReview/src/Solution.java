import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int numTerms = 0;
        char[] currentWord;
        
        StringHelper helper = new StringHelper();
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()){
            
            numTerms = scanner.nextInt();
            
            if (1 <= numTerms && numTerms <= 10){
                
                for (int index=0; index<numTerms; index++){

                    currentWord =  scanner.next().toCharArray();
                    
                    if (2 <= currentWord.length && currentWord.length <= 10000){
                        // Print out the current odd and even terms
                        System.out.println(helper.getEvenString(currentWord) + " " + helper.getOddString(currentWord));            
                    }
                }
            }
        }
    }
    
    public static class StringHelper {
        
        public String getOddString(char[] currentWord){
            String oddString = "";
            int index = 0;

            for (char character : currentWord){
                if (index % 2 != 0){
                    oddString += character;
                }
                index++;
            }

            return oddString;
        }

        public String getEvenString(char[] currentWord){
            String evenString = "";
            int index = 0;

            for (char character : currentWord){
                if (index % 2 == 0){
                    evenString += character;
                }
                index++;
            }
            
            return evenString;
        }
    }
}