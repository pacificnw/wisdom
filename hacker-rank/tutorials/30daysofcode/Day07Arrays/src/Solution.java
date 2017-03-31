import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        System.out.println(Solution.printReverseOrder(arr));
    }
    
    public static String printReverseOrder(int[] integers){
        String reversedArray = "";
        
        for (int index = integers.length-1; index >= 0; index--){
            reversedArray += Integer.toString(integers[index]);
            if (index != 0){
                reversedArray += " ";
            }
        }
        
        return reversedArray;
    }
}
