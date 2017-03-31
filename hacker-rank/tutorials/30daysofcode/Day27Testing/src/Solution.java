import java.util.*;
import java.util.concurrent.*;

public class Solution {

    public static void main(String[] args) {
        
        HashSet<Integer> numberStudentSet = new HashSet<Integer>();
        int totalStudents;
        int numberStudents = 0;
        int countStudent;
        int cancelationThreshold;
        int arrivalTime;
        boolean cancel = true;
        int factor;
        
        System.out.print(5);
        
        for (int testCase = 0; testCase < 5; testCase++) {
            
            System.out.print("\n");
            
            boolean variant = true;
            while (variant) { 
                totalStudents = numberStudents = ThreadLocalRandom.current().nextInt(6, 200);
                if (!numberStudentSet.contains(numberStudents)) {
                    numberStudentSet.add(numberStudents);
                    variant=false;
                }
            }
            
            countStudent = 0;
            cancelationThreshold = ThreadLocalRandom.current().nextInt(3, numberStudents);
            
            System.out.println(numberStudents + " " + cancelationThreshold);
            
            // Ensure that at least one negative, one zero, and one positive
            
            System.out.print(ThreadLocalRandom.current().nextInt(-1000, -1));
            System.out.print(" " + 0);
            System.out.print(" " + ThreadLocalRandom.current().nextInt(1, 1000));
            
            countStudent += 3;
            
            if (!cancel) {
                
                while (countStudent <= cancelationThreshold) {
                    System.out.print(" " + -1 * ThreadLocalRandom.current().nextInt(0, 1000));
                    countStudent++;
                }

                while (countStudent < numberStudents) {
                    System.out.print(" " + ThreadLocalRandom.current().nextInt(0, 1000));
                    countStudent++;
                }
                
            } else {

                while (countStudent < numberStudents) {
                    System.out.print(" " + ThreadLocalRandom.current().nextInt(0, 1000));
                    countStudent++;
                }                
            }
            
            cancel = !cancel;
            numberStudentSet.clear();
        }
    }
}