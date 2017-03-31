import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int primeCandidate;
        
        scanner.nextInt();
        
        while (scanner.hasNextInt()) {
            primeCandidate = scanner.nextInt();
            
            Prime prime = new Prime(primeCandidate);
            
            System.out.println(prime.isPrimeSquareRootBased());
        }
        
        scanner.close();
    }
}