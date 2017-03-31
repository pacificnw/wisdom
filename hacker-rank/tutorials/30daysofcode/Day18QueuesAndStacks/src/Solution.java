import java.io.*;
import java.util.*;

public class Solution {
    
    private LinkedList<Object> queue;
    private LinkedList<Object> stack;
    
    public Solution() {
        queue = new LinkedList<Object>();
        stack = new LinkedList<Object>();
    }
    
    public void pushCharacter(char element) {
        if (element != '\0') {
            stack.addLast(element);
        }    
    }
    
    public void enqueueCharacter(char element) {
        if (element != '\0') {
            queue.addLast(element);
        }
    }
    
    public char popCharacter() {
        char element = '\0';
        
        if(stack.peekLast() != null) {
            element = (char)stack.removeLast();
        }
        
        return element;
    }
    
    public char dequeueCharacter() {
        char element = '\0';
        
        if(queue.peekFirst() != null) {
            element = (char)queue.removeFirst();
        }
        
        return element;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}    
