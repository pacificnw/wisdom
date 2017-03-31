public class Solution {

	public static void main(String[] arguments) {
		// The challenge has hidden code that runs on the server. This is a stub
	}

    class Node {
    	// Class Node is on the Server    	
        int data;
        Node next;
    }	
	
	boolean hasCycle(Node head) {

	    Node slow = head;
	    Node fast = head;
	    
	    /*
	    * Based upon Floyd Cycle Detection
	    * Two pointers iterate over the list at different speeds.
	    * If a loop is present, both pointers will eventually meet.
	    */    
	    
	    while (slow != null && fast != null && fast.next != null) {
	    
	        slow = slow.next;
	        fast = fast.next.next;
	        
	        if (slow == fast) {
	            return true;
	        }
	    }
	    
	    return false;
	}
}
