import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        String inputTime = "";
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()){
            inputTime = scanner.next();
            
        }
        
        System.out.println(
            Solution.getHour(inputTime) + ":" +
            Solution.getMinute(inputTime) + ":" +
            Solution.getSecond(inputTime));
    }
    
    public static String getHour(String twelveHourTime){
        String hour = "";
        char[] time;
                
        time = twelveHourTime.toCharArray();
        
        if (time[8] == 'P' && time[9] == 'M'){
            if (time[0] == '1' && time[1] == '2'){
                hour = new String( new char[] { time[0], time[1] } );
            } else {
                hour = new String( new char[] { (char)((int)time[0] + 1), (char)((int)time[1] + 2) } ) ; 
            }            
        } else {
            if (time[0] == '1' && time[1] == '2'){
                hour = new String( new char[] { '0', '0' } );
            } else {
                hour = new String( new char[] { time[0], time[1] } );
            }
        }
        
        return hour;
    }
    
    public static String getMinute(String twelveHourTime){
        String minute = "";
        char[] time;
        
        time = twelveHourTime.toCharArray();
        
        minute = new String( new char[] { time[3], time[4] } );
        
        return minute;
    }
    
    public static String getSecond(String twelveHourTime){
        String second = "";
        char[] time;
        
        time = twelveHourTime.toCharArray();
        
        second = new String( new char[] { time[6], time[7] } );
        
        return second;        
    }
}