import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        BookCheckin actualCheckin = new BookCheckin(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        BookCheckin expectedCheckin = new BookCheckin(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        scanner.close();
        
        actualCheckin.ExpectedCheckin(expectedCheckin);
        
        System.out.println(actualCheckin.feeDue());
    }
}