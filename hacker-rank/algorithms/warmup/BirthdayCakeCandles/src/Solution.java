import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int candle[] = new int[2];
        
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        for (int candleHeight : height) {
            if (candleHeight > candle[0]) {
                candle[0] = candleHeight;
                candle[1] = 1;
            } else if (candleHeight == candle[0]) {
                candle[1]++;
            }
        }
        
        System.out.println(candle[1]);
    }
}