import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {	

	public static Node insert(Node head, int data) {
        
        if (head == null) {
            // List is empty, add node
            head = new Node(data);
        } else {
            if (head.next == null) {
                // If at tail, add new node
                head.next = new Node(data);
            } else {
                // Else find the tail, then add new node
                insert(head.next, data);
            }            
        }
                   
        return head;
    }
public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}