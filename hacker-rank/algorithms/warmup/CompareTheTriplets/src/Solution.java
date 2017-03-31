import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int scoreAlice = 0;
        int scoreBob = 0;
        
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        if (a0 > b0){
            scoreAlice++;
        } else if (b0 > a0) {
            scoreBob++;
        }
        
        if (a1 > b1){
            scoreAlice++;
        } else if (b1 > a1) {
            scoreBob++;
        }
        
        if (a2 > b2){
            scoreAlice++;
        } else if (b2 > a2) {
            scoreBob++;
        }
        
        System.out.println(scoreAlice + " " + scoreBob);
    }
}
