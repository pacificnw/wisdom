import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String infiniteString = scanner.next();
        long numberLetters = scanner.nextLong();
        long stringLength = infiniteString.length();
        long numberStringA = 0;
        long totalStringA = 0;
        
        // Count occurence of 'a' in input
        char[] characters = infiniteString.toCharArray();
        
        for (int index = 0; index < characters.length; index++) {
            if (characters[index] == 'a') {
                numberStringA++;
            }
        }
        
        long numberRepititions = numberLetters / characters.length;
        long numberCharactersRemaining = numberLetters % characters.length;
        
        totalStringA += numberRepititions * numberStringA;
        
        for (int index = 0; index < numberCharactersRemaining; index++) {
            if (characters[index] == 'a') {
                totalStringA++;
            }
        }
        
        System.out.println(totalStringA);
    }
}
