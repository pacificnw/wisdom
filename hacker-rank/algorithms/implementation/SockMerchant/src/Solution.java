import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        HashMap<Integer,Integer> colorCount = new HashMap<Integer,Integer>();
        Scanner in = new Scanner(System.in);
        int pairs = 0;
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            
            if (colorCount.containsKey(c[c_i])){
                colorCount.replace(c[c_i],colorCount.get(c[c_i])+1);
            } else {
                colorCount.put(c[c_i],1);
            }
        }
        
        for (Integer color : colorCount.keySet()){
            int individualColorCount = colorCount.get(color);
            
            if (individualColorCount % 2 == 0){
                pairs += individualColorCount/2;
            } else {
                pairs += (individualColorCount-1)/2;
            }
        }
        
        System.out.println(pairs);
    }
}