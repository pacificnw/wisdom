import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int numberItems = 0;
        int indexAnnaItem = 0;
        int amountCharged = 0;
        int amountActual = 0;
        
        int[] items;
        
        Scanner scanner = new Scanner(System.in);
        
        numberItems = scanner.nextInt();
        indexAnnaItem = scanner.nextInt();
        
        items = new int[numberItems];
        
        for (int i = 0; i < numberItems; i++) {
            items[i] = scanner.nextInt();
        }
        
        amountCharged = scanner.nextInt();
        
        for (int i = 0; i < items.length; i++) {
            if (i != indexAnnaItem) {
                amountActual += items[i];
            }
        }
        
        if (amountActual / 2 == amountCharged) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(amountCharged - amountActual / 2);
        }
        
        scanner.close();
    }
}